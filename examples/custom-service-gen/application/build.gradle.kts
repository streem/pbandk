import com.google.protobuf.gradle.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
    id("com.google.protobuf")
}

val pbandkVersion: String by rootProject.extra
val kotlinxCoroutinesVersion by extra("1.4.3")
val protobufVersion by extra("3.11.1")

application {
    mainClass = "pbandk.examples.greeter.MainKt"
    applicationName = "greeter"
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
    implementation("pro.streem.pbandk:pbandk-runtime:$pbandkVersion")
}

protobuf {
    generatedFilesBaseDir = "$projectDir/src"
    protoc {
        artifact = "com.google.protobuf:protoc:$protobufVersion"
    }
    plugins {
        id("pbandk") {
            artifact = "pro.streem.pbandk:protoc-gen-pbandk-jvm:$pbandkVersion:jvm8@jar"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach { task ->
            task.dependsOn(":generator:jar")
            task.builtins {
                remove("java")
            }
            task.plugins {
                id("pbandk") {
                    option("log=debug")
                    option("kotlin_package=pbandk.examples.greeter.pb")
                    option("kotlin_service_gen=${project(":generator").layout.buildDirectory.get()}/libs/generator.jar|pbandk.examples.greeter.Generator")
                }
            }
        }
    }
}

tasks {
    compileJava {
        enabled = false
    }
}
