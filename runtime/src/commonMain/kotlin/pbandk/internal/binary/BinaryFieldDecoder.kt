package pbandk.internal.binary

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.WireType
import pbandk.internal.binary.kotlin.WireReader

internal class BinaryFieldDecoder(wireReader: WireReader) {
    private val valueDecoder = BinaryFieldValueDecoder(wireReader, this)

    private var lastTag: Tag = Tag.Zero

    /** Returns `true` if a field was found, `false` if there are no more fields to read. */
    inline fun decodeField(valueBlock: (Tag, BinaryFieldValueDecoder) -> Unit): Boolean {
        if (valueDecoder.isAtEnd()) {
            lastTag = Tag.Zero
            return false
        }

        lastTag = Tag(valueDecoder.decodeVarint().decodeUnsignedInt)
        if (lastTag.fieldNumber == 0) {
            // If we actually read zero (or any tag number corresponding to field
            // number zero), that's not a valid tag.
            throw InvalidProtocolBufferException.invalidTag()
        }

        valueBlock(lastTag, valueDecoder)
        return true
    }

    inline fun decodeGroup(fieldNumber: Int, valueBlock: (Tag, BinaryFieldValueDecoder) -> Unit) {
        while (true) {
            val fieldFound = decodeField { tag, valueDecoder ->
                if (tag.wireType == WireType.END_GROUP) {
                    if (tag.fieldNumber != fieldNumber) {
                        throw InvalidProtocolBufferException.invalidEndTag()
                    }
                    return
                }
                valueBlock(tag, valueDecoder)
            }

            if (!fieldFound) {
                throw InvalidProtocolBufferException("Encountered a malformed START_GROUP tag with no matching END_GROUP tag")
            }
        }
    }

    fun skipMessage(): Tag {
        do {
            val fieldFound = decodeField { tag, valueDecoder ->
                if (!valueDecoder.skipField(tag)) {
                    return lastTag
                }
            }
        } while (fieldFound)

        return lastTag
    }
}