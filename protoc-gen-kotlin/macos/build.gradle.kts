import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    application
    `maven-publish`
}

application {
    mainClassName = "pbandk.gen.MainKt"
    applicationName = "protoc-gen-kotlin"
}

kotlin {
    macosX64()

    sourceSets {
        val macosX64Main by getting {
            dependencies {
                implementation(project(":protoc-gen-kotlin:lib"))
            }
        }
    }
}
