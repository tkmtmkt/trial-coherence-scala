import sbt._
import Keys._

object MyBuild extends Build {

  lazy val root: Project = Project("root", file("."), aggregate = nonRoots)
  lazy val nonRoots = projects.filter(_ != root).map(p => LocalProject(p.id))

  lazy val main = templateProject("main", file("main"))

  def templateProject(nameString: String, path: File) = Project(nameString, path) settings(
    version := "0.1-SNAPSHOT",
    organization := "com.github.tkmtmkt",
    description := "",
    scalaVersion := "2.10.2",
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "com.oracle.coherence" % "coherence" % "3.7.1.7",
      "junit" % "junit" % "4.10" % "test",
      "org.specs2" %% "specs2" % "1.11" % "test",
      "org.mockito" % "mockito-core" % "1.9.0" % "test"
    )
  )
}
