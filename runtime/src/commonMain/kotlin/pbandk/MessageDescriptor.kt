package pbandk

import kotlin.reflect.KClass

@PublicForGeneratedCode
class MessageDescriptor<T : Message>(
    val messageClass: KClass<T>,
    val messageCompanion: Message.Companion<T>,
    val fields: Collection<FieldDescriptor<T, *>>
)