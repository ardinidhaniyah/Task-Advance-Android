import org.jetbrains.kotlin.storage.CacheResetOnProcessCanceled.enabled

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.android_advanced"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.android_advanced"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation ("androidx.recyclerview:recyclerview:1.3.0")
    implementation ("androidx.cardview:cardview:1.0.0")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation("androidx.work:work-runtime-ktx:2.9.0")
    implementation("androidx.work:work-rxjava2:2.9.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("com.airbnb.android:lottie:3.2.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



//    implementation ("fileTree(dir: 'libs', include: ['*.jar'])")
//    implementation ("com.squareup.retrofit2:retrofit:2.6.0")
//    implementation ("com.squareup.retrofit2:converter-gson:2.6.0")
//    implementation ("com.squareup.retrofit2:adapter-rxjava2:2.4.0")
//    implementation ("com.squareup.okhttp3:okhttp:3.12.1")
//    implementation ("com.squareup.okhttp3:logging-interceptor:3.11.0")
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.1.0")

//    implementation ("com.github.bumptech.glide:glide:$versions.glide")
//    implementation ("androidx.work:work-runtime:$versions.work")
//    // Kotlin + coroutines
//    implementation ("androidx.work:work-runtime-ktx:$versions.work")
//    // optional - RxJava2 support
//    implementation ("androidx.work:work-rxjava2:$versions.work")
////    // optional - GCMNetworkManager support
////    implementation "androidx.work:work-gcm:$versions.work"
//    // optional - Test helpers
//    androidTestImplementation ("androidx.work:work-testing:$versions.work")
////    // optional - Multiprocess support
////    implementation "androidx.work:work-multiprocess:$versions.work"
//
//    // ViewModel and LiveData
//    implementation ("androidx.lifecycle:lifecycle-extensions:2.1.0")
//    annotationProcessor ("androidx.lifecycle:lifecycle-common-java8:2.1.0")
//    androidTestImplementation ("androidx.arch.core:core-testing:2.1.0")
////    testImplementation 'androidx.arch.core:core-testing:2.1.0'
//
//    // Rx
//    implementation ("io.reactivex.rxjava2:rxjava:2.2.4")
//    implementation ("io.reactivex.rxjava2:rxandroid:2.1.0")
}

//fun androidExtensions(function: () -> Unit) {
//
//}
