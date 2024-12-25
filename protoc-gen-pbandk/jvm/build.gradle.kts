import org.jetbrains.kotlin.gradle.dsl.JvmTarget
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
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(Versions.jvmTarget))
}
tasks.withType<JavaCompile> {
    targetCompatibility = Versions.jvmTarget
}

val bootJar by tasks.getting(BootJar::class) {
    archiveClassifier.set("jvm8")
    // The Spring Boot launch script prints a warning about running as root, which corrupts the plugin output. This custom script disables the warning.
    // Script source: https://github.com/spring-projects/spring-boot/blob/9cf55808fb17daa9277424ecb5305c2b1516c07e/spring-boot-project/spring-boot-tools/spring-boot-loader-tools/src/main/resources/org/springframework/boot/loader/tools/launch.script
    launchScript {
        script = file("launch.script")
    }
}

publishing {
    publications {
        create<MavenPublication>("bootJar") {
            artifact(bootJar)
            configurePbandkPom(project.description!!)
        }
    }
}