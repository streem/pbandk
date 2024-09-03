plugins {
    kotlin("multiplatform") version "2.0.20" apply false
    id("com.google.protobuf") version "0.9.4" apply false
}

val pbandkVersion by extra("0.16.1-SNAPSHOT")

subprojects {
    repositories {
        if (System.getenv("CI") == "true") {
            mavenLocal()
        }
        mavenCentral()
    }
}
