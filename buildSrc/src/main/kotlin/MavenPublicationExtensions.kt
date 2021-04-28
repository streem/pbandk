import org.gradle.api.publish.maven.MavenPublication

fun MavenPublication.configurePbandkPom(pomDescription: String) {
    val pomName = artifactId
    pom {
        name.set(pomName)
        description.set(pomDescription)
        url.set("https://github.com/streem/pbandk")

        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        organization {
            name.set("Streem, LLC")
            url.set("https://github.com/streem")
        }

        developers {
            developer {
                id.set("streem")
                name.set("Streem, LLC")
                url.set("https://github.com/streem")
            }
        }

        scm {
            connection.set("scm:git:git@github.com:streem/pbandk.git")
            developerConnection.set("scm:git:git@github.com:streem/pbandk.git")
            url.set("git@github.com:streem/pbandk.git")
        }
    }
}