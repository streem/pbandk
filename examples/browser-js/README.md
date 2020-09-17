# Browser JS Example

This is a simple example using the [Kotlin/JS gradle plugin](https://kotlinlang.org/docs/reference/js-project-setup.html) to mutate
a protobuf-based address book inside local storage. Many shortcuts were taken to keep this simple. Like the adjacent
`gradle-and-jvm` example, this also uses the Protobuf Gradle plugin. See that example for setup. Unlike that example
however, this example does not commit the generated file, instead the generation is set as a dependency of
`compileKotlin2Js` task.

This example contains two sub-projects: `:lib-proto` runs the protobuf pbandk plugin on the protobuf files, and `:app`
contains the actual Kotlin/JS project. This is needed because the Protobuf Gradle Plugin requires the `java-library`
plugin, but the `java-library` plugin can't be applied to a project using the Kotlin/JS gradle plugin.

To run it, simply:

    path/to/gradle run

This will start bundle everything with webpack and start a development web server usually at http://localhost:8080/. See
the code for more details.

Note: to update the synced proto files run `gradle gitQuery` 
