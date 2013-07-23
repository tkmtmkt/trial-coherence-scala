import sbt._
import Keys._

object ProjectBuild extends Build
{
  override lazy val settings = super.settings ++
    Seq(
      version := "0.1-SNAPSHOT",
      organization := "com.github.tkmtmkt",
      description := "",
      scalaVersion := "2.10.2",
      scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked"),
      resolvers += Resolver.mavenLocal,
      libraryDependencies ++= Seq(
        "junit" % "junit" % "4.10" % "test",
        "org.specs2" %% "specs2" % "1.11" % "test",
        "org.mockito" % "mockito-core" % "1.9.0" % "test"
      )
    )

  lazy val nonRoots = projects.filter(_ != root).map(p => LocalProject(p.id))
  lazy val root: Project = Project("root", file("."), aggregate = nonRoots)

  lazy val main = Project("main", file("main"), settings = Defaults.defaultSettings ++
    Seq(PackageTask.packageDistTask) ++
    PackageTask.distSettings ++
    Seq(
      libraryDependencies ++= Seq(
        "org.codehaus.plexus" % "plexus-classworlds" % "2.4",
        "com.oracle.coherence" % "coherence" % "3.7.1.7"
      )
    )
  )
}
