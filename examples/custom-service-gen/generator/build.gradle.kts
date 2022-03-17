plugins {
    kotlin("jvm")
}

val pbandkVersion: String by rootProject.extra

kotlin {
    jvmToolchain {
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(8))
    }
}

dependencies {
    compileOnly("pro.streem.pbandk:pbandk-runtime:$pbandkVersion")
    compileOnly("pro.streem.pbandk:protoc-gen-pbandk-lib:$pbandkVersion")
}
