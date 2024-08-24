package pbandk

import kotlin.js.JsExport
import kotlin.reflect.KClass

@Export
public class MessageDescriptor<T : Message>
@JsExport.Ignore
@PublicForGeneratedCode
constructor(
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

    @ExperimentalProtoReflection
    public val fields: Collection<FieldDescriptor<T, *>>
) {
    /** The message type's unqualified name. */
    public val name: String = fullName.substringAfterLast('.')
}