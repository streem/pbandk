## Builders / Interfaces

- [x] convert copy() method to use a builder
- [x] change collections from `var` to `val` with `MutableList`/`MutableMap`
- [x] get rid of `nested` in `CodeGenerator`
- [x] convert plus() method to use a builder
- [x] remove the ability to use a `MutableFoo` outside of a `builderAction`, for now 
- [x] add Dsl marker annotation to mutable classes
- [ ] Clean up new `MessageDecoder.readMessage()` implementations and factor out common code
- [ ] Clean up repeated code in `CodeGenerator`
- [X] Rebase on top of required fields PR: https://github.com/streem/pbandk/pull/216

### Enhancements

- [x] generate ReplaceWith for @Deprecated annotations
- [x] rename `MessageMap` to `MapField`
- [x] rename `ListWithSize` to `ListField`
- [x] Replace `decodeWith` in the generated code with a runtime implementation

### Extendable Messages

- [X] Implement `ExtendableMessage.setExtension()`
- [X] Make sure `ExtendableMessage` and `MutableExtendableMessage` include extension fields in all of the standard method implementations
- [X] Use full name for extension fields in JSON and toString output
- [X] Support extension fields nested in messages
- [X] All non-repeated extension fields should have presence (i.e. be treated as if they are optional), even if defined in proto3 without the `optional` keyword
    - see https://github.com/protocolbuffers/protobuf/issues/8234
- [X] Ensure `FieldDescriptor.Repeated.updateValue` does the right thing and updates the existing list rather than overwriting it
    - might also impact the way the `MutableExtendableMessage.setExtension()` method works
    - write some unit tests

### Other

- [X] Convert `FieldDescriptor.Type` constructor calls to factory functions
- [X] Make sure maps are deserialized properly: null keys and null values should be replaced with default values
    - include unknown field decoding
- [X] Refactor `FieldDescriptor` to split out a separate `FieldAccessor`
- [ ] Update to Kotlin 1.8
- [ ] Update to latest protobuf conformance tests

## FieldType / ValueType

- [X] Implement decoding support
- [X] ~~Expose `ValueType` on `MessageDescriptor` and use that from `ValueTypes.Any`~~
- [X] Implement `ValueType` for every primitive and WKT type
- [X] Implement the body of `BinaryFieldEncoder`, `BinaryFieldValueEncoder`, `JsonFieldEncoder`, `JsonFieldValueEncoder`
- [X] Get rid of `protobuf.js` dependency
- [X] Redo the split of what gets done in `ValueType` vs `Json/BinaryFieldValueEncoder`
- [X] Move `Sizer` functionality into `ValueType`
- [X] Update binary decoding to stop passing around the `tag` and to include the wire type in the value decoder type
- [X] Ensure that decoding multiple message field values in the same message will merge all of the messages
- [X] Update unknown field decoding to work with new decoders
- [ ] Write unit test for recursively-nested protobuf message

## Later

- [ ] Use the Kotlin generator when generating protobuf-java code, and update unit tests to use newer Kotlin syntax
- [ ] Add support for parsing extension fields when doing decoding (probably via an `ExtensionRegistry`)
- [ ] add a `+=` operator for `MutableFoo` messages that does the plus operation in-place
- [ ] Generate accessors for extension fields nested in messages
- [ ] Implement consistent and configurable unknown field handling across binary and JSON encoding/decoding
- [ ] Output a default javadoc comment for each field/message that refers to the protobuf definition of that field/message
- [ ] Add a protoc-gen-pbandk option to generate enum values using CamelCase rather than UPPER\_CASE
- [ ] Optimize `JsonFieldEncoder` and `JsonFieldValueEncoder` to not require a new instance for every field
- [ ] Create an optional `pbandk-runtime-okio` library for multi-platform reading/writing using Okio's I/O primitives
- [ ] Think about whether `Message.Companion.decodeFromByteArray()` for custom `ValueType`s such as `StringValue` should return the Message-derived instance (e.g. `pband.wkt.StringValue`) or the `KotlinType` instance (e.g. `String`). Similarly, `pbandk.wkt.Duration` vs `kotlin.time.Duration`.
- [ ] Provide an `Any.unpack(TypeRegistry)` method to unpack an `Any` using a known companion
- [ ] JSON decoding of an `Any` containing an unknown type should not fail if `JsonConfig.ignoreUnknownFieldsInInput == true`
- [ ] Rename `TypeRegistry.getTypeUrl()` to `TypeRegistry.getByTypeUrl()`
- [ ] Add "generated from and by" comments to the top of the file, and to each field, similar to [protobuf-es](https://github.com/bufbuild/protobuf-es/blob/main/docs/generated_code.md#comments)
- [ ] Store unknown JSON fields, just like we store unknown binary fields (possibly using `google.protobuf.Value` as the container)
- [ ] Implement support for group fields in proto2
- [ ] Explore delegated properties as a way to streamline some of the generated code (extension fields, oneof fields)

---

Field Metadata:
- templated on: Kotlin message type, actual Kotlin field type
- descriptor
- field type adapter
- field accessor

Field Descriptor:
- name
- full name
- number
- JSON name
- FieldOptions
- type
- presence: required, implicit, explicit, repeated
- is extension (maybe)
- is oneof member (maybe)

Field Type:
- syntax type (int32, string, float, etc.)
- binary wire type (varint, i32, i64, length-delimited)
- default value
- JSON wire type maybe? (string, number, bool, struct, list, null)
- base Kotlin type maybe?

Field Type Adapter:
- templated on: actual Kotlin type
- actual Kotlin type
    - can include custom type mappings, such as:
        - kotlin.time.Duration -> google.protobuf.Duration
        - kotlin.Long? -> google.protobuf.Int64Value
        - streem.DomainId -> string
- convert between actual Kotlin type and the field type's Kotlin Type

Field Accessor:
- templated on: message type, mutable message type, actual Kotlin field type
- getValue
- updateValue

Field Encoder:
- can encode any kind of syntax type
- 

Operations:
- given a message, iterate over its fields
- encode/decode a field to binary protobuf
- encode/decode a field to JSON protobuf
- swap in different encode/decode implementations
