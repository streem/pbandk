plugins {
    kotlin("jvm")
}

val pbandkVersion: String by rootProject.extra

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compileOnly("com.github.streem.pbandk:pbandk-runtime-jvm:$pbandkVersion")
    compileOnly("com.github.streem.pbandk:protoc-gen-kotlin-lib-jvm:$pbandkVersion")
}
