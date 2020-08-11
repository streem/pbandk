package pbandk.protobufjs

import pbandk.internal.AbstractUtil
import pbandk.internal.asUint8Array

internal val Long.protobufjsLong: dynamic
    get() {
        val ret = js("{}")
        ret.high = this.asDynamic().getHighBits()
        ret.low = this.asDynamic().getLowBits()
        return ret
    }

internal fun Long.Companion.fromProtobufjsLong(l: dynamic) = js("Kotlin").Long.fromBits(l.low, l.high) as Long

object Util : AbstractUtil() {
    fun stringToUtf8(str: String): ByteArray = ByteArray(util.utf8.length(str)).also {
        util.utf8.write(str, it.asUint8Array(), 0)
    }

    fun utf8ToString(bytes: ByteArray): String = bytes.asUint8Array().let { util.utf8.read(it, 0, it.length) }

    override fun base64ToBytes(str: String): ByteArray = ByteArray(util.base64.length(str)).also {
        util.base64.decode(str, it.asUint8Array(), 0)
    }

    override fun bytesToBase64(bytes: ByteArray): String = bytes.asUint8Array().let { util.base64.encode(it, 0, it.length) }
}
