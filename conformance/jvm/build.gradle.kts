import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
}

application {
    mainClass.set("pbandk.conformance.MainKt")
    applicationName = "conformance"
}

dependencies {
    implementation(project(":conformance:conformance-lib"))
}

kotlin {
    target {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
}