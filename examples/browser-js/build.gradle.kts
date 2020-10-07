plugins {
    kotlin("js") version "1.3.72" apply false
    id("com.google.protobuf") version "0.8.12" apply false
}

val pbandkVersion by extra("0.9.0-SNAPSHOT")

subprojects {
    repositories {
        if (System.getenv("CI") == "true") {
            mavenLocal()
        }
        jcenter()
    }
}
