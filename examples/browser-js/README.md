# Browser JS Example

This is a simple example using the [kotlin-frontend-plugin](https://github.com/Kotlin/kotlin-frontend-plugin) to mutate
a protobuf-based address book inside local storage. Many shortcuts were taken to keep this simple. Like the adjacent
`gradle-and-jvm` example, this also uses the Protobuf Gradle plugin.

To run it, simply:

    path/to/gradle run

This will start bundle everything with webpack and start a development web server usually at http://localhost:8088/. See
the code for more details.