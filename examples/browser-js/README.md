# Browser JS Example

This is a simple example using the [Kotlin/JS gradle plugin](https://kotlinlang.org/docs/js-project-setup.html) to mutate
a protobuf-based address book inside local storage. Many shortcuts were taken to keep this simple. Like the adjacent
`gradle-and-jvm` example, this also uses the Protobuf Gradle plugin. See that example for setup. Unlike that example
however, this example does not commit the generated file. Instead the generation is added to the `commonMain` source
set of the `:lib-proto` project.

This example contains two sub-projects: `:lib-proto` runs the protobuf pbandk plugin on the protobuf files, and `:app`
contains the actual Kotlin/JS project. This is needed because the Protobuf Gradle Plugin requires the `java-library`
plugin, but we want to keep the Kotlin/JS project as a normal Kotlin Multiplatform project for easier maintenance.

To run it, simply:

    path/to/gradle :app:jsRun

This will bundle everything with webpack and start a development web server usually at http://localhost:8080/. See
the gradle output for more details.
