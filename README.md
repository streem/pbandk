# PBAndK

PBAndK is a Kotlin code generator and runtime for [Protocol Buffers](https://developers.google.com/protocol-buffers/).
It is built to work across multiple Kotlin platforms.

**Features**

* Clean data class generation
* Works for JVM and JS
* Support for proto2 and proto3 syntaxes
* Oneof's are properly handled as sealed classes
* JVM platform leverages [Protobuf's Java library](https://developers.google.com/protocol-buffers/docs/javatutorial) for
  best performance
* JS platform leverages [protobuf.js](https://github.com/dcodeIO/ProtoBuf.js/) for best performance
* Support for custom service/gRPC code generator

**Not Yet Implemented**

* Kotlin Native runtime support
* Protobuf code generator in Kotlin Native for easier importing
* Specialized support for well known types instead of just referencing them
* Code comments on generated code
* JSON support

Read below for more information and see the [examples](examples).

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

To see a full version of the file, see
[here](examples/gradle-and-jvm/src/main/kotlin/pbandk/examples/addressbook/pb/addressbook.kt). See the "Generated Code"
section below under "Usage" for more details.

### Usage

#### Generating Code

PBAndK's code generator leverages `protoc`. Download the
[latest protoc](https://github.com/google/protobuf/releases/latest) and make sure `protoc` is on the `PATH`. Then
download the [latest protoc-gen-kotlin](https://github.com/cretz/pb-and-k/releases/latest) and make sure
`protoc-gen-kotlin` is on the `PATH`. To generate code from `sample.proto` and put in `src/main/kotlin`, run:

    protoc --kotlin_out=src/main/kotlin sample.proto

For Windows however, `protoc` doesn't support finding `protoc-gen-kotlin.bat` on the `PATH`. So it has to be specified
explicitly as a plugin:

    protoc --kotlin_out=src/main/kotlin --plugin=protoc-gen-kotlin=path/to/protoc-gen-kotlin.bat sample.proto

The file is generated as `sample.kt` in the subdirectories specified by the package. Like other `X_out` arguments,
comma-separated options can be added to `--kotlin_out` before the colon and out dir path. To explicitly set the Kotlin
package to `my.pkg`, use the `kotlin_package` option like so:

    protoc --kotlin_out=kotlin_package=my.pkg:src/main/kotlin sample.proto

To log debug logs during generation, `log=debug` can be set as well.

In addition to running `protoc` manually, the
[Protobuf Plugin for Gradle](https://github.com/google/protobuf-gradle-plugin) can be used. See
[this example](examples/gradle-and-jvm) to see how.

#### Runtime Library

PBAndK's runtime library is a thin layer over the preferred Protobuf library for each platform. The libraries are
present on [JitPack](https://jitpack.io/#streem/pb-and-k). Using Gradle, add the JitPack repository:

```
repositories {
    maven { url 'https://jitpack.io' }
}
```

Then the dependency can be added for JVM libraries:

```
dependencies {
    compile 'com.github.streem.pb-and-k:pbandk-runtime-jvm:0.5.1'
}
```

It has a dependency on the Google Protobuf Java library. The code targets Java 1.6 to be Android friendly. For Kotlin
JS, change `pbandk-runtime-jvm` to `pbandk-runtime-js` and for common multiplatform code, change `pbandk-runtime-jvm` to
`pbandk-runtime-common`.

#### Service Code Generation

PBAndK does not generate gRPC code itself, but offers a `pbandk.gen.ServiceGenerator` interface in the
`protoc-gen-kotlin-jvm` project (really in the `protoc-gen-kotlin-common` project and inherited) with a single method
that can be implemented to generate the code.

To do this, first depend on the project but it will only be needed at compile time because it's already there at
runtime:

```
dependencies {
    compileOnly 'com.github.streem.pb-and-k:protoc-gen-kotlin-jvm:0.5.1'
}
```

Then, the `kotlin_service_gen` option can be given to `protoc` to use the generator. The option is a path-separated
collection of JAR files to put on the classpath. It can end with a pipe (i.e. `|`) following by the fully-qualified
class name of the implementation of the `ServiceGenerator` to use. If the last part is not present, it will use the
`ServiceLoader` mechanism to find the first implementation to use. For example, to gen with `my.Generator` from
`gen.jar`, it might look like:

    protoc --kotlin_out=kotlin_service_gen=gen.jar|my.Generator,kotlin_package=my.pkg:src/main/kotlin some.proto
    
For more details, see the [custom-service-gen](examples/custom-service-gen) example.

#### Generated Code

**Package**

The package is either the `kotlin_package` plugin option or the package set in the message. If the `google.protobuf`
package is referenced, it is assumed to be a well-known type and is changed to reference `pbandk.wkt`.

**Message**

Each Protobuf message extends `pbandk.Message` and has two overloaded `protoMarshal` methods, the most useful of which
marshals to a byte array. The companion object of every message has two overloaded `protoUnmarshal` methods, the most
useful of which accepts a byte array and returns an instance of the class. The other `protoMarshal` and `protoUnmarshal`
methods accept `Marshaller` and `Unmarshaller` instances respectively which are different for each platform. For
example, the JVM `Marshaller` uses `com.google.protobuf.CodedOutputStream`.

Messages are immutable Kotlin data classes. This means they automatically implement `hashCode`, `equals`, and
`toString`. Each class has an `unknownFields` map which contains information about extra fields the unmarshaller didn't
recognize. If there are values in this map, they will be marshalled on output. The `Unmarshaller` instances have a
constructor option to discard unknown fields when reading.

For proto3, the only nullable fields are other messages and oneof fields. Other values have defaults. For proto2,
optional fields are nullable and defaulted as such. Types are basically the same as they would be in Java. However,
`bytes` fields actually use a `pbandk.ByteArr` class which is a simple wrapper around a byte array. This was done
because Kotlin does not handle array fields in data classes predictably and it wasn't worth overriding `equals` and
`hashCode` every time.

Regardless of `optimize_for` options, the generated code is always the same. Each message has a `protoSize` field that
lazily calculates the size of the message when first invoked. Also, each message has the `plus` operator defined which
follows protobuf merge semantics.

**Oneof**

Oneof fields are generated as nested classes of a common sealed base class. Each oneof inner field is a data class that
wraps a single value.

**Enum**

Enum fields are generated as single-integer-value immutable data classes with known values as vals on the companion
object. This is preferred over traditional enum classes because enums in protobuf are open ended and may not be one of
the specific known values. Traditional enum classes would not be able to capture this state and using data classes this
way requires the user to do explicit checks for unknown ordinals during exhaustive when clauses. This does come at very
negligible cost during equality checks. Although there is the normal single-integer-value constructor on the data class,
developers should use the `fromValue` method present on the companion object. This will return an existing val if known.
It is possible in future versions that the generated data class constructor will become private.

Note, there is no reflection outside of normal Kotlin reflection. This means Kotlin reflection has to be used to get
string values of the enums currently. This may change as the JSON format is developed which requires the string form.

**Repeated and Map**

Repeated fields are normal lists. Developers should make no assumptions about which list implementation is used. Maps
are represented by Kotlin maps. In proto2, due to how map entries are serialized, both the key and the value are
considered nullable.

**Well-Known Types**

Well known types (i.e. those in the `google/protobuf` imports) are shipped with the runtime. At this early stage,
specialized support (e.g. using Kotlin `Any` for `google.protobuf.Any`) is not implemented.

**Services**

Services can be handled with a custom service generator. See the "Service Code Generation" section above and the 
[custom-service-gen](examples/custom-service-gen) example.

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

Due to current issues, Gradle must be version 4.7 in the steps below.

#### Code Generator

To generate the `protoc-gen-kotlin` distribution, run:

    path/to/gradle :protoc-gen-kotlin:protoc-gen-kotlin-jvm:assembleDist

Or use `installDist` to just put it locally and it will be in the `build/install` folder.

#### Runtime Library

To build the runtime library for both JS and the JVM, run:

    path/to/gradle :runtime:runtime-js:assemble
    path/to/gradle :runtime:runtime-jvm:assemble

#### Conformance Tests

To run conformance tests, the [conformance-test-runner](https://github.com/google/protobuf/tree/master/conformance) must
be built (does not work on Windows). Then both the JS and JVM projects must be built via:

    path/to/gradle :conformance:conformance-js:assemble
    path/to/gradle :conformance:conformance-jvm:installDist

Set the `CONF_TEST_PATH` environment variable to the full path to
`path/to/protobuf/conformance/conformance-test-runner`. The JS tests need to have `npm install` run in
`conformance/conformance-js`. Then simply run `conformance/test-conformance.sh`.
