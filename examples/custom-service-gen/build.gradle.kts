import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.72" apply false
    id("com.google.protobuf") version "0.8.12" apply false
    // Fetch/sync remote proto files prior to code gen.
    id("com.tinder.gitquery") version "2.0.1" apply false
}

val pbandkVersion by extra("0.9.0-SNAPSHOT")

subprojects {
    repositories {
        if (System.getenv("CI") == "true") {
            mavenLocal()
        }
        jcenter()
    }

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}
