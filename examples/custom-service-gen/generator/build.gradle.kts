plugins {
    kotlin("jvm")
}

val pbandkVersion: String by rootProject.extra

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("pro.streem.pbandk:pbandk-runtime-jvm:$pbandkVersion")
    compileOnly("pro.streem.pbandk:protoc-gen-kotlin-lib-jvm:$pbandkVersion")
}
