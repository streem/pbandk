import org.jetbrains.kotlin.gradle.dsl.JsModuleKind

plugins {
    kotlin("multiplatform")
}

val pbandkVersion: String by rootProject.extra
val protobufjsVersion = "^6.11.2"

kotlin {
    js {
        binaries.executable()
        browser {}

        val generateProtoTask = project(":lib-proto").tasks
            .matching { it.name == "generateProto" }

        compilations.all {
            compileTaskProvider.configure {
                // Generate the protobuf files before compilation
                dependsOn(generateProtoTask)

                compilerOptions.moduleKind.set(JsModuleKind.MODULE_UMD)
            }
        }
    }

    sourceSets {
        jsMain {
            dependencies {
                implementation("pro.streem.pbandk:pbandk-runtime:$pbandkVersion")
                implementation(npm("protobufjs", protobufjsVersion))
            }

            kotlin.srcDir("${project(":lib-proto").layout.buildDirectory}/generated/source/proto/main/pbandk")
        }
    }
}