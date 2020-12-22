package pbandk

import kotlin.reflect.KClass

class MessageDescriptor<T : Message>(
    @PublicForGeneratedCode
    val messageClass: KClass<T>,
    @PublicForGeneratedCode
    val messageCompanion: Message.Companion<T>,
    val fields: Collection<FieldDescriptor<T, *>>
)