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
    mainClass.set("pbandk.gen.MainKt")
    applicationName = "protoc-gen-pbandk"
}

dependencies {
    implementation(project(":protoc-gen-pbandk:protoc-gen-pbandk-lib"))
}

kotlin {
    target {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }

        // https://youtrack.jetbrains.com/issue/KT-45335
        attributes {
            attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 8)
        }
    }
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
