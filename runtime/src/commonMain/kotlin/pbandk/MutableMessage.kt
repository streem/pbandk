package pbandk

@DslMarker
public annotation class MessageBuilderMarker

@MessageBuilderMarker
public interface MutableMessage<M : Message> : Message {
    override val unknownFields: MutableMap<Int, UnknownField>

    /**
     * Returns the value of the protocol buffer field from this message that is described by [fieldDescriptor]. If this
     * message does not contain a value for this field, the field's default value will be returned.
     *
     * [fieldDescriptor] can be a descriptor for an extension field that was not defined on the original message, but it
     * _MUST_ be a descriptor for fields in messages of type [M].
     */
    // @ExperimentalProtoReflection
    // public fun <V> updateFieldValue(fieldDescriptor: FieldDescriptor<M, V>, value: V)

    public fun <V> getMutableFieldValue(fieldDescriptor: FieldDescriptor<M, V>): V

}