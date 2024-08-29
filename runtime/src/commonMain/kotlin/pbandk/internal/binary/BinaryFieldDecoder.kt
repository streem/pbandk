package pbandk.internal.binary

import pbandk.InvalidProtocolBufferException
import pbandk.UnknownField
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.WireType
import pbandk.binary.WireValue
import kotlin.properties.Delegates

internal sealed class BinaryFieldDecoder {
    protected var lastTag: Tag = Tag.Zero

    protected abstract fun isAtEnd(): Boolean
    protected abstract fun readTag(): Tag
    protected abstract fun valueDecoder(): BinaryFieldValueDecoder

    inline fun forEachField(action: (Int, BinaryFieldValueDecoder) -> Unit) {
        while (true) {
            if (isAtEnd()) {
                lastTag = Tag.Zero
                return
            }

            lastTag = readTag()
            val fieldNumber = lastTag.fieldNumber
            val wireType = lastTag.wireType
            if (fieldNumber == 0) {
                // If we actually read zero (or any tag number corresponding to field
                // number zero), that's not a valid tag.
                throw InvalidProtocolBufferException.invalidTag()
            }

            if (wireType == WireType.END_GROUP) {
                return
            }

            action(fieldNumber, valueDecoder())

            // When the current value is a message, `action` will consume the fields of the message. Which means
            // `lastTag` can have a _different_ value after `action` returns than it did beforehand (assuming the same
            // `BinaryFieldDecoder` instance is reused, which is the case for the current implementation).
            //
            // We take advantage of this fact to check if `action` completed because it reached an `END_GROUP` tag.
            if (lastTag.wireType == WireType.END_GROUP) {
                if (lastTag.fieldNumber != fieldNumber || wireType != WireType.START_GROUP) {
                    throw InvalidProtocolBufferException.invalidEndTag()
                }
            } else if (wireType == WireType.START_GROUP && isAtEnd()) {
                throw InvalidProtocolBufferException("Encountered a START_GROUP tag with no matching END_GROUP tag")
            }
        }
    }

    companion object {
        fun fromContext(context: BinaryDecoderContext): BinaryFieldDecoder = FromContext(context)

        fun fromGroupWireValue(groupValue: WireValue.Group): BinaryFieldDecoder = FromGroupValue(groupValue)
    }

    private class FromContext(private val context: BinaryDecoderContext) : BinaryFieldDecoder() {
        override fun valueDecoder() = context.valueDecoder(lastTag.wireType)
        override fun isAtEnd() = context.wireReader.isAtEnd()
        override fun readTag() = Tag(context.varintValueDecoder.decodeValue().decodeUnsignedInt)
    }

    private class FromGroupValue(groupValue: WireValue.Group) : BinaryFieldDecoder() {
        private val unknownFieldIterator = groupValue.value.listIterator()

        private lateinit var valueIterator: ListIterator<UnknownField.Value>
        private var currentFieldNum by Delegates.notNull<Int>()
        private lateinit var currentWireValue: WireValue

        private fun incrementIterator() {
            if (unknownFieldIterator.hasNext()) {
                val field = unknownFieldIterator.next()
                valueIterator = field.values.listIterator()
                currentFieldNum = field.fieldNum
            }
        }

        init {
            incrementIterator()
        }

        override fun isAtEnd(): Boolean {
            return !unknownFieldIterator.hasNext() && !valueIterator.hasNext()
        }

        override fun readTag(): Tag {
            check(!isAtEnd()) { "isAtEnd() should be called before callingn readTag()" }

            if (!valueIterator.hasNext()) {
                incrementIterator()
            }
            currentWireValue = valueIterator.next().wireValue
            return Tag(currentFieldNum, currentWireValue.wireType)
        }

        override fun valueDecoder(): BinaryFieldValueDecoder {
            return BinaryFieldValueDecoder.forWireValue(currentWireValue)
        }
    }
}