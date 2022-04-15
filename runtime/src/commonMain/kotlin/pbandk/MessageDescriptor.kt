package pbandk

import kotlin.js.JsExport
import kotlin.reflect.KClass

@JsExport
public class MessageDescriptor<T : Message> @PublicForGeneratedCode constructor(
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

    internal val messageClass: KClass<T>,

    @ExperimentalProtoReflection
    public val messageCompanion: Message.Companion<T>,

    fields: Collection<FieldDescriptor<T, *>>
) {
    /** The message type's unqualified name. */
    public val name: String = fullName.substringAfterLast('.')

    @ExperimentalProtoReflection
    public val fields: FieldDescriptorSet<T> = FieldDescriptorSet(fields)
}
