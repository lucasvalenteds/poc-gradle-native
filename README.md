# Gradle Native

This sample demonstrates how to use Gradle (with Kotlin DSL) to manage dependencies of a native project.

There is a library named `reverse-lib` which is used by and the `reverse-app` as transitive dependency. The application uses the library to reverse the word `Hello`.

| Description | Command |
| :--- | :--- |
| Compile the library | `./gradlew :reverse-lib:build` |
| Compile the application | `./gradlew :reverse-app:build` |
| Run the app | `./reverse-app/build/install/main/debug/reverse-app` |

## Output

```
original: Hello
reversed: olleH
```

## Test report

```
> Task :reverse-lib:runTest
[==========] Running 1 test from 1 test case.
[----------] Global test environment set-up.
[----------] 1 test from ReverseTests
[ RUN      ] ReverseTests.test_constructor
[       OK ] ReverseTests.test_constructor (0 ms)
[----------] 1 test from ReverseTests (0 ms total)

[----------] Global test environment tear-down
[==========] 1 test from 1 test case ran. (0 ms total)
[  PASSED  ] 1 test.
```

