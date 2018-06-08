package pbandk.impl

import pbandk.Message
import pbandk.UnknownField

abstract class Unmarshaller(val discardUnknownFields: Boolean) {
    var currentUnknownFields = if (discardUnknownFields) null else mutableMapOf<Int, UnknownField>()

    abstract fun <T> withRestrictedLimit(len: Int, fn: () -> T): T

    /*
    fun <T : Message<T>> readMessage(s: Message.Companion<T>) = withRestrictedLimit(readInt32)
        val oldLimit = stream.pushLimit(stream.readRawVarint32())
        val oldUnknownFields = currentUnknownFields
        if (!discardUnknownFields) currentUnknownFields = mutableMapOf()
        val ret = s.protoUnmarshal(this)
        require(stream.isAtEnd) { "Not at the end of the current message limit as expected" }
        stream.popLimit(oldLimit)
        currentUnknownFields = oldUnknownFields
        return ret
    }*/
}