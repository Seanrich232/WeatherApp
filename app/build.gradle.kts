import Dependencies.implementationAndroidX
import Dependencies.implementationAnimation
import Dependencies.implementationDatabase
import Dependencies.implementationDependencyInjection
import Dependencies.implementationImage
import Dependencies.implementationLifecycle
import Dependencies.implementationMultiThreading
import Dependencies.implementationNavigation
import Dependencies.implementationNetwork
import Dependencies.implementationParsing
import Dependencies.implementationTimber

val API_KEY: String by project

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-android")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.example.weatherapp"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true

        buildConfigField("String", "API_KEY", API_KEY)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("include" to listOf("*.jar"), "dir" to "libs")))
    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Kotlin.coreKtx)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.0")
    implementationAndroidX()
    implementationAnimation()
    implementationDatabase()
    implementationLifecycle()
    implementationMultiThreading()
    implementationDependencyInjection()
    implementationParsing()
    implementationImage()
    implementationNetwork()
    implementationNavigation()
    implementationTimber()
}