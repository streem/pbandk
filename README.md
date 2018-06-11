# PBAndK

PBAndK is a Kotlin code generator and runtime for [Protocol Buffers](https://developers.google.com/protocol-buffers/).
It is built to work across multiple Kotlin platforms.

**Features**

* Clean data class generation
* Works for JVM and JS (albeit JS isn't published anywhere)
* Support for proto2 and proto3 syntaxes
* Oneof's are properly handled as sealed classes
* JVM platform leverages [Protobuf's Java library](https://developers.google.com/protocol-buffers/docs/javatutorial) for
  best performance
* JS platform leverages [protobuf.js](https://github.com/dcodeIO/ProtoBuf.js/) for best performance

**Not Yet Implemented**

* Kotlin Native runtime support
* Protobuf code generator in Kotlin Native for easier importing
* Specialized support for well known types instead of just referencing them
* Pluggable service code generation for gRPC support

### Beta

This project is currently in beta yet has the features needed to solve the author's original goals. The "Not Yet
Implemented" features above will be implemented only if this project garners reasonable interest. If the features are
implemented, it is possible they may be done in a backwards incompatible way.

### Generated Code

For the following `addressbook.proto` file:

```protobuf
syntax = "proto3";
package tutorial;

import "google/protobuf/timestamp.proto";

message Person {
    string name = 1;
    int32 id = 2;
    string email = 3;

    enum PhoneType {
        MOBILE = 0;
        HOME = 1;
        WORK = 2;
    }

    message PhoneNumber {
        string number = 1;
        PhoneType type = 2;
    }

    repeated PhoneNumber phones = 4;

    google.protobuf.Timestamp last_updated = 5;
}

message AddressBook {
    repeated Person people = 1;
}
```

The following file will be generated at `tutorial/addressbook.kt`:

```kotlin
package tutorial

data class Person(
    val name: String = "",
    val id: Int = 0,
    val email: String = "",
    val phones: List<tutorial.Person.PhoneNumber> = emptyList(),
    val lastUpdated: pbandk.wkt.Timestamp? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Person> {
    override operator fun plus(other: Person?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Person> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Person.protoUnmarshalImpl(u)
    }

    data class PhoneType(override val value: Int) : pbandk.Message.Enum {
        companion object : pbandk.Message.Enum.Companion<PhoneType> {
            val MOBILE = PhoneType(0)
            val HOME = PhoneType(1)
            val WORK = PhoneType(2)

            override fun fromValue(value: Int) = when (value) {
                0 -> MOBILE
                1 -> HOME
                2 -> WORK
                else -> PhoneType(value)
            }
        }
    }

    data class PhoneNumber(
        val number: String = "",
        val type: tutorial.Person.PhoneType = tutorial.Person.PhoneType.fromValue(0),
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<PhoneNumber> {
        override operator fun plus(other: PhoneNumber?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<PhoneNumber> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = PhoneNumber.protoUnmarshalImpl(u)
        }
    }
}

data class AddressBook(
    val people: List<tutorial.Person> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<AddressBook> {
    override operator fun plus(other: AddressBook?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<AddressBook> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = AddressBook.protoUnmarshalImpl(u)
    }
}

// Omitted multiple supporting private extension methods
```

### Usage

#### Generating Code

PBAndK's code generator leverages `protoc`. Download the
[latest protoc](https://github.com/google/protobuf/releases/latest) and make sure `protoc` is on the `PATH`. Then
download the [latest protoc-gen-kotlin](https://github.com/cretz/pbandk/releases/latest) and make sure
`protoc-gen-kotlin` is on the `PATH`. To generate code from `sample.proto` and put in `src/main/kotlin`, run:

    protoc --kotlin_out=src/main/kotlin sample.proto

For Windows however, `protoc` doesn't support finding `protoc-gen-kotlin.bat` on the `PATH`. So it has to be specified
explicitly as a plugin:

    protoc --kotlin_out=src/main/kotlin --plugin=protoc-gen-kotlin=path/to/protoc-gen-kotlin.bat sample.proto

The file is generated as `sample.kt` in the subdirectories specified by the package. Like other `X_out` arguments to,
comma-separated options can be added to `--kotlin_out` before the colon and out dir path. To explicitly set the Kotlin
package to `my.pkg`, use the `kotlin_package` option like so:

    protoc --kotlin_out=kotlin_package=my.pkg:src/main/kotlin sample.proto

To log debug logs during generation, `log=debug` can be set as well.

In addition to running `protoc` manually, the
[Protobuf Plugin for Gradle](https://github.com/google/protobuf-gradle-plugin) can be used. See
[this example](examples/gradle-and-jvm) to see how.

#### Runtime Library

PBAndK's runtime library is a thin layer over the preferred Protobuf library for a certain platform. Currently only the
JVM library is deployed to Maven central. Using Gradle, the dependency can be added:

```
dependencies {
    compile 'com.github.cretz.pbandk:pbandk-runtime-jvm:0.1.0'
}
```

It has a dependency on the Google Protobuf Java library. The code targets Java 1.6 to be Android friendly.

### Building

The project is built with Gradle and has several sub projects. In alphabetical order, they are:

* `conformance/conformance-common` - Multiplatform common code for conformance tests
* `conformance/conformance-js` - JS code for conformance tests
* `conformance/conformance-jvm` - JVM code for conformance tests
* `conformance/conformance-native` - Native code for conformance tests (not built yet)
* `protoc-gen-kotlin/protoc-gen-kotlin-common` - Multiplatform common code for the code generator
* `protoc-gen-kotlin/protoc-gen-kotlin-jvm` - JVM code for the code generator
* `protoc-gen-kotlin/protoc-gen-kotlin-native` - Native code for the code generator (not built yet)
* `runtime/runtime-common` - Multiplatform common code for runtime Protobuf support
* `runtime/runtime-js` - JS code for runtime Protobuf support
* `runtime/runtime-jvm` - JVM code for runtime Protobuf support
* `runtime/runtime-native` - Native code for runtime Protobuf support

To generate the `protoc-gen-kotlin` distribution, run:

    path/to/gradle :protoc-gen-kotlin:protoc-gen-kotlin-jvm:assembleDist

Or use `installDist` to just put it locally and it will be in the `build/install` folder.

To run conformance tests, the [conformance-test-runner](https://github.com/google/protobuf/tree/master/conformance) must
be built (does not work on Windows). Then both the JS and JVM projects must be built via:

    path/to/gradle :conformance:conformance-js:installDist
    path/to/gradle :conformance:conformance-jvm:installDist

Then in the `conformance` folder of the cloned `protobuf` source, with `conformance-test-runner` built, run:

    ./conformance-test-runner --enforce-recommended path/to/pb-and-k/conformance/test-conformance.sh