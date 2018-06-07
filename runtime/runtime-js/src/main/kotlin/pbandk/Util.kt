package pbandk

import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array

val Long.protobufjsLong: dynamic get() {
    val ret = js("{}")
    ret.high = this.asDynamic().getLowBits()
    ret.low = this.asDynamic().getLowBits()
    return ret
}

fun Long.Companion.fromProtobufjsLong(l: dynamic) = js("Kotlin").Long.fromBits(l.lo, l.hi) as Long

inline fun ByteArray.asUint8Array() =
    Uint8Array(unsafeCast<Int8Array>().buffer, unsafeCast<Int8Array>().byteOffset, unsafeCast<Int8Array>().length)
inline fun Uint8Array.asByteArray() =
    Int8Array(buffer, byteOffset, length).unsafeCast<ByteArray>()