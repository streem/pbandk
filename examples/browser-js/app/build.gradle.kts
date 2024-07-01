import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension

plugins {
    kotlin("js")
}

val pbandkVersion: String by rootProject.extra

dependencies {
    implementation("pro.streem.pbandk:pbandk-runtime:$pbandkVersion")
}

kotlin {
    js {
        binaries.executable()
        browser {}
    }

    sourceSets {
        main {
            kotlin.srcDir("${project(":lib-proto").buildDir}/generated/source/proto/main/pbandk")
        }
    }
}

tasks {
    val compileKotlinJs by getting(KotlinJsCompile::class) {
        kotlinOptions {
            moduleKind = "umd"
        }
    }

    // Generate the protobuf files before compilation
    project(":lib-proto").tasks
        .matching { it.name == "generateProto" }
        .all { compileKotlinJs.dependsOn(this) }
}

// Workaround for build failure. See https://youtrack.jetbrains.com/issue/KT-49124.
rootProject.extensions.configure<NodeJsRootExtension> {
    versions.webpackCli.version = "4.9.0"
}
