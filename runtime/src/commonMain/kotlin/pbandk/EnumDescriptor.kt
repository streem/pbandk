package pbandk

import kotlin.reflect.KClass

public class EnumDescriptor<E : Message.Enum> private constructor(
    /**
     * The enum type's fully-qualified name, within the proto language's namespace. This differs from
     * the Kotlin name. For example, given this `.proto`:
     *
     * ```proto
     *   package foo.bar;
     *   option java_package = "com.example.protos"
     *   enum Baz {}
     * ```
     *
     * `Baz`'s [fullName] is "foo.bar.Baz".
     */
    public val fullName: String,

    internal val enumClass: KClass<E>,

    @ExperimentalProtoReflection
    public val enumCompanion: Message.Enum.Companion<E>,
) {
    /** The  type's unqualified name. */
    public val name: String = fullName.substringAfterLast('.')

    public companion object {
        @PublicForGeneratedCode
        public fun <E : Message.Enum> of(
            fullName: String,
            enumClass: KClass<E>,
            enumCompanion: Message.Enum.Companion<E>,
        ): EnumDescriptor<E> = EnumDescriptor(
            fullName = fullName,
            enumClass = enumClass,
            enumCompanion = enumCompanion,
        )
    }
}
