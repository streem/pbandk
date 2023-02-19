package pbandk

import pbandk.internal.types.MessageValueType
import pbandk.types.ValueType
import kotlin.reflect.KClass

public class MessageMetadata @PublicForGeneratedCode constructor(
    /**
     * The message type's fully-qualified name, within the proto language's namespace. This differs from
     * the Kotlin name. For example, given this `.proto`:
     *
     * ```proto
     *   package foo.bar;
     *   option java_package = "com.example.protos"
     *   message Baz {}
     * ```
     *
     * `Baz`'s [fullName] is "foo.bar.Baz".
     */
    public val fullName: String,
) {
    /** The message type's unqualified name. */
    public val name: String = fullName.substringAfterLast('.')
}

public class MessageDescriptor<M : Message> private constructor(
    internal val metadata: MessageMetadata,
    internal val messageClass: KClass<M>,
    internal val builder: (MutableMessage<M>.() -> Unit) -> M,
    internal val messageValueType: MessageValueType<M>,
    @ExperimentalProtoReflection
    public val fields: FieldDescriptorSet<M>,
    internal val oneofs: Collection<OneofDescriptor<M, *>>,
) {
    /**
     * The message type's fully-qualified name, within the proto language's namespace. This differs from
     * the Kotlin name. For example, given this `.proto`:
     *
     * ```proto
     *   package foo.bar;
     *   option java_package = "com.example.protos"
     *   message Baz {}
     * ```
     *
     * `Baz`'s [fullName] is "foo.bar.Baz".
     */
    public val fullName: String get() = metadata.fullName

    /** The message type's unqualified name. */
    public val name: String get() = metadata.name

    @ExperimentalProtoReflection
    public val messageCompanion: Message.Companion<M> get() = messageValueType.companion

    public companion object {
        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>> of(
            metadata: MessageMetadata,
            messageClass: KClass<M>,
            messageCompanion: Message.Companion<M>,
            builder: (MM.() -> Unit) -> M,
            fields: Collection<FieldDescriptor<M, *>> = emptyList(),
            oneofs: Collection<OneofDescriptor<M, *>> = emptyList(),
        ): MessageDescriptor<M> = MessageDescriptor(
            metadata = metadata,
            messageClass = messageClass,
            builder = builder,
            messageValueType = MessageValueType(messageCompanion),
            // Keep fields sorted by number so that message encoding outputs fields in order by number. This is not
            // required by the protobuf encoding spec, but is recommended (and is implemented by the official C++, Java,
            // and Python implementations).
            fields = FieldDescriptorSet((fields + oneofs.flatMap { it.fields }).sortedBy { it.number }),
            oneofs = oneofs
        )
    }
}