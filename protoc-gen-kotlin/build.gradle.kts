
buildscript {
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.1.7.RELEASE")
    }
}

plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
    application
    //id("org.springframework.boot")
}

application {
    mainClassName = "pbandk.gen.MainKt"
    applicationName = "protoc-gen-kotlin"
}

kotlin {
    jvm()

    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    // macosX64("macos")

    sourceSets["commonMain"].dependencies {
            implementation(project(":runtime"))
            implementation(kotlin("stdlib-common"))
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.kotlin_serialization}")
        }

        //archivesBaseName("protoc-gen-kotlin-common")
        //publishSettings(project, archivesBaseName, "Common library for pbandk protobuf code generator")

    sourceSets["commonTest"].dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
    }

    sourceSets["jvmMain"].dependencies {
        implementation(kotlin("stdlib"))
        implementation(project(":runtime"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlin_serialization}")
        implementation("com.google.protobuf:protobuf-java:3.11.1")
    }
    //publishSettings(project, archivesBaseName, "JVM library for pbandk protobuf code generator")

    sourceSets["jvmTest"].dependencies {
            implementation(kotlin("test"))
            implementation(kotlin("test-junit"))
            implementation("junit:junit:4.12")
        }

//    /*
//    sourceSets["macosMain"].dependencies {
//    }
//    sourceSets["macosTest"].dependencies {
//    }
//    */
}

// This is a workaround because kotlin multiplatform plugin does not work well with application plugin
afterEvaluate {
    tasks {
        val compileKotlinJvm by getting(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class)
        val jvmProcessResources by getting(Copy::class)
        val jvmRun by creating(JavaExec::class) {
            dependsOn(compileKotlinJvm, jvmProcessResources)
            group = "run"
            main = "pbandk.gen.MainKt"
            classpath = configurations["jvmRuntimeClasspath"] + compileKotlinJvm.outputs.files +
                    jvmProcessResources.outputs.files
            workingDir = buildDir
            args = System.getProperty("exec.args", "").split(" ")
        }
        val jvmJar by getting(Jar::class) {
            manifest {
                attributes["Main-Class"] = jvmRun.main
                attributes["Version"] = project.version
            }
            from(kotlin.jvm().compilations.getByName("main").compileDependencyFiles.map { if (it.isDirectory) it else zipTree(it) })
        }
    }
}

tasks.register("generateWellKnownTypes") {
    dependsOn(":protoc-gen-kotlin:packagePlugin")

    doFirst {
        val protocPath = System.getProperty("protoc.path")
        if (protocPath == null) throw InvalidUserDataException("System property protoc.path must be set")
        runProtoGen(Paths.get(protocPath, "include").toString(), "src/commonMain/kotlin", "pbandk.wkt", "debug", "google/protobuf")
    }
}

tasks.register("packagePlugin") {
    dependsOn(":protoc-gen-kotlin:jvmJar")
    dependsOn(":protoc-gen-kotlin:installDist")

    doLast {
        copy {
            from("$buildDir/libs/protoc-gen-kotlin-jvm-${project.version}.jar")
            into("$buildDir/install/protoc-gen-kotlin/lib/")
            rename { "protoc-gen-kotlin-${project.version}.jar" }
        }
    }
}

//allprojects {
//    ext["runProtoGen"] = fun(inPath: String, outPath: String, kotlinPackage: String?, logLevel: String?, inSubPath: String?) {

//}

/*
fun publishSettings(project: String, projectName: String, projectDescription: String) {
    project.with {
        if (!project.hasProperty('ossrhUsername')) return
        apply plugin: 'maven'
        apply plugin: 'signing'

        task packageSources(type: Jar) {
            classifier = 'sources'
            from sourceSets.main.allSource
            if (project.name.endsWith('-jvm') || project.name.endsWith('-js')) {
                duplicatesStrategy = 'exclude'
                def commonProject = project.parent.subprojects.find { it.name.endsWith('-common') }
                from(sourceSets.main.allSource + commonProject.sourceSets.main.allSource)
            }
        }

        task packageJavadoc(type: Jar) {
            // Empty to satisfy Sonatype's javadoc.jar requirement
            classifier 'javadoc'
        }

        artifacts {
            archives packageSources, packageJavadoc
        }

        signing {
            sign configurations.archives
        }

        uploadArchives {
            repositories {
                mavenDeployer {
                    beforeDeployment { MavenDeployment deployment -> signing.signPom(deployment) }
                    repository(url: 'https://oss.sonatype.org/service/local/staging/deploy/maven2/') {
                        authentication(userName: ossrhUsername, password: ossrhPassword)
                    }
                    snapshotRepository(url: 'https://oss.sonatype.org/content/repositories/snapshots/') {
                        authentication(userName: ossrhUsername, password: ossrhPassword)
                    }
                    pom.project {
                        name projectName
                        packaging 'jar'
                        description projectDescription
                        url 'https://github.com/streem/pbandk'
                        scm {
                            connection 'scm:git:git@github.com:streem/pbandk.git'
                            developerConnection 'scm:git:git@github.com:streem/pbandk.git'
                            url 'git@github.com:streem/pbandk.git'
                        }
                        licenses {
                            license {
                                name 'MIT License'
                                url 'https://opensource.org/licenses/MIT'
                            }
                        }
                        developers {
                            developer {
                                id 'streem'
                                name 'Streem, Inc.'
                                url 'https://github.com/streem'
                            }
                        }
                    }
                }
            }
        }
    }
}
*/