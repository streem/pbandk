import org.jetbrains.kotlin.gradle.dsl.JsModuleKind

plugins {
    kotlin("multiplatform")
}

val pbandkVersion: String by rootProject.extra

kotlin {
    js {
        binaries.executable()
        browser {}

        compilations.all {
            compileTaskProvider.configure {
                compilerOptions.moduleKind.set(JsModuleKind.MODULE_UMD)
            }
        }
    }

    sourceSets {
        jsMain {
            dependencies {
                implementation(project(":lib-proto"))
            }
        }
    }
}