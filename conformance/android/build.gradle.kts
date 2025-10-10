plugins {
    id("com.android.application")
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
}

android {
    namespace = "pbandk.conformance"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
    }
}

dependencies {
    implementation(project(":conformance:conformance-jvm"))
}

