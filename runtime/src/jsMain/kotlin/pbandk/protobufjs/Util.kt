package pbandk.protobufjs

import pbandk.internal.AbstractUtil
import pbandk.internal.asUint8Array

internal val Long.protobufjsLong: dynamic
    get() {
        val ret = js("{}")
        // Legacy compiler exposes Long bits via functions, while IR compiler exposes Long bits
        // via `_high` and `_low` fields
        if (this.asDynamic().getHighBits !== undefined) {
            ret.high = this.asDynamic().getHighBits()
            ret.low = this.asDynamic().getLowBits()
        } else {
            ret.high = this.asDynamic()._high
            ret.low = this.asDynamic()._low
        }
        return ret
    }

internal fun Long.Companion.fromProtobufjsLong(l: dynamic): Long {
    return if (l.low == null || l.high == null) {
        (l as Int).toLong()
    } else {
        // Legacy compiler exposes Long-related function in `Kotlin` namespace, while IR compiler
        // exposes a direct Long constructor
        if (js("typeof Kotlin") !== "undefined") {
            js("Kotlin").Long.fromBits(l.low, l.high) as Long
        } else {
            js("new Long(l.low, l.high)") as Long
        }
    }
}

internal object Util : AbstractUtil() {
    override fun base64ToBytes(str: String): ByteArray = ByteArray(util.base64.length(str)).also {
        util.base64.decode(str, it.asUint8Array(), 0)
    }

    override fun bytesToBase64(bytes: ByteArray): String = bytes.asUint8Array().let { util.base64.encode(it, 0, it.length) }
}
