import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
}

application {
    mainClassName = "pbandk.conformance.MainKt"
    applicationName = "conformance"
}

dependencies {
    implementation(project(":conformance-lib"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
