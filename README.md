study-coherence-scala
=====================

Build
-----

./sbtl package-data
./gradlew jar

ディレクトリ構成
----------------

study-coherence-scala/
├─gradle/
│  └─wrapper/
│      ├─gradle-wrapper.jar
│      └─gradle-wrapper.properties
├─lib/
├─main/
│  └─src/
│      ├─main/
│      │  ├─java/
│      │  ├─resources/
│      │  └─scala/
│      └─test
│          └─scala/
├─project/
│  ├─build.properties
│  ├─Build.scala
│  └─Package.scala
├─sbt/
│  ├─sbt-launch.jar
│  └─sbt.boot.properties
├─src/
│  └─script/
│      ├─cache-server.ps1
│      ├─classworld.conf
│      ├─console.ps1
│      ├─launch
│      └─launch.ps1
├─.gitignore
├─gradlew
├─gradlew.bat
├─README.md
├─sbtl
└─sbtl.bat


<!-- vim: set ft=markdown ts=4 sw=4 et: -->
