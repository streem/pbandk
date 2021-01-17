import com.google.protobuf.gradle.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
    id("com.google.protobuf")
}

val pbandkVersion: String by rootProject.extra
val kotlinxCoroutinesVersion by extra("1.3.6")
val protobufVersion by extra("3.11.1")

application {
    mainClassName = "pbandk.examples.greeter.MainKt"
    applicationName = "greeter"
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
    implementation("pro.streem.pbandk:pbandk-runtime-jvm:$pbandkVersion")
}

protobuf {
    generatedFilesBaseDir = "$projectDir/src"
    protoc {
        artifact = "com.google.protobuf:protoc:$protobufVersion"
    }
    plugins {
        id("kotlin") {
            artifact = "pro.streem.pbandk:protoc-gen-kotlin-jvm:$pbandkVersion:jvm8@jar"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach { task ->
            task.dependsOn(":generator:jar")
            task.builtins {
                remove("java")
            }
            task.plugins {
                id("kotlin") {
                    option("log=debug")
                    option("kotlin_package=pbandk.examples.greeter.pb")
                    option("kotlin_service_gen=${project(":generator").buildDir}/libs/generator.jar|pbandk.examples.greeter.Generator")
                }
            }
        }
    }
}

tasks {
    compileJava {
        enabled = false
    }

    withType<KotlinCompile>().all {
        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
    }
}

// Workaround the Gradle bug resolving multi-platform dependencies.
// Fix courtesy of https://github.com/square/okio/issues/647
configurations.forEach {
    if (it.name.toLowerCase().contains("kapt") || it.name.toLowerCase().contains("proto")) {
        it.attributes.attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, Usage.JAVA_RUNTIME))
    }
}
