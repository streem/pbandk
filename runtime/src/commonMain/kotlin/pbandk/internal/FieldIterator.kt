package pbandk.internal

import pbandk.ExtendableMessage
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.gen.messageDescriptor

internal interface FieldIterator<M : Message> : Iterator<FieldDescriptor<M, out Any?>> {
    fun nextValue(): Any?
}

internal inline fun <M : Message> FieldIterator<M>.forEach(operation: (FieldDescriptor<M, out Any?>, Any?) -> Unit) {
    while (hasNext()) {
        val fd = next()
        val value = nextValue()
        operation(fd, value)
    }
}

private fun <T : Any> Iterator<T>.nextOrNull(): T? = if (hasNext()) next() else null

private typealias ForEachFieldFn<M, T> = (FieldDescriptor<M, out T>, T, T) -> Unit

internal inline fun <M : Message> forEachField(first: M, second: M, operation: ForEachFieldFn<M, Any?>) {
    require(first.descriptor == second.descriptor)

    first.messageDescriptor.fields.forEach { fd ->
        operation(fd, fd.getValue(first), fd.getValue(second))
    }

    @Suppress("UNCHECKED_CAST")
    val firstExtensionFields = (first as? ExtendableMessage<M>)?.extensionFields

    @Suppress("UNCHECKED_CAST")
    val secondExtensionFields = (second as? ExtendableMessage<M>)?.extensionFields

    if (firstExtensionFields != null && secondExtensionFields != null) {
        val firstExtensionIter = firstExtensionFields.iterator()
        val secondExtensionIter = secondExtensionFields.iterator()

        var firstFd = firstExtensionIter.nextOrNull()
        var secondFd = secondExtensionIter.nextOrNull()

        while (firstFd != null && secondFd != null) {
            when {
                firstFd == secondFd -> {
                    operation(firstFd, firstExtensionIter.nextValue(), secondExtensionIter.nextValue())
                    firstFd = firstExtensionIter.nextOrNull()
                    secondFd = secondExtensionIter.nextOrNull()
                }

                firstFd.number <= secondFd.number -> {
                    operation(firstFd, firstExtensionIter.nextValue(), firstFd.fieldType.defaultValue)
                    firstFd = firstExtensionIter.nextOrNull()
                }

                else -> {
                    operation(secondFd, secondFd.fieldType.defaultValue, secondExtensionIter.nextValue())
                    secondFd = secondExtensionIter.nextOrNull()
                }
            }
        }

        while (firstFd != null) {
            operation(firstFd, firstExtensionIter.nextValue(), firstFd.fieldType.defaultValue)
            firstFd = firstExtensionIter.nextOrNull()
        }

        while (secondFd != null) {
            operation(secondFd, secondFd.fieldType.defaultValue, secondExtensionIter.nextValue())
            secondFd = secondExtensionIter.nextOrNull()
        }
    }
}