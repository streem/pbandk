package pbandk.internal.binary

import kotlin.jvm.JvmInline

@JvmInline
internal value class WireType(val value: Int) {
    companion object {
        val VARINT = WireType(0)
        val FIXED64 = WireType(1)
        val LENGTH_DELIMITED = WireType(2)
        val START_GROUP = WireType(3)
        val END_GROUP = WireType(4)
        val FIXED32 = WireType(5)
    }
}