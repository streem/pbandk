import org.jetbrains.kotlin.gradle.dsl.JvmTarget
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
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(Versions.jvmTarget))
}
tasks.withType<JavaCompile> {
    targetCompatibility = Versions.jvmTarget
}