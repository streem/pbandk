import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js")
}

val pbandkVersion: String by rootProject.extra
val protobufjsVersion = "^6.10.2"

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("pro.streem.pbandk:pbandk-runtime:$pbandkVersion")
    implementation(npm("protobufjs", protobufjsVersion))
}

kotlin {
    js(LEGACY) {
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
            sourceMap = true
            moduleKind = "commonjs"
            freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
        }
    }

    // Generate the protobuf files before compilation
    project(":lib-proto").tasks
        .matching { it.name == "generateProto" }
        .all { compileKotlinJs.dependsOn(this) }
}

// This is required for consuming a Kotlin/JS library compiled with Kotlin 1.4
// from a Kotlin 1.3 project. See https://youtrack.jetbrains.com/issue/KT-40226
// for details.
private class KotlinJsCompilerDisambiguationRule : AttributeDisambiguationRule<String> {
    override fun execute(details: MultipleCandidatesDetails<String>) {
        details.closestMatch("legacy")
    }
}
val jsCompilerAttr = Attribute.of("org.jetbrains.kotlin.js.compiler", String::class.java)
project.dependencies.attributesSchema.attribute(jsCompilerAttr) {
    disambiguationRules.add(KotlinJsCompilerDisambiguationRule::class.java)
}
