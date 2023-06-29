package pbandk.gen

import pbandk.ExtendableMessage
import pbandk.ExtensionFieldSet
import pbandk.FieldDescriptor
import pbandk.FieldDescriptorSet
import pbandk.FieldSet
import pbandk.Message
import pbandk.MutableExtendableMessage
import pbandk.MutableExtensionFieldSet
import pbandk.MutableFieldSet
import pbandk.MutableMessage
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField

@Suppress("EqualsOrHashCode")
public abstract class GeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: Map<Int, UnknownField> = emptyMap()
) : AbstractGeneratedMessage<M>() {
    override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeProtoSize() }
    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeHashCode() }
    override fun hashCode(): Int = _hashCode
}

public abstract class MutableGeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : AbstractGeneratedMessage<M>(), MutableMessage<M> {
    override fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M = throw UnsupportedOperationException()
    override fun plus(other: Message?): M = throw UnsupportedOperationException()
}

// TODO: can this class be simplified or the need for it removed completely?
private class ExtendableMessageFieldDescriptors<M : Message>(
    private val ordered: Boolean,
    private val messageFieldDescriptors: FieldDescriptorSet<M>,
    private val extensionFields: FieldSet<M>,
) : Collection<FieldDescriptor<M, out Any?>> {
    override val size: Int get() = messageFieldDescriptors.size + extensionFields.size

    override fun isEmpty(): Boolean = messageFieldDescriptors.isEmpty() && extensionFields.isEmpty()

    override fun iterator(): Iterator<FieldDescriptor<M, out Any?>> = if (ordered) {
        FdOrderedIterator(messageFieldDescriptors.iterator(), extensionFields.iterator())
    } else {
        ConcatIterator(messageFieldDescriptors.iterator(), extensionFields.iterator())
    }

    override operator fun contains(element: FieldDescriptor<M, out Any?>): Boolean =
        element in messageFieldDescriptors || element in extensionFields

    override fun containsAll(elements: Collection<FieldDescriptor<M, out Any?>>): Boolean =
        elements.all { it in this }

    private class ConcatIterator<T>(
        firstIter: Iterator<T>,
        private val lastIter: Iterator<T>
    ) : Iterator<T> {
        private var currentIter = firstIter

        override fun hasNext(): Boolean = when {
            currentIter.hasNext() -> true
            currentIter == lastIter -> false
            else -> {
                currentIter = lastIter
                currentIter.hasNext()
            }
        }

        override fun next(): T = try {
            currentIter.next()
        } catch (e: NoSuchElementException) {
            if (currentIter == lastIter) {
                throw e
            }
            currentIter = lastIter
            currentIter.next()
        }
    }

    private class FdOrderedIterator<M : Message>(
        private val fdIter1: Iterator<FieldDescriptor<M, out Any?>>,
        private val fdIter2: Iterator<FieldDescriptor<M, out Any?>>,
    ) : Iterator<FieldDescriptor<M, out Any?>> {
        private var fd1 = try {
            fdIter1.next()
        } catch (e: NoSuchElementException) {
            null
        }
        private var fd2 = try {
            fdIter2.next()
        } catch (e: NoSuchElementException) {
            null
        }

        override fun hasNext(): Boolean {
            return fd1 != null || fd2 != null || fdIter1.hasNext() || fdIter2.hasNext()
        }

        override fun next(): FieldDescriptor<M, out Any?> {
            return if (fd1 != null) {
                if (fd2 != null) {
                    if (fd1!!.number < fd2!!.number) {
                        val ret = fd1!!
                        fd1 = try {
                            fdIter1.next()
                        } catch (e: NoSuchElementException) {
                            null
                        }
                        ret
                    } else {
                        val ret = fd2!!
                        fd2 = try {
                            fdIter2.next()
                        } catch (e: NoSuchElementException) {
                            null
                        }
                        ret
                    }
                } else {
                    val ret = fd1!!
                    fd1 = try {
                        fdIter1.next()
                    } catch (e: NoSuchElementException) {
                        null
                    }
                    ret
                }
            } else if (fd2 != null) {
                val ret = fd2!!
                fd2 = try {
                    fdIter2.next()
                } catch (e: NoSuchElementException) {
                    null
                }
                ret
            } else {
                throw NoSuchElementException()
            }
        }
    }
}

@Suppress("EqualsOrHashCode")
public abstract class GeneratedExtendableMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    extensionFields: FieldSet<M> = FieldSet.empty(),
    unknownFields: Map<Int, UnknownField> = emptyMap()
) : AbstractGeneratedMessage<M>(), ExtendableMessage<M> {
    override val extensionFields: FieldSet<M> = ExtensionFieldSet(extensionFields, unknownFields)

    @Suppress("CanBePrimaryConstructorProperty")
    override val unknownFields: Map<Int, UnknownField> = unknownFields

    override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeProtoSize() }
    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeHashCode() }
    override fun hashCode(): Int = _hashCode

    override fun fieldDescriptors(ordered: Boolean): Collection<FieldDescriptor<M, out Any?>> {
        return if (extensionFields.isEmpty()) {
            messageDescriptor.fields
        } else {
            ExtendableMessageFieldDescriptors(ordered, messageDescriptor.fields, extensionFields)
        }
    }
}

public abstract class MutableGeneratedExtendableMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : AbstractGeneratedMessage<M>(), MutableExtendableMessage<M> {
    override fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M = throw UnsupportedOperationException()
    override fun plus(other: Message?): M = throw UnsupportedOperationException()

    override val extensionFields: MutableFieldSet<M> = MutableExtensionFieldSet()

    override fun fieldDescriptors(ordered: Boolean): Collection<FieldDescriptor<M, out Any?>> {
        return ExtendableMessageFieldDescriptors(ordered, messageDescriptor.fields, extensionFields)
    }
}