package pbandk.binary

import pbandk.PublicForGeneratedCode
import kotlin.jvm.JvmInline

@PublicForGeneratedCode
@JvmInline
public value class WireType internal constructor(internal val value: Int) {
    internal companion object {
        val VARINT = WireType(0)
        val FIXED64 = WireType(1)
        val LENGTH_DELIMITED = WireType(2)
        val START_GROUP = WireType(3)
        val END_GROUP = WireType(4)
        val FIXED32 = WireType(5)
    }
}