[![License](https://img.shields.io/github/license/streem/pbandk)](https://github.com/streem/pbandk/blob/master/LICENSE)
[![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/streem/pbandk?sort=semver)](https://github.com/streem/pbandk/releases)
![GitHub branch checks state](https://img.shields.io/github/checks-status/streem/pbandk/master)

# Pbandk

Pbandk is a Kotlin code generator and runtime for [Protocol Buffers](https://developers.google.com/protocol-buffers/).
It is built to work across multiple Kotlin platforms.

*NOTE*: This is the documentation for the version of pbandk currently in development. Documentation for the latest stable version is available at https://github.com/streem/pbandk/blob/v0.9.1/README.md.

**Features**

* Clean data class generation
* Works for JVM, Android, and JS, with experimental support for Native
* Support for proto2 and proto3 syntaxes
* JSON serialization/deserialization following the [proto3 JSON spec](https://developers.google.com/protocol-buffers/docs/proto3#json) (see https://github.com/streem/pbandk/issues/72 for some corner cases and Well-Known Types that are not handled yet)
* Oneof's are properly handled as sealed classes
* Specialized support to handle wrappers from the well-known types (e.g. `StringValue`, `BoolValue`) as nullable primitives (`String?`, `Boolean?`, etc.)
* JVM platform leverages [Protobuf's Java library](https://developers.google.com/protocol-buffers/docs/javatutorial) for best performance
* JS platform leverages [protobuf.js](https://github.com/dcodeIO/ProtoBuf.js/) for best performance
* Support for custom service/gRPC code generator
* Support for [custom options](https://developers.google.com/protocol-buffers/docs/proto#customoptions)

**Experimental**

* Kotlin/Native support

**Not Yet Implemented**

* Specialized support for more of the well known types (e.g. `Any`)
* Access to the protobuf descriptor from generated code
* Code comments on generated code
* Specialized support for the `deprecated` option

Read below for more information and see the [examples](examples).

## Status

This project is currently in beta. It has the core set of protobuf features implemented and is being used in production. But it is still under active development and new versions might introduce backwards-incompatible changes to support new features or to improve the library's usability in Kotlin. Pull requests are welcome for any of the "Not Yet Implemented" features above.

This project follows semantic versioning. After v1.0.0 is released (mid-2021 at the earliest), future versions will preserve backwards compatibility.

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
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package tutorial

data class Person(
    val name: String = "",
    val id: Int = 0,
    val email: String = "",
    val phones: List<tutorial.Person.PhoneNumber> = emptyList(),
    val lastUpdated: pbandk.wkt.Timestamp? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Person> {
        val defaultInstance by lazy { Person() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Person.decodeWithImpl(u)

        override val descriptors: pbandk.MessageDescriptor<Person> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<Person, *>>(5).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = Person::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = Person::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = Person::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "phones",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<tutorial.Person.PhoneNumber>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = tutorial.Person.PhoneNumber.Companion)),
                        jsonName = "phones",
                        value = Person::phones
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_updated",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "lastUpdated",
                        value = Person::lastUpdated
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = Person::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed class PhoneType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is Person.PhoneType && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "Person.PhoneType.${name ?: "UNRECOGNIZED"}(value=$value)"

        object MOBILE : PhoneType(0, "MOBILE")
        object HOME : PhoneType(1, "HOME")
        object WORK : PhoneType(2, "WORK")
        class UNRECOGNIZED(value: Int) : Person.PhoneType(value)

        companion object : pbandk.Message.Enum.Companion<Person.PhoneType> {
            val values: List<Person.PhoneType> by lazy { listOf(MOBILE, HOME, WORK) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No PhoneType with name: $name")
        }
    }

    data class PhoneNumber(
        val number: String = "",
        val type: tutorial.Person.PhoneType = tutorial.Person.PhoneType.fromValue(0),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<Person.PhoneNumber> {
            val defaultInstance by lazy { Person.PhoneNumber() }
            override fun decodeWith(u: pbandk.MessageDecoder) = Person.PhoneNumber.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<PhoneNumber> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<PhoneNumber, *>>(2).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "number",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "number",
                            value = PhoneNumber::number
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "type",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = tutorial.Person.PhoneType.Companion),
                            jsonName = "type",
                            value = PhoneNumber::type
                        )
                    )
                }
                pbandk.MessageDescriptor(            
                    messageClass = Person.PhoneNumber::class,
                    messageCompanion = this,                    
                    fields = fieldsList
                )
            }
        }
    }
}

data class AddressBook(
    val people: List<tutorial.Person> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: AddressBook?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<AddressBook> {
        val defaultInstance by lazy { AddressBook() }
        override fun decodeWith(u: pbandk.MessageDecoder) = AddressBook.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<AddressBook> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<AddressBook, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "people",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<tutorial.Person>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = tutorial.Person.Companion)),
                        jsonName = "people",
                        value = AddressBook::people
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = AddressBook::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Person?.orDefault() = this ?: Person.defaultInstance

fun Person.PhoneNumber?.orDefault() = this ?: Person.PhoneNumber.defaultInstance

fun AddressBook?.orDefault() = this ?: AddressBook.defaultInstance

// Omitted multiple supporting private extension methods
```

To see a full version of the file, see
[here](examples/gradle-and-jvm/src/main/kotlin/pbandk/examples/addressbook/pb/addressbook.kt). See the "Generated Code"
section below under "Usage" for more details.

## Usage

### Generating Code

Pbandk's code generator leverages `protoc`. Download the [latest
protoc](https://github.com/google/protobuf/releases/latest) and make sure `protoc` is on the `PATH`.
Then download the [latest protoc-gen-kotlin self-executing jar
file](https://jcenter.bintray.com/pro/streem/pbandk/protoc-gen-kotlin-jvm/0.10.0-beta.2/:protoc-gen-kotlin-jvm-0.10.0-beta.2-jvm8.jar),
rename it to `protoc-gen-kotlin`, make the file executable (`chmod +x protoc-gen-kotlin`), and make sure it is on the `PATH`. To generate code from
`sample.proto` and put the generated code in `src/main/kotlin`, run:

```
protoc --kotlin_out=src/main/kotlin sample.proto
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

#### Windows

The self-executing jar file doesn't work on Windows. Also `protoc` doesn't support finding
`protoc-gen-kotlin.bat` on the `PATH`. So it has to be specified explicitly as a plugin. Thus on
Windows you will first need to build `protoc-gen-kotlin` locally:

```
./gradlew :protoc-gen-kotlin:protoc-gen-kotlin-jvm:installDist
```

And then provide the full path to `protoc`:

```
protoc \
    --kotlin_out=src/main/kotlin \
    --plugin=protoc-gen-kotlin=/path/to/pbandk/protoc-gen-kotlin/jvm/build/install/protoc-gen-kotlin/bin/protoc-gen-kotlin.bat \
    sample.proto
```

### Runtime Library

Pbandk's runtime library provides a Kotlin layer over the preferred Protobuf library for each platform. The libraries are
present on JCenter. Using Gradle:

```
repositories {
    jcenter()
}

dependencies {
    // For the `common` sourceset in a Kotlin Multiplatform project:
    implementation("pro.streem.pbandk:pbandk-runtime-common:0.10.0-SNAPSHOT")

    // For Kotlin/JVM sourcesets/projects:
    implementation("pro.streem.pbandk:pbandk-runtime-jvm:0.10.0-SNAPSHOT")

    // For Android sourcesets/projects:
    implementation("pro.streem.pbandk:pbandk-runtime:0.10.0-SNAPSHOT")

    // For Kotlin/JS sourcesets/projects:
    implementation("pro.streem.pbandk:pbandk-runtime-js:0.10.0-SNAPSHOT")

    // For Kotlin/Native sourcesets/projects:
    implementation("pro.streem.pbandk:pbandk-runtime-native:0.10.0-SNAPSHOT")
}
```

Pbandk has a dependency on the preferred Protobuf library on each platform:

- JVM: Google Protobuf Java library.
- Android: Google Protobuf Javalite library. The Android artifact supports SDK 21 or higher.
- JS: protobuf.js.
- Native: Pbandk uses its own pure-Kotlin protobuf implementation that is heavily based on the Google Protobuf Java library.

In addition, support for [Kotlin's `@OptIn` annotation](https://kotlinlang.org/docs/reference/opt-in-requirements.html)
should be enabled in order to avoid compiler warnings in the generated code:

```
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}
```

### Service Code Generation

Pbandk does not generate gRPC code itself, but offers a `pbandk.gen.ServiceGenerator` interface in
the `protoc-gen-kotlin-lib-jvm` project with a single method that can be implemented to generate the
code.

To do this, first depend on the project but it will only be needed at compile time because it's already there at
runtime:

```
dependencies {
    compileOnly("pro.streem.pbandk:protoc-gen-kotlin-lib-jvm:0.10.0-SNAPSHOT")
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

Each Protobuf message extends `pbandk.Message` and has an `encodeToByteArray` method to encode the message with the
Protobuf binary encoding into a byte array. The companion object of every message has a `decodeFromByteArray` method: it
accepts a byte array and returns an instance of the class. Each platform also provides additional `encodeTo*` and
`decodeFrom*` methods that are platform-specific. For example, the JVM provides `encodeToStream` and `decodeFromStream`
methods that operate on Java's `OutputStream` and `InputStream`, respectively, and use
`com.google.protobuf.CodedOutputStream` internally.

Messages are immutable Kotlin data classes. This means they automatically implement `hashCode`, `equals`, and
`toString`. Each class has an `unknownFields` map which contains information about extra fields the decoder didn't
recognize. If there are values in this map, they will be encoded on output. The `MessageDecoder` instances have a
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

* `conformance/js` - Conformance test runner for Kotlin/JS
* `conformance/jvm` - Conformance test runner for Kotlin/JVM
* `conformance/native` - Conformance test runner for Kotlin/Native
* `conformance/lib` - Common multiplatform code for conformance tests
* `protoc-gen-kotlin/jvm` - Kotlin/JVM implementation of the code generator (can generate code for any platform, but requires JVM to run)
* `protoc-gen-kotlin/lib` - Multiplatform code (only Kotlin/JVM supported at the moment) for the code generator and `ServiceGenerator` library
* `runtime` - Multiplatform library for runtime Protobuf support

### Code Generator

To generate the `protoc-gen-kotlin` distribution, run:

```
./gradlew :protoc-gen-kotlin:protoc-gen-kotlin-jvm:assembleDist
```

#### Testing Changes Locally in External Project

If you want to make changes to `pbandk`, and immediately test these changes in your separate project,
first install the generator locally:

```
./gradlew :protoc-gen-kotlin:protoc-gen-kotlin-jvm:installDist
```
 
This puts the files in the `build/install` folder.  Then you need to tell `protoc` where to find this plugin file.
For example:

```
protoc \
    --plugin=protoc-gen-kotlin=/path/to/pbandk/protoc-gen-kotlin/jvm/build/install/protoc-gen-kotlin/bin/protoc-gen-kotlin \
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
./gradlew -Dprotoc.path=path/to/protobuf/install/directory \
    :runtime:generateWellKnownTypes 
    :runtime:generateTestTypes
    :protoc-gen-kotlin:protoc-gen-kotlin-lib:generateProto
    :conformance:conformance-lib:generateProto
```

Important: If making changes in both the `:protoc-gen-kotlin:protoc-gen-kotlin-lib` _and_ `:runtime` projects at the
same time, then it's likely the `generateWellKnownTypes` task will fail to compile. To work
around this, stash the changes in the `:runtime` project, run the `generateWellKnownTypes` task
with only the `:protoc-gen-kotlin:protoc-gen-kotlin-lib` changes, and then unstash the `:runtime` changes and rerun the
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

Now, back in `pbandk`, build all JS. JVM and native projects via:

```
./gradlew :conformance:conformance-lib:assemble :conformance:conformance-jvm:installDist :conformance:conformance-native:build
```

You are now ready to run the conformance tests.  Make sure `CONF_TEST_PATH` environment variable is set to `path/to/protobuf/conformance/conformance-test-runner` (see above).

Then, from the root directory:

```
./conformance/test-conformance.sh
```

Note that by default, the `test-conformance.sh` script will run the conformance test for `jvm`, `js` and `linux`. This will fail when running them on `MacOS` due to missing linux binaries. So in that case, run the tests for each platform individually:

```
./conformance/test-conformance.sh jvm
./conformance/test-conformance.sh js
./conformance/test-conformance.sh macos
```

## Releasing

Releases are handled automatically via CI once the git tag is created.

Setup a couple shell variables to simplify the rest of the commands below:

```sh
export VERSION="0.9.0"
export NEXT_VERSION="0.9.1"
```

To create a new release:
1. Update `CHANGELOG.md`: add a date for the release version, and update the release version's GitHub compare link with a tag instead of `HEAD`.
    * Note: if you are releasing a pre-release version (alpha, beta, rc) then you don't need to update `CHANGELOG.md`
1. Update the pbandk version number in `gradle.properties`, `README.md`, and `examples/*/build.gradle.kts` to remove the `SNAPSHOT` suffix. For example, if the current version is `0.9.0-SNAPSHOT`, then update it to be `0.9.0`.
1. Commit the change. E.g.: `git commit -m "Bump to ${VERSION}" -a`.
1. Tag the new version. E.g.: `git tag -a -m "See https://github.com/streem/pbandk/blob/v${VERSION}/CHANGELOG.md" "v${VERSION}"`.
1. Push the changes to GitHub: `git push origin --follow-tags master`.
1. Wait for CI to notice the new tag, build it, and upload it to Bintray.
1. Create a new release on GitHub. Use the contents of the tag description as the release description. E.g.: `gh release create "v${VERSION}" -F <(git tag -l --format='%(contents)' "v${VERSION}")`.

Then prepare the repository for development of the next version:
1. Update `CHANGELOG.md`: add a section for `NEXT_VERSION` that will follow the released version (e.g. if releasing `0.9.0` then add a section for `0.9.1`).
    * Note: if you are releasing a pre-release version (alpha, beta, rc) then you don't need to update `CHANGELOG.md`
1. Update the pbandk version number in `gradle.properties`, `README.md`, and `examples/*/build.gradle.kts` to `${NEXT_VERSION}-SNAPSHOT`. For example, `0.9.1-SNAPSHOT`.
1. Commit the change. E.g.: `git commit -m "Bump to ${NEXT_VERSION}-SNAPSHOT" -a`.
1. Push the changes to GitHub: `git push origin master`.

## Credits

This repository was originally forked from https://github.com/cretz/pb-and-k. Many thanks to https://github.com/cretz for creating this library and building the initial feature set.
