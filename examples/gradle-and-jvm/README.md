## Gradle and JVM Example

This example mimicks the address book example in the [protobuf repository](https://github.com/google/protobuf). It
demonstrates how to use code generation with the `protoc-gen-kotlin` tool and
[Protobuf Plugin for Gradle](https://github.com/google/protobuf-gradle-plugin). See the `build.gradle` file for details.

### Building

To build the code for most platforms with `protoc-gen-kotlin` on the `PATH`, simply run:

    path/to/gradle installDist

On Windows however, since `protoc-gen-kotlin.bat` is not properly read by protoc, you have to uncomment the section in
`build.gradle` where the path is explicitly set.

### Running

Once built, the start script will be at `build/install/addressbook/bin/addressbook` (and `.bat` version on Windows).
There are two commands that both require filenames, `add-person` and `list-people`. To add a person to a file called
`sample-book`, run:

    build/install/addressbook/bin/addressbook add-person sample-book

Run multiple times to add multiple people. To see the list of people saved in `sample-book`, run:

    build/install/addressbook/bin/addressbook list-people sample-book