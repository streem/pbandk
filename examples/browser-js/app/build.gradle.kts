plugins {
    kotlin("js")
}

val pbandkVersion: String by rootProject.extra
val protobufjsVersion = "^6.8.8"

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("com.github.streem.pbandk:pbandk-runtime-js:$pbandkVersion")
    implementation(npm("protobufjs", protobufjsVersion))
}

kotlin {
    target.browser {}

    sourceSets {
        main {
            kotlin.srcDir("${project(":lib-proto").buildDir}/generated/source/proto/main/kotlin")
        }
    }
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            sourceMap = true
            moduleKind = "commonjs"
            freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
        }
    }

    // Generate the protobuf files before compilation
    project(":lib-proto").tasks
        .matching { it.name == "generateProto" }
        .all { compileKotlinJs.get().dependsOn(this) }
}
