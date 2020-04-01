import org.gradle.api.publish.maven.MavenPom

fun MavenPom.configureForPbandk() {
    url.set("https://github.com/streem/pbandk")
    licenses {
        license {
            name.set("MIT License")
            url.set("https://opensource.org/licenses/MIT")
        }
    }

    developers {
        developer {
            id.set("streem")
            name.set("Streem, Inc.")
            url.set("https://github.com/streem")
        }
    }

    scm {
        connection.set("scm:git:git@github.com:streem/pbandk.git")
        developerConnection.set("scm:git:git@github.com:streem/pbandk.git")
        url.set("git@github.com:streem/pbandk.git")
    }
}