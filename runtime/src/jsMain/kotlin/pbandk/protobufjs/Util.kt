package pbandk.protobufjs

import pbandk.internal.AbstractUtil
import pbandk.internal.asUint8Array

internal val Long.protobufjsLong: dynamic
    get() {
        val ret = js("{}")
        // Kotlin doesn't provide access to the low/high bits that it uses as its internal representation in Kotlin/JS.
        // So we have to manually extract them using bit fiddling.
        ret.high = (this ushr 32).toInt()
        ret.low = (this and 0xffffffffL).toInt()
        return ret
    }

internal fun Long.Companion.fromProtobufjsLong(l: dynamic): Long {
    return if (l.low == null || l.high == null) {
        (l as Int).toLong()
    } else {
        // Kotlin doesn't provide a Long constructor that takes low/high bits separately, so we have to manually
        // construct the Long with bit fiddling.
        ((l.high as Int).toLong() shl 32) or ((l.low as Int).toLong() and 0xffffffffL)
    }
}

internal object Util : AbstractUtil() {
    override fun base64ToBytes(str: String): ByteArray = ByteArray(util.base64.length(str)).also {
        util.base64.decode(str, it.asUint8Array(), 0)
    }

    override fun bytesToBase64(bytes: ByteArray): String = bytes.asUint8Array().let { util.base64.encode(it, 0, it.length) }
}
