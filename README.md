Unresolved reference with extension function from other module
===


## What is the problem

`app/jacoco.exec` is generated if a testcase involves classes from other module.

I'm not sure what is the expected behavior, but generating `jacoco.exec` in `app` directory seems wrong.

[this testcase](https://github.com/yshrsmz/CoverageKotlinFunctionTest/blob/d2f6e3cb84ae0929f418b36582afcf6122d033df/app/src/test/java/net/yslibrary/coveragekotlinfunctiontest/ExampleUnitTest.kt#L22) is the cause of unexpected `app/jacoco.exec`

To reproduce, just run `./gradlew testDebugUnitTest`
