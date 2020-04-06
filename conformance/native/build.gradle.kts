import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    application
}

application {
    mainClassName = "pbandk.conformance.MainKt"
    applicationName = "conformance"
}

dependencies {
    implementation(project(":conformance:lib"))
}
