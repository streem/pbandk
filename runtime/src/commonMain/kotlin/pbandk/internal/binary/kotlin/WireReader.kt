package pbandk.internal.binary.kotlin

import pbandk.InvalidProtocolBufferException

internal interface WireReader {
    fun read(length: Int): ByteArray
    fun readByte(): Byte
    fun isAtEnd(): Boolean
    fun skipRawBytes(length: Int)
}

internal class LimitingWireReader(private val wireReader: WireReader) : WireReader {
    private var consumed: Int = 0
    private var curLimit: Int? = null

    override fun isAtEnd(): Boolean = (consumed == curLimit) || (curLimit == null && wireReader.isAtEnd())

    fun pushLimit(len: Int): Int? {
        require(len >= 0)
        val old = curLimit
        curLimit = consumed + len
        return old
    }

    fun popLimit(oldLimit: Int?) {
        require(oldLimit == null || oldLimit >= 0)
        curLimit = oldLimit
    }

    override fun read(length: Int): ByteArray {
        return when {
            length == 0 -> byteArrayOf()

            length < 0 -> throw InvalidProtocolBufferException.negativeSize()

            consumed + length <= (curLimit ?: Int.MAX_VALUE) -> {
                consumed += length
                require(length <= Int.MAX_VALUE)
                wireReader.read(length)
            }

            else -> throw InvalidProtocolBufferException.truncatedMessage()
        }
    }

    override fun readByte(): Byte {
        return when {
            consumed < (curLimit ?: Int.MAX_VALUE) -> {
                consumed += 1
                wireReader.readByte()
            }

            else -> throw InvalidProtocolBufferException.truncatedMessage()
        }
    }

    override fun skipRawBytes(length: Int) {
        when {
            length == 0 -> return

            length < 0 -> throw InvalidProtocolBufferException.negativeSize()

            consumed + length <= (curLimit ?: Int.MAX_VALUE) -> {
                consumed += length
                require(length <= Int.MAX_VALUE)
                wireReader.skipRawBytes(length)
            }

            else -> throw InvalidProtocolBufferException.truncatedMessage()
        }
    }
}