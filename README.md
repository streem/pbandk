# Pbandk

Pbandk is a Kotlin code generator and runtime for [Protocol Buffers](https://developers.google.com/protocol-buffers/).
It is built to work across multiple Kotlin platforms.

**Features**

* Clean data class generation
* Works for JVM and JS
* Support for proto2 and proto3 syntaxes
* Oneof's are properly handled as sealed classes
* Specialized support to handle wrappers from the well-known types (e.g. `StringValue`, `BoolValue`) as nullable primitives (`String?`, `Boolean?`, etc.)
* JVM platform leverages [Protobuf's Java library](https://developers.google.com/protocol-buffers/docs/javatutorial) for
  best performance
* JS platform leverages [protobuf.js](https://github.com/dcodeIO/ProtoBuf.js/) for best performance
* Support for custom service/gRPC code generator

**Experimental**

* JSON support (the [proto3 JSON spec](https://developers.google.com/protocol-buffers/docs/proto3#json) is only partially supported)

**Not Yet Implemented**

* Kotlin Native runtime support
* Protobuf code generator in Kotlin Native for easier importing
* Specialized support for more of the well known types (e.g. `Any`)
* Support for protobuf annotations
* Access to the protobuf descriptor from generated code
* Code comments on generated code
* Specialized support for the `deprecated` annotation

Read below for more information and see the [examples](examples).

## Status

This project is currently in beta. It has the core set of protobuf features implemented and is being used in production. But it is still under active development and new versions might introduce backwards-incompatible changes to support new features or to improve the library's usability in Kotlin. Pull requests are welcome for any of the "Not Yet Implemented" features above.

This project follows semantic versioning. After v1.0.0 is released (mid-2020 at the earliest), future versions will preserve backwards compatibility.

## Summary

- [**Generated Code Sample**](#generated-code-sample)
- [**Usage**](#usage)
- [**Generated Code**](#generated-code)
- [**Building**](#building)
- [**Credits**](#credits)

## Generated Code Sample

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
    override fun jsonMarshal() = jsonMarshalImpl()
    companion object : pbandk.Message.Companion<Person> {
        val defaultInstance by lazy { Person() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Person.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(data: String) = Person.jsonUnmarshalImpl(data)
    }

    sealed class PhoneType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is PhoneType && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "PhoneType.${name ?: "UNRECOGNIZED"}(value=$value)"

        object MOBILE : PhoneType(0, "MOBILE")
        object HOME : PhoneType(1, "HOME")
        object WORK : PhoneType(2, "WORK")
        class UNRECOGNIZED(value: Int) : PhoneType(value)

        companion object : pbandk.Message.Enum.Companion<PhoneType> {
            val values: List<PhoneType> by lazy { listOf(MOBILE, HOME, WORK) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: Unrecognized(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No PhoneType with name: $name")
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
        override fun jsonMarshal() = jsonMarshalImpl()
        companion object : pbandk.Message.Companion<PhoneNumber> {
            val defaultInstance by lazy { PhoneNumber() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = PhoneNumber.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(data: String) = PhoneNumber.jsonUnmarshalImpl(data)
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
    override fun jsonMarshal() = jsonMarshalImpl(m)
    companion object : pbandk.Message.Companion<AddressBook> {
        val defaultInstance by lazy { AddressBook() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = AddressBook.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(data: String) = AddressBook.jsonUnmarshalImpl(data)
    }
}

// Omitted multiple supporting private extension methods
```

To see a full version of the file, see
[here](examples/gradle-and-jvm/src/main/kotlin/pbandk/examples/addressbook/pb/addressbook.kt). See the "Generated Code"
section below under "Usage" for more details.

## Usage

### Generating Code

Pbandk's code generator leverages `protoc`. Download the
[latest protoc](https://github.com/google/protobuf/releases/latest) and make sure `protoc` is on the `PATH`. Then
download the [latest protoc-gen-kotlin](https://github.com/streem/pbandk/releases/latest) and make sure
`protoc-gen-kotlin` is on the `PATH`. To generate code from `sample.proto` and put in `src/main/kotlin`, run:

```
protoc --kotlin_out=src/main/kotlin sample.proto
```

For Windows however, `protoc` doesn't support finding `protoc-gen-kotlin.bat` on the `PATH`. So it has to be specified
explicitly as a plugin:

```
protoc --kotlin_out=src/main/kotlin --plugin=protoc-gen-kotlin=path/to/protoc-gen-kotlin.bat sample.proto
```

The file is generated as `sample.kt` in the subdirectories specified by the package. Like other `X_out` arguments,
comma-separated options can be added to `--kotlin_out` before the colon and out dir path. To explicitly set the Kotlin
package to `my.pkg`, use the `kotlin_package` option like so:

```
protoc --kotlin_out=kotlin_package=my.pkg:src/main/kotlin sample.proto
```

To log debug logs during generation, `log=debug` can be set as well.

In addition to running `protoc` manually, the
[Protobuf Plugin for Gradle](https://github.com/google/protobuf-gradle-plugin) can be used. See
[this example](examples/gradle-and-jvm) to see how.

### Runtime Library

Pbandk's runtime library is a thin layer over the preferred Protobuf library for each platform. The libraries are
present on [JitPack](https://jitpack.io/#streem/pbandk). Using Gradle, add the JitPack repository:

```
repositories {
    maven { url 'https://jitpack.io' }
}
```

Then the dependency can be added for JVM libraries:

```
dependencies {
    compile 'com.github.streem.pbandk:pbandk-runtime-jvm:0.8.0'
}
```

It has a dependency on the Google Protobuf Java library. The code targets Java 1.6 to be Android friendly. For Kotlin
JS, change `pbandk-runtime-jvm` to `pbandk-runtime-js` and for common multiplatform code, change `pbandk-runtime-jvm` to
`pbandk-runtime-common`.

### Service Code Generation

Pbandk does not generate gRPC code itself, but offers a `pbandk.gen.ServiceGenerator` interface in the
`protoc-gen-kotlin-jvm` project (really in the `protoc-gen-kotlin-common` project and inherited) with a single method
that can be implemented to generate the code.

To do this, first depend on the project but it will only be needed at compile time because it's already there at
runtime:

```
dependencies {
    compileOnly 'com.github.streem.pbandk:protoc-gen-kotlin-jvm:0.8.0'
}
```

Then, the `kotlin_service_gen` option can be given to `protoc` to use the generator. The option is a path-separated
collection of JAR files to put on the classpath. It can end with a pipe (i.e. `|`) following by the fully-qualified
class name of the implementation of the `ServiceGenerator` to use. If the last part is not present, it will use the
`ServiceLoader` mechanism to find the first implementation to use. For example, to gen with `my.Generator` from
`gen.jar`, it might look like:

```
protoc --kotlin_out=kotlin_service_gen=gen.jar|my.Generator,kotlin_package=my.pkg:src/main/kotlin some.proto
```
 
For more details, see the [custom-service-gen](examples/custom-service-gen) example.

## Generated Code

### Package

The package is either the `kotlin_package` plugin option, the `java_package` protobuf option or the package set in the message. If the `google.protobuf`
package is referenced, it is assumed to be a well-known type and is changed to reference `pbandk.wkt`.

### Message

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

### Oneof

Oneof fields are generated as nested classes of a common sealed base class. Each oneof inner field is a class that
wraps a single value.

The parent message also contains a nullable field for every oneof inner field. This field
resolves to the oneof inner field's value when the oneof is set to that inner field. Otherwise it
resolves to null.

### Enum

Enum fields are generated as sealed classes with a nested `object` for each known enum value, and a
`Unrecognized` nested class to hold unknown values. This is preferred over traditional enum classes
because enums in protobuf are open ended and may not be one of the specific known values. Traditional
enum classes would not be able to capture this state, and using sealed classes this way requires the
user to do explicit checks for the `Unrecognized` value during exhaustive when clauses.

Each enum object contains a `value` field with the numeric value of that enum, and a `name` field
with the string value of that enum. Developers should use the `fromValue` and `fromName` methods
present on the companion object of the sealed class to map from a numeric or string value,
respectively, to the corresponding enum object.

The `values` field on the companion object of the sealed class contains a list of all known enum
values.

### Repeated and Map

Repeated fields are normal lists. Developers should make no assumptions about which list implementation is used. Maps
are represented by Kotlin maps. In proto2, due to how map entries are serialized, both the key and the value are
considered nullable.

### Well-Known Types

Well known types (i.e. those in the `google/protobuf` imports) are shipped with the runtime under the `pbandk.wkt` package.

Specialized support is provided to map the types defined in `google/protobuf/wrappers.proto` into Kotlin nullable primitives (e.g. `String?` for `google.protobuf.StringValue`, `Int?` for `google.protobuf.Int32Value`, etc.). Specialized support for other well-known types (e.g. using Kotlin `Any` for `google.protobuf.Any`) is not yet implemented.

### Services

Services can be handled with a custom service generator. See the "Service Code Generation" section above and the 
[custom-service-gen](examples/custom-service-gen) example.

## Building

The project is built with Gradle and has several sub projects. In alphabetical order, they are:

* `conformance` - Multiplatform code for conformance tests
* `protoc-gen-kotlin` - Multiplatform code for the code generator
* `runtime` - Multiplatform code for runtime Protobuf support

### Code Generator

To generate the `protoc-gen-kotlin` distribution, run:

```
./gradlew :protoc-gen-kotlin:installDist
```

#### Testing Changes Locally in External Project

If you want to make changes to `pbandk`, and immediately test these changes in your separate project,
first install the generator locally:

```
./gradlew :protoc-gen-kotlin:installDist
```
 
This puts the files in the `build/install` folder.  Then you need to tell `protoc` where to find this plugin file.
For example:

```
protoc \
    --plugin=protoc-gen-kotlin=/path/to/pbandk/protoc-gen-kotlin/build/install/protoc-gen-kotlin/bin/protoc-gen-kotlin \
    --kotlin_out=src/main/kotlin \
    src/main/proto/*.proto
```

This will generate kotlin files for the specified `*.proto` files, without needing to publish first.

### Runtime Library

To build the runtime library for both JS and the JVM, run:

```
./gradlew :runtime:assemble
```

### Bundled Types

If any changes are made to the generated code that is output by `protoc-gen-kotlin`, then the
well-known types (and other proto types used by pbandk) need to be re-generated using the updated
`protoc-gen-kotlin` binary. To do this, first download a recent [release of `protoc`](https://github.com/protocolbuffers/protobuf/releases),
extract it to a local directory, and then run:

```
./gradlew :runtime:generateWellKnownTypes -Dprotoc.path=path/to/protobuf/install/directory
./gradlew :protoc-gen-kotlin:generateProto
./gradlew :runtime:generateTestTypes
./gradlew :conformance:generateProto
```

Important: If making changes in both the `:protoc-gen-kotlin` _and_ `:runtime` projects at the
same time, then it's likely the `generateWellKnownTypes` task will fail to compile. To work
around this, stash the changes in the `:runtime` project, run the `generateWellKnownTypes` task
with only the `:protoc-gen-kotlin` changes, and then unstash the `:runtime` changes and rerun the
`generateWellKnownTypes` task.

### Conformance Tests

To run conformance tests, the [conformance-test-runner](https://github.com/google/protobuf/tree/master/conformance) must
be built (does not work on Windows).

```
curl -sSLO https://github.com/protocolbuffers/protobuf/releases/download/v3.10.1/protobuf-all-3.10.1.tar.gz
tar xzvf protobuf-all-3.10.1.tar.gz
cd protobuf-3.10.1
./configure
make
cd conformance
make
```

You should now have a `conformance-test-runner` available in this directory.  Test it by running `./conformance-test-runner --help`

Set the `CONF_TEST_PATH` environment variable (used to run the tests below) with:

```
export CONF_TEST_PATH="$(pwd)/conformance-test-runner"
```

Now, back in `pbandk`, build both the JS and JVM projects via:

```
./gradlew :conformance:assemble
./gradlew :conformance:installDist
```

Bring in javascript dependencies:

```
cd conformance/src/jsMain
yarn
```

You are now ready to run the conformance tests.  Make sure `CONF_TEST_PATH` environment variable is set to `path/to/protobuf/conformance/conformance-test-runner` (see above).

Then, from the root directory:

```
./conformance/test-conformance.sh
```

## Credits

This repository was originally forked from https://github.com/cretz/pb-and-k. Many thanks to https://github.com/cretz for creating this library and building the initial feature set.
