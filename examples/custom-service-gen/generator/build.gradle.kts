plugins {
    kotlin("jvm")
}

val pbandkVersion: String by rootProject.extra

kotlin {
    jvmToolchain(11)
}

dependencies {
    compileOnly("pro.streem.pbandk:pbandk-runtime:$pbandkVersion")
    compileOnly("pro.streem.pbandk:protoc-gen-pbandk-lib:$pbandkVersion")
}
