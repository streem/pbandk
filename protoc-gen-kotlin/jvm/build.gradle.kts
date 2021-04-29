import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("jvm")
    application
    `maven-publish`
    signing
    id("org.springframework.boot")
}

description = "Kotlin code generator for Protocol Buffers. This executable runs as a protoc plugin."

application {
    mainClassName = "pbandk.gen.MainKt"
    applicationName = "protoc-gen-kotlin"
}

dependencies {
    implementation(project(":protoc-gen-kotlin:protoc-gen-kotlin-lib"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val bootJar by tasks.getting(BootJar::class) {
    archiveClassifier.set("jvm8")
    launchScript()
}

publishing {
    publications {
        create<MavenPublication>("bootJar") {
            artifact(bootJar)
            configurePbandkPom(project.description!!)
        }
    }
}
