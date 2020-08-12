package pbandk.protobufjs

import pbandk.internal.asUint8Array
import pbandk.wkt.Timestamp
import kotlin.js.Date
import kotlin.math.floor

internal val Long.protobufjsLong: dynamic
    get() {
        val ret = js("{}")
        ret.high = this.asDynamic().getHighBits()
        ret.low = this.asDynamic().getLowBits()
        return ret
    }

internal fun Long.Companion.fromProtobufjsLong(l: dynamic) = js("Kotlin").Long.fromBits(l.low, l.high) as Long

object Util {
    fun stringToUtf8(str: String): ByteArray = ByteArray(util.utf8.length(str)).also {
        util.utf8.write(str, it.asUint8Array(), 0)
    }

    fun utf8ToString(bytes: ByteArray): String = bytes.asUint8Array().let { util.utf8.read(it, 0, it.length) }

    fun base64ToBytes(str: String): ByteArray = ByteArray(util.base64.length(str)).also {
        util.base64.decode(str, it.asUint8Array(), 0)
    }

    fun bytesToBase64(bytes: ByteArray): String = bytes.asUint8Array().let { util.base64.encode(it, 0, it.length) }

    fun timestampToString(ts: Timestamp): String =
        Date((ts.seconds * 1000) + (ts.nanos / 1_000_000)).toISOString()

    fun stringToTimestamp(str: String): Timestamp = Date(str).getTime().let {
        Timestamp(
            seconds = floor(it / 1000.0).toLong(),
            nanos = (it % 1000 * 1_000_000).toInt()
        )
    }
}