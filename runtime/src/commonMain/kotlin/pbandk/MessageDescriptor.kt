package pbandk

import pbandk.internal.types.MessageValueType
import pbandk.internal.types.wkt.customJsonMappings
import pbandk.types.ValueType
import pbandk.wkt.Syntax
import kotlin.js.JsExport
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

    // The syntax used in the file that this message was defined in. Eventually when pbandk is generating
    // FileDescriptors too, then this can reference the value from the FileDescriptor. For now, we store it in each
    // message separately.
    internal val syntax: Syntax,
) {
    /** The message type's unqualified name. */
    public val name: String = fullName.substringAfterLast('.')
}

@JsExport
public class MessageDescriptor<M : Message> private constructor(
    internal val metadata: MessageMetadata,
    internal val messageClass: KClass<M>,
    internal val builder: (MutableMessage<M>.() -> Unit) -> M,
    @ExperimentalProtoReflection
    public val messageCompanion: Message.Companion<M>,
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

    internal val messageValueType: MessageValueType<M> get() = messageCompanion.messageValueType as MessageValueType<M>

    public companion object {
        @JsExport.Ignore
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
            messageCompanion = messageCompanion,
            // Keep fields sorted by number so that message encoding outputs fields in order by number. This is not
            // required by the protobuf encoding spec, but is recommended (and is implemented by the official C++, Java,
            // and Python implementations).
            fields = FieldDescriptorSet((fields + oneofs.flatMap { it.fields }).sortedBy { it.number }),
            oneofs = oneofs
        )
    }
}
