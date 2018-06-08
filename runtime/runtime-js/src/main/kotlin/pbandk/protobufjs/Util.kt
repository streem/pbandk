package pbandk.protobufjs

import pbandk.asUint8Array

val Long.protobufjsLong: dynamic get() {
    val ret = js("{}")
    ret.high = this.asDynamic().getHighBits()
    ret.low = this.asDynamic().getLowBits()
    return ret
}

fun Long.Companion.fromProtobufjsLong(l: dynamic) = js("Kotlin").Long.fromBits(l.low, l.high) as Long

object Util {
    fun stringToUtf8(str: String) = ByteArray(util.utf8.length(str)).also { util.utf8.write(str, it.asUint8Array(), 0) }
    fun utf8ToString(bytes: ByteArray) = bytes.asUint8Array().let { util.utf8.read(it, 0, it.length) }
}