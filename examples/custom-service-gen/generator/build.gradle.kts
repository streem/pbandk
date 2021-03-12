plugins {
    kotlin("jvm")
}

val pbandkVersion: String by rootProject.extra

dependencies {
    compileOnly("pro.streem.pbandk:pbandk-runtime:$pbandkVersion")
    compileOnly("pro.streem.pbandk:protoc-gen-kotlin-lib:$pbandkVersion")
}
