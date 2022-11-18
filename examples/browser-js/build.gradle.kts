plugins {
    kotlin("js") version "1.5.32" apply false
    id("com.google.protobuf") version "0.8.18" apply false
}

val pbandkVersion by extra("0.14.3-SNAPSHOT")

subprojects {
    repositories {
        if (System.getenv("CI") == "true") {
            mavenLocal()
        }
        mavenCentral()
    }
}
