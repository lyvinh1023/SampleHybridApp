# SampleHybridApp
 - Create a sample android hybrid app
 - Create instrument tests using Espresso native framework
 - Apply Android CI to build project and run e2e instrument test
 - Run test on emulator and Firebase Lab

# How to run instrument test

- Build APP and TEST apk files

> gradlew assembleDebug assembleDebugAndroidTest

- Run tests with adb shell

> adb shell am instrument -w -m -e debug false com.example.samplehybridapp.test/androidx.test.runner.AndroidJUnitRunner
> 
> adb shell am instrument -w -m -e debug false -e class 'com.example.samplehybridapp.tests.HomeTests' com.example.logintestespresso.test/androidx.test.runner.AndroidJUnitRunner
> 
> adb shell am instrument -w -m -e debug false -e annotation com.example.samplehybridapp.testCategories.SmokeTest com.example.samplehybridapp.test/androidx.test.runner.AndroidJUnitRunner

- Run tests with gradlew

> gradlew connectedDebugAndroidTest
> 
> gradlew connectedDebugAndroidTest -P android.testInstrumentationRunnerArguments.annotation=com.example.samplehybridapp.testCategories.smokeTest
 
- List all devices on Firebase Lab

> gcloud firebase test android models list

 - Run test with Firebase CLI

> gcloud firebase test android run --type instrumentation --app app/build/outputs/apk/debug/app-debug.apk --test app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk --device model=Pixel2,version=30
> 
> gcloud firebase test android run --type instrumentation --app app/build/outputs/apk/debug/app-debug.apk --test app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk --device model=Pixel2,version=30 --environment-variables annotation=com.example.samplehybridapp.testCategories.SmokeTest
