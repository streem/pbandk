import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

buildscript {
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:${Versions.spring_boot_gradle_plugin}")
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("application")
    id("org.springframework.boot") version "${Versions.spring_boot_gradle_plugin}"
}

project.ext["projectDescription"] = "Executable for pbandk protoc plugin"
apply(from = "../gradle/publish.gradle")

application {
    mainClassName = "pbandk.gen.MainKt"
    applicationName = "protoc-gen-kotlin"
}

dependencies {
    implementation(project(":protoc-gen-kotlin-lib"))
}

tasks.withType(KotlinCompile::class.java).all {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs =
        listOf(*kotlinOptions.freeCompilerArgs.toTypedArray(), "-Xjsr305=strict")
}

tasks.getByName<BootJar>("bootJar") {
    classifier = "boot"
    launchScript()
}