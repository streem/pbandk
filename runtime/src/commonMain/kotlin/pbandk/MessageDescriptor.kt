package pbandk

import kotlin.reflect.KClass

class MessageDescriptor<T : Message> @PublicForGeneratedCode constructor(
    internal val messageClass: KClass<T>,
    @ExperimentalProtoReflection
    val messageCompanion: Message.Companion<T>,
    @ExperimentalProtoReflection
    val fields: Collection<FieldDescriptor<T, *>>
)