buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.hiltAndroidGradlePlugin)
        classpath(Build.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
    }

}// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id("com.android.application" version '7.2.2' apply false)
//    id 'com.android.library' version '7.2.2' apply false
//    id 'org.jetbrains.kotlin.android' version '1.7.10' apply false
//    id 'org.jetbrains.kotlin.jvm' version '1.7.10' apply false
//}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}