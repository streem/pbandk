plugins {
    kotlin("jvm") version "2.0.10" apply false
    id("com.google.protobuf") version "0.9.4" apply false
}

val pbandkVersion by extra("0.15.0-SNAPSHOT")

subprojects {
    repositories {
        if (System.getenv("CI") == "true") {
            mavenLocal()
        }
        mavenCentral()
    }
}
