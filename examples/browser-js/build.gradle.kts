plugins {
    kotlin("js") version "1.3.72" apply false
    kotlin("plugin.serialization") version "1.3.72" apply false
    id("com.google.protobuf") version "0.8.12" apply false
}

val pbandkVersion by extra("0.8.2-SNAPSHOT")

subprojects {
    repositories {
        jcenter()
        if (System.getenv("CI") == "true") {
            mavenLocal()
        }
        maven("https://jitpack.io")
    }
}
