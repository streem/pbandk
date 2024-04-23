plugins {
    kotlin("jvm") version "1.8.10" apply false
    id("com.google.protobuf") version "0.9.2" apply false
}

val pbandkVersion by extra("0.14.4-SNAPSHOT")

subprojects {
    repositories {
        if (System.getenv("CI") == "true") {
            mavenLocal()
        }
        mavenCentral()
    }
}
