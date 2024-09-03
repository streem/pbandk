import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform")
}

val pbandkVersion: String by rootProject.extra

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        useEsModules()
        binaries.executable()
        browser {}
    }

    sourceSets {
        wasmJsMain {
            dependencies {
                implementation(project(":lib-proto"))
            }
        }
    }
}
