# SampleHybridApp
 - Create a sample android hybrid app
 - Create instrument tests using Espresso native framework
 - Apply Android CI to build project and run e2e instrument test
 - Run test on emulator and Firebase Lab

# How to run instrument tests

## Build APP and TEST apk files

> gradlew assembleDebug assembleDebugAndroidTest

## Run tests with adb shell

- Run all tests

> adb shell am instrument -w -m -e debug false com.example.samplehybridapp.test/androidx.test.runner.AndroidJUnitRunner
 
- Run a test class

> adb shell am instrument -w -m -e debug false -e class 'com.example.samplehybridapp.tests.HomeTests' com.example.logintestespresso.test/androidx.test.runner.AndroidJUnitRunner

- Run test by category (e.g SmokeTest only)

> adb shell am instrument -w -m -e debug false -e class 'com.example.samplehybridapp.testSuites.SmokeTestSuite' com.example.samplehybridapp.test/androidx.test.runner.AndroidJUnitRunner

> adb shell am instrument -w -m -e debug false -e annotation com.example.samplehybridapp.annotations.SmokeAnnotation com.example.samplehybridapp.test/androidx.test.runner.AndroidJUnitRunner

## Run tests with gradlew

- Run all tests

> gradlew connectedDebugAndroidTest

- Run test by category (e.g SmokeTest only)

> gradlew connectedDebugAndroidTest -Pandroid.testInstrumentationRunnerArguments.class=com.example.samplehybridapp.testSuites.SmokeTestSuite

> gradlew connectedDebugAndroidTest -Pandroid.testInstrumentationRunnerArguments.annotation=com.example.samplehybridapp.annotations.SmokeAnnotation

## Run tests with gcloud firebase

- List all devices on Firebase Lab

> gcloud firebase test android models list

- Run all tests

> gcloud firebase test android run --type instrumentation --app app/build/outputs/apk/debug/app-debug.apk --test app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk --device model=Pixel2,version=30

- Run test by category (e.g SmokeTest only)

> gcloud firebase test android run --type instrumentation --app app/build/outputs/apk/debug/app-debug.apk --test app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk --device model=Pixel2,version=30 --environment-variables annotation=com.example.samplehybridapp.annotations.SmokeAnnotation
