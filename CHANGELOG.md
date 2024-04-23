# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).


## Up next

### Added

* Support for builders and mutable messages.
    * Note: This version introduces a slight regression for Kotlin/JS IR users. Because of limitations in the Kotlin 1.5 compiler, pbandk-generated classes are no longer annotated with `@JsExport`. The `@JsExport` annotation will be reintroduced in an upcoming release once pbandk is updated to Kotlin 1.6. 

### Changed

### Fixed


## [0.14.4] - Unreleased

[0.14.4]: https://github.com/streem/pbandk/compare/v0.14.3...HEAD

### Added

### Changed

### Fixed


## [0.14.3] - 2024-04-23

[0.14.3]: https://github.com/streem/pbandk/compare/v0.14.2...v0.14.3

### Fixed

* When an enum was defined inside a message that also contained a oneof with the same name as the message name, then the generated code for the enum declaration would fail to compile. This now works. (PR [#255]) (thanks @TheMerski)

[#255]: https://github.com/streem/pbandk/pull/255


## [0.14.2] - 2022-11-18

[0.14.2]: https://github.com/streem/pbandk/compare/v0.14.1...v0.14.2

### Added

* Added ability to override the Kotlin package name for multiple packages by using a wildcard with the `kotlin_package_mapping` parameter to `protoc-gen-pbandk`. See the README for an example. (PR [#232], fixes [#230]) (thanks @Dogacel)

### Changed

### Fixed

* Fixed JSON serialization of default values. (PR [#238], fixes [#235]) (thanks @antongrbin)
    * Fields with explicit presence (such as proto2 `optional` fields) are no longer included in the JSON output when their value is `null`.
    * Fields with explicit presence _are_ included in the JSON output when they contain the default value (e.g. an `optional int32` field with a value of `0`).
    * Message fields with a `null` value are no longer included in the JSON output even if `JsonConfig.outputDefaultValues=true`. Only non-null default values are supposed to be output when `outputDefaultValues=true`.

[#230]: https://github.com/streem/pbandk/issues/230
[#235]: https://github.com/streem/pbandk/issues/235
[#232]: https://github.com/streem/pbandk/pull/232
[#238]: https://github.com/streem/pbandk/pull/238


## [0.14.1] - 2022-06-04

[0.14.1]: https://github.com/streem/pbandk/compare/v0.14.0...v0.14.1

### Added

* `Message.encodeDelimitedToStream()` and `Message.Companion.decodeDelimitedFromStream()`: these methods allow writing/reading multiple length-delimited messages to/from a single Java `OutputStream`/`InputStream`. They are compatible with the encoding used by `protobuf-java`'s `writeDelimitedTo()` and `parseDelimitedFrom()`/`mergeDelimitedFrom()` methods. (PR [#213]) (thanks @JohnLCaron)

### Fixed

* Fixed compile error about an inaccessible `InvalidProtocolBufferException` constructor for generated code that contained proto2 `required` fields. (PR [#222], fixes [#221])

[#221]: https://github.com/streem/pbandk/issues/221
[#213]: https://github.com/streem/pbandk/pull/213
[#222]: https://github.com/streem/pbandk/pull/222


## [0.14.0] - 2022-05-24

[0.14.0]: https://github.com/streem/pbandk/compare/v0.13.0...v0.14.0

### Added

* `proto3` files that use the `optional` keyword are now supported! Fields with `optional` [field presence] will be nullable in generated Kotlin code. (PR [#200], fixes [#34]) (thanks @NiematojakTomasz)
* The `iosSimulatorArm64`, `tvosArm64`, `tvosX64`, `tvosSimulatorArm64`, and `linuxArm64` Kotlin/Native targets are now supported. (PR [#219], fixes [#218])

### Changed

* Kotlin/Native conformance tests on macOS now build using the `macosArm64` target instead of the `macosX64` target when run on an Apple M1 chip. (PR [#219], fixes [#218])

### Fixed

* **[BREAKING CHANGE] (for proto2 required fields only)** Fixed handling of `required` fields in `proto2` files. Required fields will no longer have a default value in generated code. (PR [#216], fixes [#71])
    * Constructing an instance of a message with required fields will now require providing a value for those fields as part of the constructor call.
    * Decoding of a message with required fields will throw an `InvalidProtocolBufferException` if the binary/JSON input did not include the field.
    * Messages with required fields will no longer have a `Companion.defaultInstance` property in the generated code.
* Fixed the `pbandk-protos` library to support Java 8. (PR [#212], fixes [#211])

[field presence]: https://github.com/protocolbuffers/protobuf/blob/master/docs/field_presence.md
[#34]: https://github.com/streem/pbandk/issues/34
[#71]: https://github.com/streem/pbandk/issues/71
[#211]: https://github.com/streem/pbandk/issues/211
[#218]: https://github.com/streem/pbandk/issues/218
[#200]: https://github.com/streem/pbandk/pull/200
[#212]: https://github.com/streem/pbandk/pull/212
[#216]: https://github.com/streem/pbandk/pull/216
[#219]: https://github.com/streem/pbandk/pull/219


## [0.13.0] - 2021-12-08

[0.13.0]: https://github.com/streem/pbandk/compare/v0.12.1...v0.13.0

### Added

* **[BREAKING CHANGE]** Added `MessageDescriptor.fullName` and `MessageDescriptor.name` properties. All protobuf types have to be regenerated using this version of `protoc-gen-pbandk`. (PRs [#184], [#192])
* Added special support for protobuf's `google.protobuf.Any` message type. (PR [#185], fixes [#63], partially fixes [#72])
    * Added `Any.Companion.pack()`, `Any.unpack()`, and `Any.isA()` convenience methods for working with `Any` instances. These methods mirror the same-named methods in other protobuf libraries.
    * The special JSON format used for `google.protobuf.Any` messsages is now correctly used during JSON encoding/decoding. Provide a value for `JsonConfig.typeRegistry` (which can be constructed using the new `typeRegistry {...}` builder) when encoding/decoding JSON messages that contain `google.protobuf.Any` fields.
* Added `visibility` parameter to `protoc-gen-pbandk` to allow changing the visibility of generated code from `public` to `internal`. (PR [#191}, fixes [#190])
* macOS builds of pbandk-runtime now include support for Apple Silicon (i.e. `pbandk-runtime-macosarm64`). (PR [#189])

### Changed

* Updated dependencies to Kotlin 1.5.0 and kotlinx-serialization 1.3.0-RC. (PR [#189], fixes [#171])
    * Updated Kotlin/JS dependencies to protobuf.js 6.11.2.
* Generated code is now compatible with Kotlin's "explicit API" mode. (PR [#191], fixes [#134])

### Fixed

* Suppress warnings about deprecated fields used in generated code. (PRs [#182], [#192], continues [#1])

[#63]: https://github.com/streem/pbandk/issues/63
[#134]: https://github.com/streem/pbandk/issues/134
[#171]: https://github.com/streem/pbandk/issues/171
[#190]: https://github.com/streem/pbandk/issues/190
[#182]: https://github.com/streem/pbandk/pull/182
[#184]: https://github.com/streem/pbandk/pull/184
[#185]: https://github.com/streem/pbandk/pull/185
[#189]: https://github.com/streem/pbandk/pull/189
[#191]: https://github.com/streem/pbandk/pull/191
[#192]: https://github.com/streem/pbandk/pull/192


## [0.12.1] - 2021-11-11

[0.12.1]: https://github.com/streem/pbandk/compare/v0.11.0...v0.12.1

### Added

* Enabled support for Kotlin/JS IR backend. (PR [#147], fixes [#136]) (thanks @itegulov)
    * The runtime is built in `BOTH` mode so that pbandk can be used with the old Kotlin/JS backend or the new IR one.
    * Conformance tests are run against the new IR backend.
    * Most public pbandk APIs are now annotated with `@JsExport` to allow them to be used from Kotlin/JS code compiled with the new IR backend. `@JsExport` doesn't yet support all features of Kotlin, so this annotation is currently applied on a best-effort basis where it's possible to use it.
    * Likewise, generated code is annoated with `@pbandk.Export` (an alias for `@JsExport`) to allow it to be used from Kotlin/JS IR code.
* macOS and iOS builds of pbandk-runtime are now built in CI and available from Maven Central. (PR [#163], fixes [#88]) (thanks @itegulov)
* Files that contain the `deprecated` option in the `.proto` file will now receive a `@Deprecated` annotation in the generated Kotlin code. (PR [#169], fixes [#1])

### Changed

* Switched Kotlin/JS runtime library to use UMD instead of CommonJS (PR [#170], fixes [#60])
* Minor updates to the gradle config for examples (PR [#170])

[#1]: https://github.com/streem/pbandk/issues/1
[#60]: https://github.com/streem/pbandk/issues/60
[#88]: https://github.com/streem/pbandk/issues/88
[#136]: https://github.com/streem/pbandk/issues/136
[#147]: https://github.com/streem/pbandk/pull/147
[#163]: https://github.com/streem/pbandk/pull/163
[#169]: https://github.com/streem/pbandk/pull/169
[#170]: https://github.com/streem/pbandk/pull/170


## 0.12.0 - Do not use


## [0.11.0] - 2021-09-24

[0.11.0]: https://github.com/streem/pbandk/compare/v0.10.0...v0.11.0

### Fixed

* **[BREAKING CHANGE]** Renamed `protoc-gen-kotlin` to `protoc-gen-pbandk` in order to work with `protoc` v3.17.0+. (PR [#162], fixes [#161]) (thanks @kainosk)
    * All references to the `protoc-gen-kotlin` command in build files should be replaced with `protoc-gen-pbandk`.
    * `protoc` commands using `--kotlin_out` should be updated to use `--pbandk_out` instead (`--kotlin_out` is now used by `protoc`'s internal Kotlin generator).
    * Compile dependencies on the `pro.streem.pbandk:protoc-gen-kotlin-lib` artifact should be replaced with `pro.streem.pbandk:protoc-gen-pbandk-lib`.
    * If using the official Protobuf Gradle Plugin, the plugin ID should be changed from "kotlin" to "pbandk" in your gradle files and the plugin artifact should be updated from `pro.streem.pbandk:protoc-gen-kotlin-jvm` to `pro.streem.pbandk:protoc-gen-pbandk-jvm`.

[#161]: https://github.com/streem/pbandk/issues/161
[#162]: https://github.com/streem/pbandk/pull/162


## [0.10.0] - 2021-05-07

[0.10.0]: https://github.com/streem/pbandk/compare/v0.9.1...v0.10.0

### Added

* Experimental support for protobuf [custom options](https://developers.google.com/protocol-buffers/docs/proto#customoptions) on fields. Remaining work is tracked in [#65]. (PRs [#103], [#152])
    * Protobuf messages that declare an extension range now extend from `ExtendableMessage` rather than `Message`.
    * Protobuf extension fields are defined as Kotlin extension properties on the extended class and can be accessed like any other Kotlin property.
* Experimental support for protobuf reflection. All related APIs require opt-in to the `@ExperimentalProtoReflection` annotation for now. (PRs [#103], [#152])
    * `MessageDescriptor` (available via `Message.descriptor` or `Message.Companion.descriptor`) is now part of the public API. Initially only `MessageDescriptor.fields` is public, which provides access to descriptors for all of the message's fields. Additional properties of the message descriptor will be exposed in future versions. Please file an issue on GitHub if there are specific properties you would like to have access to. (PR [#103])
    * `FieldDescriptor` (available via `MessageDescriptor.fields`) is now part of the public API. Initially, the field's `name` and `options` are public, allowing access to custom options defined on the field in the `.proto` file. (PR [#103])
    * A new `Message.getFieldValue(FieldDescriptor)` method can be used to read the value of a protobuf field when iterating over fields generically using `Message.descriptor.fields`.
* `Message.Companion.decodeFromStream()` now takes an optional `expectedSize` parameter to allow reading multiple messages from a single `InputStream`. The method will not read more than `expectedSize` bytes from the stream when decoding the message. (PR [#148])
* Add the ability to unit test the output of `CodeGenerator` (PR [#117], fixes [#48]) (thanks @nbaztec)
* Added a dedicated Android artifact `pbandk-runtime-android` of the `PBandK` runtime. To migrate to this new artifact, replace `implementation("pro.streem.pbandk:pbandk-runtime-jvm:0.9.1")` with `implementation("pro.streem.pbandk:pbandk-runtime:0.10.0")` (PR [#124], fixes [#75]) (thanks @jeroenmols)
* SNAPSHOT builds of the latest code on `master` are now available by including the https://s01.oss.sonatype.org/content/repositories/snapshots/ maven repository in your `build.gradle.kts` files (PR [#148]).
* Conformance tests running on Kotlin/JVM can now be configured to use `ByteBuffer` or `InputStream`/`OutputStream` for their I/O instead of `ByteArray` by setting the `PBANDK_CONFORMANCE_JVM_IO` environment variable. (PR [#148])

### Changed

* Updated to Kotlin 1.4. Projects that are still on Kotlin 1.3 should be able to continue using pbandk, but this configuration is only supported on a best-effort basis (please file a GitHub issue with any problems). Projects are encouraged to update to Kotlin 1.4. (PR [#114], fixes [#86])
* **[BREAKING CHANGE]** Migrated the library from JCenter to Maven Central. Please make sure you have the `mavenCentral()` repository configured in your `build.gradle.kts` files (PRs [#143], [#144], fixes [#120]) (thanks @jeroenmols).
* **[BREAKING CHANGE]** The API and implementation of `UnknownField` changed significantly. If you access the contents of unknown fields in your code, you will need to update to the new API. The unknown field no longer provides access to a decoded version of the field's wire type. Instead it only provides access to the raw binary encoding of the field. (PR [#103])
* `Message.encodeToStream()` now returns the number of bytes that were written to the stream (previously it didn't return anything). (PR [#148])
* `pbandk-runtime` on JVM and Android no longer depends on the `protobuf-java` library. It instead uses the same pure-Kotlin implementation of protobuf primitives that is used by the `pbandk-runtime` on Kotlin/Native. This avoids dependency conflicts with other libraries (such as `com.google.firebase:firebase-perf` on Android). (PRs [#124], [#148], [#151], fixes [#91], [#138]) (thanks @jeroenmols)
* Updated protobuf well-known types to the versions shipped with protobuf 3.15.5.
* Updated `pbandk-runtime-js` dependency on `protobuf.js` to `6.10.2`.
* Building pbandk no longer requires downloading and compiling protobuf. Running conformance tests still requires compiling protobuf however. (PR [#150])

### Fixed

* Added workaround for an error in the Kotlin/JS implementation of `protoMergeImpl()` caused by a Kotlin compiler bug (PR [#103])
* Improved the code generated for messages with a large number of fields to handle even more fields (PR [#103])
* Binary decoding of 64-bit numbers under Kotlin/JS with certain inputs that would previously cause a crash. (PR [#103])

[#48]: https://github.com/streem/pbandk/issues/48
[#65]: https://github.com/streem/pbandk/issues/65
[#75]: https://github.com/streem/pbandk/issues/75
[#86]: https://github.com/streem/pbandk/issues/86
[#91]: https://github.com/streem/pbandk/issues/91
[#120]: https://github.com/streem/pbandk/issues/120
[#138]: https://github.com/streem/pbandk/issues/138
[#103]: https://github.com/streem/pbandk/pull/103
[#114]: https://github.com/streem/pbandk/pull/114
[#117]: https://github.com/streem/pbandk/pull/117
[#124]: https://github.com/streem/pbandk/pull/124
[#125]: https://github.com/streem/pbandk/pull/125
[#143]: https://github.com/streem/pbandk/pull/143
[#144]: https://github.com/streem/pbandk/pull/144
[#148]: https://github.com/streem/pbandk/pull/148
[#150]: https://github.com/streem/pbandk/pull/150
[#151]: https://github.com/streem/pbandk/pull/151
[#152]: https://github.com/streem/pbandk/pull/152


## [0.9.1] - 2021-01-07

[0.9.1]: https://github.com/streem/pbandk/compare/v0.9.0...v0.9.1

### Fixed

* Compile error when proto contains a oneof field with same name as the enclosing message (PR [#104], fixes [#47]) (thanks @nbaztec)
* All remaining JSON conformance test failures for numeric values (PR [#105], partially fixes [#72]) (thanks @nbaztec)

[#47]: https://github.com/streem/pbandk/issues/47
[#72]: https://github.com/streem/pbandk/issues/72
[#104]: https://github.com/streem/pbandk/pull/104
[#105]: https://github.com/streem/pbandk/pull/105


## [0.9.0] - 2020-12-23

[0.9.0]: https://github.com/streem/pbandk/compare/v0.8.1...v0.9.0

### Added

* Support for Kotlin/Native (PR [#76], fixes [#19]) (thanks @sebleclerc)
* JSON encoding/decoding improvements:
    * Support for the `json_name` protobuf field option
    * Custom encoding/decoding for most of the protobuf well-known types: `Duration`, `Timestamp`, `Empty`,  `Struct`, `Value`, `NullValue`, `ListValue`, and all wrapper types
    * Added `JsonConfig` class for configuring JSON encoding/decoding at runtime. Currently supported options include `ignoreUnknownFieldsInInput`, `outputDefaultValues`, and `outputProtoFieldNames` (which match the options documented at https://developers.google.com/protocol-buffers/docs/proto3#json_options), and also `compactOutput`.
* New binary encoding and decoding overloads on Kotlin/JVM:
    * `Message.encodeToStream(java.io.OutputStream)`
    * `Message.Companion.decodeFromStream(java.io.InputStream)`
    * `Message.Companion.decodeFromByteBuffer(java.nio.ByteBuffer)`

### Changed

* **[BREAKING CHANGE]** Artifacts are now published to JCenter under new maven coordinates
    * Runtime library: `pro.streem.pbandk:pbandk-runtime-common:0.9.0`, `pro.streem.pbandk:pbandk-runtime-jvm:0.9.0`, `pro.streem.pbandk:pbandk-runtime-js:0.9.0`, `pro.streem.pbandk:pbandk-runtime-native:0.9.0`
    * Code generation plugin for the protobuf compiler: `pro.streem.pbandk:protoc-gen-kotlin-jvm:0.9.0:jvm8@jar`
    * `ServiceGenerator` library: `pro.streem.pbandk:protoc-gen-kotlin-lib-jvm:0.9.0`
* Projects that use `pbandk` can remove the `kotlinx-serialization` gradle plugin and library dependency if they don't use `kotlinx-serialization` themselves. The library is now an internal implementation detail of `pbandk`. (PR [#69], fixes [#61])
* Completely rewritten implementation of JSON encoding/decoding, fixing numerous bugs in the old version. The new implementation is much more compliant with the [official proto3 JSON spec](https://developers.google.com/protocol-buffers/docs/proto3#json). Remaining incompatibilities are tracked in [#72].
* **[BREAKING CHANGE]** Moved all of the binary and JSON encoding functionality, and most of the decoding functionality, from the generated code to the runtime library. Code generated by old versions of pbandk will not run with this new pbandk version.
* **[BREAKING CHANGE]** Changed `Message` so that it no longer extends from itself. Uses of `Message<T>` should be changed to just `Message`. (PR [#69])
* **[BREAKING CHANGE]** Added `@PbandkInternal` and `@PublicForGeneratedCode` annotations on portions of the public API that are only public for pbandk's internal use or for use from pbandk-generated code. Using these APIs outside of pbandk will generate compiler warnings and errors. If you have a need for using any of these APIs from your project, please file an issue on GitHub describing your use case.
* **[BREAKING CHANGE]** Code that calls any of pbandk's JSON encoding/decoding APIs must now opt-in to the `@ExperimentalProtoJson` annotation. See https://kotlinlang.org/docs/reference/opt-in-requirements.html#opting-in-to-using-api for detailed instructions. Once pbandk's JSON APIs are no longer considered experimental, this annotation will be removed.
* **[BREAKING CHANGE]** Update the public API to follow recent naming conventions from the Kotlin standard library: "marshal"/"unmarshal" is replaced with "encode"/"decode", encoding methods are named `encodeTo*`, and decoding methods are named `decodeFrom*`. (PRs [#69], [#90], fixes [#89])
    * The below methods have been renamed and are now defined as extension methods rather than being part of the `Message` or `Message.Companion` interface. Code that calls these methods will now need to import them first.
        * `Message.protoMarshal()` -> `Message.encodeToByteArray()`
        * `Message.Companion.protoUnmarshal(ByteArray)` -> `Message.Companion.decodeFromByteArray(ByteArray)`
        * `Message.jsonMarshal()` -> `Message.encodeToJsonString()`
        * `Message.Companion.jsonUnmarshal(String)` -> `Message.Companion.decodeFromJsonString(String)`
        * `Message.protoMarshal(pbandk.Marshaller)` -> `Message.encodeWith(pbandk.MessageEncoder)`
    * The below methods have been renamed. They will become extension methods in a future pbandk release.
        * `Message.Companion.protoUnmarshal(pbandk.Unmarshaller)` -> `Message.Companion.decodeWith(pbandk.MessageDecoder)`
    * The below methods have been renamed and are now defined as extension methods rather than being part of the `Message` or `Message.Companion` interface. Code that calls these methods will now need to import them first. The `Json` parameter from `kotlinx-serialization` has been replaced with the new `JsonConfig` type from `pbandk`.
        * `Message.jsonMarshal(kotlinx.serialization.json.Json)` -> `Message.encodeToJsonString(pbandk.json.JsonConfig)`
        * `Message.Companion.jsonUnmarshal(kotlinx.serialization.json.Json, String)` -> `Message.Companion.decodeFromJsonString(String, pbandk.json.JsonConfig)`
    * Replaced `Marshaller` and `Unmarshaller` interfaces with `MessageEncoder` and `MessageDecoder` interfaces, which are much simpler and function differently from the previous interfaces
* **[BREAKING CHANGE]** `MessageMap.entries` is now a `Set` instead of a `List`

### Removed

* **[BREAKING CHANGE]** Removed `Sizer` and `Util` from the public API
* **[BREAKING CHANGE]** Removed `UnknownField` constructors and the `UnknownField.size()` method from the public API

### Fixed

* Crash on Android when encoding `google.protobuf.Timestamp` fields to JSON (PR [#82], fixes [#46])
* `StackOverflowError` when generating code for really large `oneof` objects (PR [#52]) (thanks @tinder-aminghadersohi)
* Performance problems when compiling generated code with Kotlin 1.4 (PR [#101], fixes [#94])
* JSON decoding of unknown enum values (PR [#100])
* Map entry size computation for non-MessageMap maps (PR [#99])
* Some bugs with the handling of `packed` fields, binary encoding of enums in Kotlin/JS, and base64 encoding/decoding in Kotlin/JS (PR [#69], fixes [#23])
* Various conformance test failures (PRs [#80], [#82])

[#19]: https://github.com/streem/pbandk/issues/19
[#23]: https://github.com/streem/pbandk/issues/23
[#46]: https://github.com/streem/pbandk/issues/46
[#52]: https://github.com/streem/pbandk/pull/52
[#61]: https://github.com/streem/pbandk/issues/61
[#69]: https://github.com/streem/pbandk/pull/69
[#72]: https://github.com/streem/pbandk/issues/72
[#76]: https://github.com/streem/pbandk/pull/76
[#80]: https://github.com/streem/pbandk/pull/80
[#82]: https://github.com/streem/pbandk/pull/82
[#89]: https://github.com/streem/pbandk/issues/89
[#90]: https://github.com/streem/pbandk/pull/90
[#94]: https://github.com/streem/pbandk/issues/94
[#99]: https://github.com/streem/pbandk/pull/99
[#100]: https://github.com/streem/pbandk/pull/100
[#101]: https://github.com/streem/pbandk/pull/101


## [0.8.1] - 2020-05-22

[0.8.1]: https://github.com/streem/pbandk/compare/v0.8.0...v0.8.1

### Added

* Enable conformance tests for Kotlin/JS

### Changed

* **[BREAKING CHANGE]** Update to kotlin 1.3.72 and kotlinx.serialization 0.20.0. Projects that depend on `pbandk` must be using the same versions of kotlin and kotlinx.serialization. (fixes [#35])
* **[BREAKING CHANGE]** The `pbandk-runtime-common` maven package is now just called `pbandk-runtime`. The `protoc-gen-kotlin-jvm` maven package is now called `protoc-gen-kotlin-lib-jvm`. The `pbandk-runtime-jvm` and `pbandk-runtime-js` packages have not changed names.
* Use the new Kotlin multiplatform gradle plugin instead of the deprecated plugin (thanks @sebleclerc)
* Switch from Groovy to Kotlin for build.gradle files (thanks @sebleclerc)
* Update to gradle 6.2.2 (thanks @sebleclerc)
* Use the `maven-publish` gradle plugin instead of the `maven` plugin (thanks @sebleclerc)

### Fixed

* Name collision with nested types (fixes [#24]) (thanks @sebleclerc)
* Fix gradle configs for all examples and build them in CI so they don't break in the future (fixes [#37] and [#41])

[#24]: https://github.com/streem/pbandk/issues/24
[#35]: https://github.com/streem/pbandk/issues/35
[#37]: https://github.com/streem/pbandk/issues/37
[#41]: https://github.com/streem/pbandk/issues/41
