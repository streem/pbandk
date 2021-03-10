pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "binary-compatibility-validator" -> {
                    useModule("org.jetbrains.kotlinx:binary-compatibility-validator:${requested.version}")
                }
                "com.android.application", "com.android.library" -> {
                    useModule("com.android.tools.build:gradle:${requested.version}")
                }
            }
        }
    }
}

rootProject.name = "pbandk"

include(":runtime")
include(":jvm-test-types")

include(":protoc-gen-kotlin:lib")
project(":protoc-gen-kotlin:lib").name = "protoc-gen-kotlin-lib"
include(":protoc-gen-kotlin:jvm")
project(":protoc-gen-kotlin:jvm").name = "protoc-gen-kotlin-jvm"

include(":conformance:lib")
project(":conformance:lib").name = "conformance-lib"
include(":conformance:jvm")
project(":conformance:jvm").name = "conformance-jvm"
include(":conformance:native")
project(":conformance:native").name = "conformance-native"