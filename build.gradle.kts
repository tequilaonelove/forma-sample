import org.jetbrains.kotlin.konan.properties.Properties

buildscript {
    repositories {
        google()
//        jcenter()
//        mavenCentral()
    }
//    dependencies {
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:4.1.1")
//    }

}

plugins {
    id("com.stepango.forma") version "0.0.3"
}
val properties = Properties()
val file: File = project.rootProject.file("local.properties")
if (file.exists()) file.inputStream().use { properties.load(it) }

// Enjoy easiest way to configure your Android project
androidProjectConfiguration(
    minSdk = 21,
    targetSdk = 30,
    compileSdk = 30,
    kotlinVersion = properties.getProperty("kotlinVersion", "1.4.30"),
    agpVersion = properties.getProperty("agpVersion", "4.2.0-beta02"),
    versionCode = 3,
    versionName = "1.0",
    dataBinding = true,
    repositories = {
        google()
        jcenter()
        maven("https://kotlin.bintray.com/kotlinx/")
        maven("https://jitpack.io")
    }
)
