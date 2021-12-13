# SampleHybridApp
 - Create a sample android hybrid app
 - Create instrument tests using Espresso native framework
 - Apply Android CI to build project and run e2e instrument test

# How to run instrument test

- Build apk files

 gradlew assembleDebug assembleDebugAndroidTest

- Use adb shell

 adb shell am instrument -w -m -e debug false com.example.samplehybridapp.test/androidx.test.runner.AndroidJUnitRunner

- Use gradlew

 gradlew connectedAndroidTest

 gradlew connectedDebugAndroidTest
 
 - Use gcloud firebase

gcloud firebase test android run --type instrumentation --app app/build/outputs/apk/debug/app-debug.apk --test app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk --device model=Pixel2,version=30
