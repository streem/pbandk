# Custom Service Gen Example

This example shows how to create a custom `ServiceGenerator` to write code for Protobuf services such as gRPC. Like the
adjacent `gradle-and-jvm` example, this also uses the Protobuf Gradle plugin.

## Building

Building the `application` project automatically generates the service code. Like the `gradle-and-jvm` example, this
requires `protoc-gen-kotlin` on the `PATH` (and Windows does require custom `build.gradle` work, see example). To build
the application with generated source, run:

    path/to/gradle :application:installDist

The code generator will run to generate simple service code.

## Running

Running the application also builds it. Simply run:

    path/to/gradle :application:run

That runs the mock client and mock server to return a simple value.