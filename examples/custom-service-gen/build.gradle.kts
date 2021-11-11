import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32" apply false
    id("com.google.protobuf") version "0.8.17" apply false
}

val pbandkVersion by extra("0.12.0")

subprojects {
    repositories {
        if (System.getenv("CI") == "true") {
            mavenLocal()
        }
        mavenCentral()
    }

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}
