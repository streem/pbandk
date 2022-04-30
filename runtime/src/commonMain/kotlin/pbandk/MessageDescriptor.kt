package pbandk

import kotlin.js.JsExport
import kotlin.reflect.KClass

@JsExport
public class MessageDescriptor<M : Message> private constructor(
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

    internal val messageClass: KClass<M>,

    @ExperimentalProtoReflection
    public val messageCompanion: Message.Companion<M>,

    internal val builder: (MutableMessage<M>.() -> Unit) -> M,

    @ExperimentalProtoReflection
    public val fields: FieldDescriptorSet<M>,

    internal val oneofs: Collection<OneofDescriptor<M, *>>,
) {
    /** The message type's unqualified name. */
    public val name: String = fullName.substringAfterLast('.')

    public companion object {
        @PublicForGeneratedCode
        @Suppress("UNCHECKED_CAST")
        public fun <M : Message, MM : MutableMessage<M>> of(
            fullName: String,
            messageClass: KClass<M>,
            messageCompanion: Message.Companion<M>,
            builder: (MM.() -> Unit) -> M,
            fields: Collection<FieldDescriptor<M, *>> = emptyList(),
            oneofs: Collection<OneofDescriptor<M, *>> = emptyList(),
        ): MessageDescriptor<M> = MessageDescriptor(
            fullName = fullName,
            messageClass = messageClass,
            messageCompanion = messageCompanion,
            builder = builder as ((MutableMessage<M>.() -> Unit) -> M),
            // Keep fields sorted by number so that message encoding outputs fields in order by number. This is not
            // required by the protobuf encoding spec, but is recommended (and is implemented by the official C++, Java,
            // and Python implementations).
            fields = FieldDescriptorSet((fields + oneofs.flatMap { it.fields }).sortedBy { it.number }),
            oneofs = oneofs
        )
    }
}
