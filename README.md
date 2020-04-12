# POC: Gradle Native

It demonstrates how to use Gradle (with Kotlin DSL) to manage dependencies of a native project.

There is a library named `reverse-lib` (C++) which is used by the `reverse-app` (C) as a transitive dependency.

## How to run

| Description | Command |
| :--- | :--- |
| Compile the library | `./gradlew :reverse-lib:build` |
| Compile the application | `./gradlew :reverse-app:build` |
| Run the app | `./reverse-app/build/install/main/debug/reverse-app` |
