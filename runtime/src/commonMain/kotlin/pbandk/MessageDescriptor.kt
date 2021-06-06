package pbandk

import kotlin.js.JsExport
import kotlin.reflect.KClass

@JsExport
class MessageDescriptor<T : Message> @PublicForGeneratedCode constructor(
    internal val messageClass: KClass<T>,
    @ExperimentalProtoReflection
    val messageCompanion: Message.Companion<T>,
    @ExperimentalProtoReflection
    val fields: Collection<FieldDescriptor<T, *>>
)
