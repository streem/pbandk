import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js")
}

val pbandkVersion: String by rootProject.extra
val protobufjsVersion = "^6.10.2"

dependencies {
    implementation("pro.streem.pbandk:pbandk-runtime:$pbandkVersion")
    implementation(npm("protobufjs", protobufjsVersion))
}

kotlin {
    js(IR) {
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
            freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
        }
    }

    // Generate the protobuf files before compilation
    project(":lib-proto").tasks
        .matching { it.name == "generateProto" }
        .all { compileKotlinJs.dependsOn(this) }
}
