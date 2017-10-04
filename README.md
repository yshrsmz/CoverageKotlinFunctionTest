Unresolved reference with extension function from other module
===


## What is the problem

In multi module project, compile fails with "Unresolved reference" if `testCoverageEnabled` is set to true in other module.

below is the error log.

`test` and `toast` is Kotlin extension functions defined in `kotlintestmodule`.

```
$ ./gradlew clean assembleDebug

> Task :kotlintestmodule:compileDebugKotlin
Using Kotlin incremental compilation

e: /home/yshrsmz/repos/CoverageKotlinFunctionTest/app/src/main/java/net/yslibrary/coveragekotlinfunctiontest/MainActivity.kt: (5, 39): Unresolved reference: test
e: /home/yshrsmz/repos/CoverageKotlinFunctionTest/app/src/main/java/net/yslibrary/coveragekotlinfunctiontest/MainActivity.kt: (6, 39): Unresolved reference: toast
e: /home/yshrsmz/repos/CoverageKotlinFunctionTest/app/src/main/java/net/yslibrary/coveragekotlinfunctiontest/MainActivity.kt: (14, 9): Unresolved reference: test
e: /home/yshrsmz/repos/CoverageKotlinFunctionTest/app/src/main/java/net/yslibrary/coveragekotlinfunctiontest/MainActivity.kt: (15, 9): Unresolved reference: toast

> Task :app:compileDebugKotlin
Using Kotlin incremental compilation


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:compileDebugKotlin'.
> Compilation error. See log for more details

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

* Get more help at https://help.gradle.org

BUILD FAILED in 2s
43 actionable tasks: 41 executed, 2 up-to-date
```
