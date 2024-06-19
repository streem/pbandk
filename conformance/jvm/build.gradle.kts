import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
}

application {
    mainClass = "pbandk.conformance.MainKt"
    applicationName = "conformance"
}

dependencies {
    implementation(project(":conformance:conformance-lib"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = Versions.jvmTarget
}
tasks.withType<JavaCompile> {
    targetCompatibility = Versions.jvmTarget
}
