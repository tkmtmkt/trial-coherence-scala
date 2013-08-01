study-coherence-scala
=====================

Build
-----

./sbtl package-data
./gradlew jar

ディレクトリ構成
----------------

study-coherence-scala/
├─lib/
├─main/
│  └─src/
│      ├─main/
│      │  ├─java/
│      │  ├─resources/
│      │  └─scala/
│      └─test
│          └─scala/
├─src/
│  └─script/
│      ├─cache-server.ps1
│      ├─classworld.conf
│      ├─console.ps1
│      ├─launch
│      └─launch.ps1
├─.gitignore
└─README.md


study-coherence-scala/
├─gradle
│  └─wrapper
│      ├─gradle-wrapper.jar
│      └─gradle-wrapper.properties
├─gradlew
├─gradlew.bat
├─gradle.properties       gradle環境設定
├─build.gradle            ビルド設定
└─settings.gradle         マルチプロジェクト設定


<!-- vim: set ft=markdown ts=4 sw=4 et: -->
