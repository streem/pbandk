package pbandk.internal

import pbandk.FieldDescriptor
import pbandk.FieldSet
import pbandk.Message
import pbandk.MutableMessage
import pbandk.gen.GeneratedExtendableMessage
import pbandk.gen.messageDescriptor

internal interface FieldIterator<M : Message> : Iterator<FieldDescriptor<M, out MutableMessage<M>, out Any?>> {
    fun nextValue(): Any?
}

internal inline fun <M : Message> FieldIterator<M>.forEach(operation: (FieldDescriptor<M, out MutableMessage<M>, out Any?>, Any?) -> Unit) {
    while (hasNext()) {
        val fd = next()
        val value = nextValue()
        operation(fd, value)
    }
}

internal fun <M : Message> M.fieldIterator(): FieldIterator<M> {
    val iter = messageDescriptor.fields.iteratorFor(this)
    return if (this is GeneratedExtendableMessage<*>) {
        @Suppress("UNCHECKED_CAST")
        (ConcatFieldIterator(iter, (extensionFields as FieldSet<M>).iterator()))
    } else {
        iter
    }
}

private fun <T : Any> Iterator<T>.nextOrNull(): T? = if (hasNext()) next() else null

internal inline fun <M : Message> forEachField(first: M, second: M, operation: (FieldDescriptor<M, out MutableMessage<M>, out Any?>, Any?, Any?) -> Unit) {
    require(first.descriptor == second.descriptor)

    val firstIter = first.messageDescriptor.fields.iteratorFor(first)
    val secondIter = second.messageDescriptor.fields.iteratorFor(second)
    while (firstIter.hasNext()) {
        val firstFd = firstIter.next()
        secondIter.next()
        operation(firstFd, firstIter.nextValue(), secondIter.nextValue())
    }

    if (first is GeneratedExtendableMessage<*> && second is GeneratedExtendableMessage<*>) {
        @Suppress("UNCHECKED_CAST")
        val firstExtensionIter = (first.extensionFields as FieldSet<M>).iterator()
        @Suppress("UNCHECKED_CAST")
        val secondExtensionIter = (second.extensionFields as FieldSet<M>).iterator()

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
                    operation(firstFd, firstExtensionIter.nextValue(), firstFd.type.defaultValue)
                    firstFd = firstExtensionIter.nextOrNull()
                }
                else -> {
                    operation(secondFd, secondFd.type.defaultValue, secondExtensionIter.nextValue())
                    secondFd = secondExtensionIter.nextOrNull()
                }
            }
        }

        while (firstFd != null) {
            operation(firstFd, firstExtensionIter.nextValue(), firstFd.type.defaultValue)
            firstFd = firstExtensionIter.nextOrNull()
        }

        while (secondFd != null) {
            operation(secondFd, secondFd.type.defaultValue, secondExtensionIter.nextValue())
            secondFd = secondExtensionIter.nextOrNull()
        }
    }
}

internal class ConcatFieldIterator<M : Message>(
    firstIter: FieldIterator<M>,
    private val lastIter: FieldIterator<M>
) : FieldIterator<M> {
    private var currentIter = firstIter

    override fun hasNext(): Boolean = when {
        currentIter.hasNext() -> true
        currentIter == lastIter -> false
        else -> {
            currentIter = lastIter
            currentIter.hasNext()
        }
    }

    override fun next(): FieldDescriptor<M, out MutableMessage<M>, out Any?> = try {
        currentIter.next()
    } catch (e : NoSuchElementException) {
        if (currentIter == lastIter) {
            throw e
        }
        currentIter = lastIter
        currentIter.next()
    }

    override fun nextValue(): Any? = currentIter.nextValue()
}