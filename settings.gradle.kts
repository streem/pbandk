pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
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
include(":protos")
include(":jvm-test-types")

include(":protoc-gen-pbandk:lib")
project(":protoc-gen-pbandk:lib").name = "protoc-gen-pbandk-lib"
include(":protoc-gen-pbandk:jvm")
project(":protoc-gen-pbandk:jvm").name = "protoc-gen-pbandk-jvm"

include(":conformance:lib")
project(":conformance:lib").name = "conformance-lib"
include(":conformance:jvm")
project(":conformance:jvm").name = "conformance-jvm"
include(":conformance:native")
project(":conformance:native").name = "conformance-native"
