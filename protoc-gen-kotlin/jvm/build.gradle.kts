import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("jvm")
    application
    `maven-publish`
    signing
    id("org.springframework.boot")
}

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

tasks.getByName<BootJar>("bootJar") {
    archiveClassifier.set("jvm8")
    launchScript()
}

publishing {
    publications {
        create<MavenPublication>("bootJar") {
            artifact(tasks.getByName("bootJar"))

            description = "Executable for pbandk protoc plugin"
            pom {
                configureForPbandk()
            }

        }
    }
}
