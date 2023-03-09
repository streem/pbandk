[![License](https://img.shields.io/github/license/streem/pbandk)](https://github.com/streem/pbandk/blob/master/LICENSE)
[![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/streem/pbandk?sort=semver)](https://github.com/streem/pbandk/releases)
![GitHub branch checks state](https://img.shields.io/github/checks-status/streem/pbandk/master)

# Pbandk

Pbandk is a Kotlin code generator and runtime for [Protocol Buffers](https://developers.google.com/protocol-buffers/).
It is built to work across multiple Kotlin platforms.

**NOTE**: This is the documentation for the version of pbandk currently in development. **Documentation for the latest stable version** is available at https://github.com/streem/pbandk/blob/v0.14.2/README.md.

**Features**

* Clean data class generation
* Works for JVM, Android, JS (both legacy and IR), and Native
* Support for proto2 and proto3 syntaxes
* JSON serialization/deserialization following the [proto3 JSON spec](https://developers.google.com/protocol-buffers/docs/proto3#json) (see https://github.com/streem/pbandk/issues/72 for some corner cases and Well-Known Types that are not handled yet)
* Oneof's are properly handled as sealed classes
* Specialized support to handle wrappers from the well-known types (e.g. `StringValue`, `BoolValue`) as nullable primitives (`String?`, `Boolean?`, etc.)
* Support for custom service/gRPC code generator
* Support for [custom options](https://developers.google.com/protocol-buffers/docs/proto#customoptions)

**Experimental**

* Runtime access to protobuf message and field metadata (aka protobuf reflection)

**Not Yet Implemented**

* Access to the protobuf descriptor from generated code
* Code comments on generated code
* Specialized support for the `deprecated` option

Read below for more information and see the [examples](examples).

## Status

This project is currently in beta. It has the core set of protobuf features implemented and is being used in production. But it is still under active development and new versions might introduce backwards-incompatible changes to support new features or to improve the library's usability in Kotlin. Pull requests are welcome for any of the "Not Yet Implemented" features above.

This project follows semantic versioning. After v1.0.0 is released (mid-2022 at the earliest), future versions will preserve backwards compatibility.

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

public sealed interface Person : pbandk.Message {
    public val name: String
    public val id: Int
    public val email: String
    public val phones: List<Person.PhoneNumber>
    public val lastUpdated: pbandk.wkt.Timestamp?

    override operator fun plus(other: pbandk.Message?): Person
    override val descriptor: pbandk.MessageDescriptor<Person>

    /**
     * The [MutablePerson] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutablePerson.() -> Unit): Person

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<Person, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = Person::descriptor,
                name = "name",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "name",
                value = Person::name,
                mutableValue = MutablePerson::name,
            )
        public val id: pbandk.FieldDescriptor<Person, Int> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = Person::descriptor,
                name = "id",
                number = 2,
                type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                jsonName = "id",
                value = Person::id,
                mutableValue = MutablePerson::id,
            )
        public val email: pbandk.FieldDescriptor<Person, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = Person::descriptor,
                name = "email",
                number = 3,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "email",
                value = Person::email,
                mutableValue = MutablePerson::email,
            )
        public val phones: pbandk.FieldDescriptor<Person, List<Person.PhoneNumber>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = Person::descriptor,
                name = "phones",
                number = 4,
                type = pbandk.FieldDescriptor.Type.Repeated<Person.PhoneNumber>(
                    valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = Person.PhoneNumber.Companion)
                ),
                jsonName = "phones",
                value = Person::phones,
                mutableValue = MutablePerson::phones,
            )
        public val lastUpdated: pbandk.FieldDescriptor<Person, pbandk.wkt.Timestamp?> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = Person::descriptor,
                name = "last_updated",
                number = 5,
                type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                jsonName = "lastUpdated",
                value = Person::lastUpdated,
                mutableValue = MutablePerson::lastUpdated,
            )
    }

    public companion object : pbandk.Message.Companion<Person> {
        public val defaultInstance: Person by lazy(LazyThreadSafetyMode.PUBLICATION) {
            Person {}
        }

        override val descriptor: pbandk.MessageDescriptor<Person> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "tutorial.Person",
                messageClass = Person::class,
                messageCompanion = this,
                builder = ::Person,
                fields = listOf(
                    Person.FieldDescriptors.name,
                    Person.FieldDescriptors.id,
                    Person.FieldDescriptors.email,
                    Person.FieldDescriptors.phones,
                    Person.FieldDescriptors.lastUpdated,
                ),
            )
        }
    }

    public sealed class PhoneType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is Person.PhoneType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "Person.PhoneType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object MOBILE : PhoneType(0, "MOBILE")
        public object HOME : PhoneType(1, "HOME")
        public object WORK : PhoneType(2, "WORK")
        public class UNRECOGNIZED(value: Int) : Person.PhoneType(value)

        public companion object : pbandk.Message.Enum.Companion<Person.PhoneType> {
            public val values: List<Person.PhoneType> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(MOBILE, HOME, WORK)
            }

            override fun fromValue(value: Int): Person.PhoneType =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)

            override fun fromName(name: String): Person.PhoneType =
                values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No PhoneType with name: $name")
        }
    }

    public sealed interface PhoneNumber : pbandk.Message {
        public val number: String
        public val type: Person.PhoneType

        override operator fun plus(other: pbandk.Message?): Person.PhoneNumber
        override val descriptor: pbandk.MessageDescriptor<Person.PhoneNumber>

        /**
         * The [MutablePhoneNumber] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: Person.MutablePhoneNumber.() -> Unit): Person.PhoneNumber

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val number: pbandk.FieldDescriptor<Person.PhoneNumber, String> =
                pbandk.FieldDescriptor.of(
                    messageDescriptor = Person.PhoneNumber::descriptor,
                    name = "number",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(),
                    jsonName = "number",
                    value = Person.PhoneNumber::number,
                    mutableValue = Person.MutablePhoneNumber::number,
                )
            public val type: pbandk.FieldDescriptor<Person.PhoneNumber, Person.PhoneType> =
                pbandk.FieldDescriptor.of(
                    messageDescriptor = Person.PhoneNumber::descriptor,
                    name = "type",
                    number = 2,
                    type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = Person.PhoneType.Companion),
                    jsonName = "type",
                    value = Person.PhoneNumber::type,
                    mutableValue = Person.MutablePhoneNumber::type,
                )
        }

        public companion object : pbandk.Message.Companion<Person.PhoneNumber> {
            public val defaultInstance: Person.PhoneNumber by lazy(LazyThreadSafetyMode.PUBLICATION) {
                Person.PhoneNumber {}
            }

            override val descriptor: pbandk.MessageDescriptor<PhoneNumber> by lazy {
                pbandk.MessageDescriptor.of(
                    fullName = "tutorial.Person.PhoneNumber",
                    messageClass = Person.PhoneNumber::class,
                    messageCompanion = this,
                    builder = Person.Companion::PhoneNumber,
                    fields = listOf(
                        Person.PhoneNumber.FieldDescriptors.number,
                        Person.PhoneNumber.FieldDescriptors.type,
                    ),
                )
            }
        }
    }

    public sealed interface MutablePhoneNumber : Person.PhoneNumber, pbandk.MutableMessage<Person.PhoneNumber> {
        public override var number: String
        public override var type: Person.PhoneType
    }
}

public sealed interface MutablePerson : Person, pbandk.MutableMessage<Person> {
    public override var name: String
    public override var id: Int
    public override var email: String
    public override val phones: MutableList<Person.PhoneNumber>
    public override var lastUpdated: pbandk.wkt.Timestamp?
}

public sealed interface AddressBook : pbandk.Message {
    public val people: List<Person>

    override operator fun plus(other: pbandk.Message?): AddressBook
    override val descriptor: pbandk.MessageDescriptor<AddressBook>

    /**
     * The [MutableAddressBook] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableAddressBook.() -> Unit): AddressBook

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val people: pbandk.FieldDescriptor<AddressBook, List<Person>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = AddressBook::descriptor,
                name = "people",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Repeated<Person>(
                    valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = Person.Companion)
                ),
                jsonName = "people",
                value = AddressBook::people,
                mutableValue = MutableAddressBook::people,
            )
    }

    public companion object : pbandk.Message.Companion<AddressBook> {
        public val defaultInstance: AddressBook by lazy(LazyThreadSafetyMode.PUBLICATION) {
            AddressBook {}
        }

        override val descriptor: pbandk.MessageDescriptor<AddressBook> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "tutorial.AddressBook",
                messageClass = AddressBook::class,
                messageCompanion = this,
                builder = ::AddressBook,
                fields = listOf(
                    AddressBook.FieldDescriptors.people,
                ),
            )
        }
    }
}

public sealed interface MutableAddressBook : AddressBook, pbandk.MutableMessage<AddressBook> {
    public override val people: MutableList<Person>
}

/**
 * The [MutablePerson] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Person(builderAction: MutablePerson.() -> Unit): Person =
    MutablePerson_Impl(
        name = "",
        id = 0,
        email = "",
        phones = pbandk.gen.MutableListField(),
        lastUpdated = null,
    ).also(builderAction).toPerson()

public fun Person?.orDefault(): Person = this ?: Person.defaultInstance

/**
 * The [MutablePhoneNumber] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Person.Companion.PhoneNumber(builderAction: Person.MutablePhoneNumber.() -> Unit): Person.PhoneNumber =
    Person_MutablePhoneNumber_Impl(
        number = "",
        type = Person.PhoneType.fromValue(0),
    ).also(builderAction).toPhoneNumber()

/**
 * The [MutablePhoneNumber] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutablePerson.PhoneNumber(builderAction: Person.MutablePhoneNumber.() -> Unit): Person.PhoneNumber =
    Person.PhoneNumber(builderAction)

public fun Person.PhoneNumber?.orDefault(): Person.PhoneNumber = this ?: Person.PhoneNumber.defaultInstance

/**
 * The [MutableAddressBook] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun AddressBook(builderAction: MutableAddressBook.() -> Unit): AddressBook =
    MutableAddressBook_Impl(
        people = pbandk.gen.MutableListField(),
    ).also(builderAction).toAddressBook()

public fun AddressBook?.orDefault(): AddressBook = this ?: AddressBook.defaultInstance

// Omitted multiple supporting private classes extension methods
```

To see a full version of the file, see
[here](examples/gradle-and-jvm/src/main/kotlin/pbandk/examples/addressbook/pb/addressbook.kt). See the "Generated Code"
section below under "Usage" for more details.

## Usage

### Generating Code

Pbandk's code generator leverages `protoc`. Download the [latest
protoc](https://github.com/google/protobuf/releases/latest) and make sure `protoc` is on the `PATH`.
Then download the [latest released protoc-gen-pbandk self-executing jar
file](https://repo1.maven.org/maven2/pro/streem/pbandk/protoc-gen-pbandk-jvm/0.14.2/protoc-gen-pbandk-jvm-0.14.2-jvm8.jar) (if you're using a SNAPSHOT build of pbandk, you might want to instead download the [latest SNAPSHOT version of protoc-gen-pbandk-jvm-\*-jvm8.jar](https://s01.oss.sonatype.org/content/repositories/snapshots/pro/streem/pbandk/protoc-gen-pbandk-jvm/)),
rename it to `protoc-gen-pbandk`, make the file executable (`chmod +x protoc-gen-pbandk`), and make sure it is on the `PATH`. To generate code from
`sample.proto` and put the generated code in `src/main/kotlin`, run:

```
protoc --pbandk_out=src/main/kotlin sample.proto
```

The file is generated as `sample.kt` in the subdirectories specified by the package. Like other `X_out` arguments,
comma-separated options can be added to `--pbandk_out` before the colon and out dir path:

*   To explicitly set the Kotlin package to `my.pkg`, use the `kotlin_package` option like so:

    ```
    protoc --pbandk_out=kotlin_package=my.pkg:src/main/kotlin sample.proto
    ```

*  If you have multiple proto packages, you can map them using `kotlin_package_mapping` option like so:

    ```
    protoc --pbandk_out=kotlin_package_mapping="simple.package->new.package;foo.bar.*->my.foo.bar.*":src/main/kotlin sample.proto
    ```


*   By default all generated classes have `public` visibility. To change the visibility to `internal`, use the
    `visibility` option like so:

    ```
    protoc --pbandk_out=visibility=internal:src/main/kotlin sample.proto
    ```

*   To log debug logs during generation, `log=debug` can be set as well.

Multiple options can be added to a single `--pbandk_out` argument by separating them with commas.

In addition to running `protoc` manually, the
[Protobuf Plugin for Gradle](https://github.com/google/protobuf-gradle-plugin) can be used. See
[this example](examples/gradle-and-jvm) to see how.

#### Windows

The self-executing jar file doesn't work on Windows. Also `protoc` doesn't support finding
`protoc-gen-pbandk.bat` on the `PATH`. So it has to be specified explicitly as a plugin. Thus on
Windows you will first need to build `protoc-gen-pbandk` locally:

```
./gradlew :protoc-gen-pbandk:protoc-gen-pbandk-jvm:installDist
```

And then provide the full path to `protoc`:

```
protoc \
    --pbandk_out=src/main/kotlin \
    --plugin=protoc-gen-pbandk=/path/to/pbandk/protoc-gen-pbandk/jvm/build/install/protoc-gen-pbandk/bin/protoc-gen-pbandk.bat \
    sample.proto
```

### Runtime Library

Pbandk's runtime library provides a Kotlin layer over the preferred Protobuf library for each platform. The libraries are
present on Maven Central. Using Gradle:

```
repositories {
    // This repository is only needed if using a SNAPSHOT version of pbandk
    maven { url "https://s01.oss.sonatype.org/content/repositories/snapshots/" }

    mavenCentral()
}

dependencies {
    // Can be used from the `common` sourceset in a Kotlin Multiplatform project,
    // or from platform-specific JVM, Android, JS, or Native sourcesets/projects.
    implementation("pro.streem.pbandk:pbandk-runtime:0.14.3-SNAPSHOT")
}
```

Pbandk has a dependency on the preferred Protobuf library on each platform:

- Android: Google Protobuf Javalite library. The Android artifact supports SDK 21 or higher.
- JS: protobuf.js.
- JVM and Native: Pbandk uses its own pure-Kotlin protobuf implementation that is heavily based on the Google Protobuf Java library.

In addition, support for [Kotlin's `@OptIn` annotation](https://kotlinlang.org/docs/reference/opt-in-requirements.html)
should be enabled in order to avoid compiler warnings in the generated code:

```
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}
```

### Service Code Generation

Pbandk does not generate gRPC code itself, but offers a `pbandk.gen.ServiceGenerator` interface in
the `protoc-gen-pbandk-lib-jvm` project with a single method that can be implemented to generate the
code.

To do this, first depend on the project but it will only be needed at compile time because it's already there at
runtime:

```
dependencies {
    compileOnly("pro.streem.pbandk:protoc-gen-pbandk-lib:0.14.3-SNAPSHOT")
}
```

Then, the `kotlin_service_gen` option can be given to `protoc` to use the generator. The option is a path-separated
collection of JAR files to put on the classpath. It can end with a pipe (i.e. `|`) following by the fully-qualified
class name of the implementation of the `ServiceGenerator` to use. If the last part is not present, it will use the
`ServiceLoader` mechanism to find the first implementation to use. For example, to gen with `my.Generator` from
`gen.jar`, it might look like:

```
protoc --pbandk_out=kotlin_service_gen=gen.jar|my.Generator,kotlin_package=my.pkg:src/main/kotlin some.proto
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

Messages are immutable classes with their own implementations of `hashCode`, `equals`, and
`toString`. Each class has an `unknownFields` map which contains information about extra fields the decoder didn't
recognize. If there are values in this map, they will be encoded on output. The `MessageDecoder` instances have a
constructor option to discard unknown fields when reading.

For proto3, the only nullable fields are other messages, oneof fields, and proto3 `optional` fields. Other values have defaults. For proto2,
optional fields are nullable and defaulted as such. Types are basically the same as they would be in Java. However,
`bytes` fields actually use a `pbandk.ByteArr` class which is a simple wrapper around a byte array. This was done
because Kotlin does not handle array fields in data classes predictably and it wasn't worth overriding `equals` and
`hashCode` every time.

Each message has a `protoSize` field that
lazily calculates the size of the message when first invoked. Also, each message has a `plus` operator defined which
follows protobuf merge semantics and a `copy` method to make a copy of the message with some fields modified.

Regardless of `optimize_for` options, the generated code is always the same.

### Oneof

Oneof fields are generated as nested classes of a common sealed base class. Each oneof inner field is a class that
wraps a single value.

The parent message also contains a nullable field for every oneof inner field. This field
resolves to the oneof inner field's value when the oneof is set to that inner field. Otherwise it
resolves to null.

### Enum

Enum fields are generated as sealed classes with a nested `object` for each known enum value, and a
`Unrecognized` nested class to hold unknown values. This is preferred over traditional Kotlin enum classes
because enums in protobuf are open ended and may not be one of the specific known values. Traditional
enum classes would not be able to capture this state, and using sealed classes this way requires the
user to do explicit checks for the `Unrecognized` value during exhaustive `when` clauses.

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

Well known types (i.e. those in the `google/protobuf` imports) are shipped with the runtime under the `pbandk.wkt` package. JSON encoding/decoding of these types follows the custom formats defined in the proto3 JSON specification.

Specialized support is provided to map the types defined in `google/protobuf/wrappers.proto` into Kotlin nullable primitives (e.g. `String?` for `google.protobuf.StringValue`, `Int?` for `google.protobuf.Int32Value`, etc.).

The `google.protobuf.Any` type has 3 extension methods (`Any.isA()`, `Any.unpack()`, and `Any.Companion.pack()`) defined that are analogous to the similarly-named methods in the protobuf-java library.

### Services

Services can be handled with a custom service generator. See the "Service Code Generation" section above and the 
[custom-service-gen](examples/custom-service-gen) example.

## Building

The project is built with Gradle and has several sub projects. In alphabetical order, they are:

* `conformance/js` - Conformance test runner for Kotlin/JS
* `conformance/jvm` - Conformance test runner for Kotlin/JVM
* `conformance/native` - Conformance test runner for Kotlin/Native
* `conformance/lib` - Common multiplatform code for conformance tests
* `protoc-gen-pbandk/jvm` - Kotlin/JVM implementation of the code generator (can generate code for any platform, but requires JVM to run)
* `protoc-gen-pbandk/lib` - Multiplatform code (only Kotlin/JVM supported at the moment) for the code generator and `ServiceGenerator` library
* `runtime` - Multiplatform library for runtime Protobuf support

### Code Generator

To generate the `protoc-gen-pbandk` distribution, run:

```
./gradlew :protoc-gen-pbandk:protoc-gen-pbandk-jvm:assembleDist
```

#### Testing Changes Locally in External Project

If you want to make changes to `pbandk`, and immediately test these changes in your separate project,
first install the generator locally:

```
./gradlew :protoc-gen-pbandk:protoc-gen-pbandk-jvm:installDist
```
 
This puts the files in the `build/install` folder.  Then you need to tell `protoc` where to find this plugin file.
For example:

```
protoc \
    --plugin=protoc-gen-pbandk=/path/to/pbandk/protoc-gen-pbandk/jvm/build/install/protoc-gen-pbandk/bin/protoc-gen-pbandk \
    --pbandk_out=src/main/kotlin \
    src/main/proto/*.proto
```

This will generate kotlin files for the specified `*.proto` files, without needing to publish first.

### Runtime Library

To build the runtime library for JS, JVM, Android, and Native, run:

```
./gradlew :pbandk-runtime:assemble
```

### Bundled Types

If any changes are made to the generated code that is output by `protoc-gen-pbandk`, then the
well-known types (and other proto types used by pbandk) need to be re-generated using the updated
`protoc-gen-pbandk` binary:

```
./gradlew generateProtos
```

Important: If making changes in both the `:protoc-gen-pbandk:protoc-gen-pbandk-lib` _and_ `:pbandk-runtime` projects at
the same time, then it's likely the `:pbandk-runtime:generateWellKnownTypeProtos` task will fail to compile. To work
around this, stash the changes in the `:pbandk-runtime` project, run the `generateWellKnownTypeProtos` task with only
the `:protoc-gen-pbandk:protoc-gen-pbandk-lib` changes, and then unstash the `:pbandk-runtime` changes and rerun the
`generateWellKnownTypeProtos` task.

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
./gradlew :conformance:conformance-lib:assemble \
    :conformance:conformance-jvm:installDist \
    :conformance:conformance-native:build
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
1. Comment out the note about the stable version of the documentation that is at the top of `README.md` and update it to point at the new version.
1. Commit the change. E.g.: `git commit -m "Bump to ${VERSION}" -a`.
1. Tag the new version. E.g.: `git tag -a -m "See https://github.com/streem/pbandk/blob/v${VERSION}/CHANGELOG.md" "v${VERSION}"`.

Then prepare the repository for development of the next version:
1. Update `CHANGELOG.md`: add a section for `NEXT_VERSION` that will follow the released version (e.g. if releasing `0.9.0` then add a section for `0.9.1`).
    * Note: if you are releasing a pre-release version (alpha, beta, rc) then you don't need to update `CHANGELOG.md`
1. Update the pbandk version number in `gradle.properties`, `README.md`, and `examples/*/build.gradle.kts` to `${NEXT_VERSION}-SNAPSHOT`. For example, `0.9.1-SNAPSHOT`.
1. Uncomment the note about the stable version of the documentation that is at the top of `README.md`.
1. Commit the change. E.g.: `git commit -m "Bump to ${NEXT_VERSION}-SNAPSHOT" -a`.

GitHub will build and publish the new release once it sees the new tag:
1. Push the changes to GitHub: `git push origin --follow-tags master`.
1. Wait for CI to notice the new tag, build it, and upload it to Maven Central.
1. Create a new release on GitHub. Use the contents of the tag description as the release description. E.g.: `gh release create "v${VERSION}" -F <(git tag -l --format='%(contents)' "v${VERSION}")`.


## Credits

This repository was originally forked from https://github.com/cretz/pb-and-k. Many thanks to https://github.com/cretz for creating this library and building the initial feature set.
