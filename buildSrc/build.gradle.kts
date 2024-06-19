plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:33.0.0-jre")
}

kotlin {
    jvmToolchain(17)
}
