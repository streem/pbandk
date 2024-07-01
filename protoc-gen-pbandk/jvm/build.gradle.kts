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
    mainClass = "pbandk.gen.MainKt"
    applicationName = "protoc-gen-pbandk"
}

dependencies {
    implementation(project(":protoc-gen-pbandk:protoc-gen-pbandk-lib"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = Versions.jvmTarget
}
tasks.withType<JavaCompile> {
    targetCompatibility = Versions.jvmTarget
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
