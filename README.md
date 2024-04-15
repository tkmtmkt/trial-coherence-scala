trial-coherence-scala
=====================

Build
-----

./gradlew jar


ディレクトリ構成
----------------

### ソースコード

    study-coherence-scala/
    ├─lib/                    自動管理しない外部ライブラリ
    │  └─.gitkeep
    ├─subprojects/            サブプロジェクト
    │  ├─app-data/
    │  │  └─src/
    │  │      ├─main/
    │  │      │  ├─java/
    │  │      │  ├─resources/
    │  │      │  └─scala/
    │  │      └─test/
    │  │          └─scala/
    │  └─app-main/
    │      └─src/
    │          ├─main/
    │          │  ├─java/
    │          │  ├─resources/
    │          │  └─scala/
    │          └─test/
    │              └─scala/
    ├─src/
    │  └─dist/
    │      ├─cache-server.ps1
    │      ├─console.ps1
    │      ├─launch
    │      └─launch.ps1
    ├─.gitignore
    └─README.md


### gradle設定

    study-coherence-scala/
    ├─gradle/
    │  └─wrapper/
    │      ├─gradle-wrapper.jar
    │      └─gradle-wrapper.properties
    ├─build.gradle            ビルド設定
    ├─gradlew                 gradle起動スクリプト（Unix）
    ├─gradlew.bat             gradle起動スクリプト（Windows）
    ├─gradle.properties       gradle環境設定
    └─settings.gradle         マルチプロジェクト設定


参考
----

* [製品情報 - Oracle Coherence](http://www.oracle.com/technetwork/jp/middleware/coherence/overview/index.html)
* [Oracle Coherenceドキュメント・ライブラリ](http://docs.oracle.com/cd/E26853_01/index.htm)
* [coherence-community (Oracle Coherence Community)](https://github.com/coherence-community/)

<!-- vim: set ts=4 sw=4 et: -->
