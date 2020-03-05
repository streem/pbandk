package pbandk.protobufjs

import pbandk.asUint8Array
import pbandk.wkt.Timestamp
import kotlin.js.Date
import kotlin.math.floor

val Long.protobufjsLong: dynamic
    get() {
        val ret = js("{}")
        ret.high = this.asDynamic().getHighBits()
        ret.low = this.asDynamic().getLowBits()
        return ret
    }

fun Long.Companion.fromProtobufjsLong(l: dynamic) = js("Kotlin").Long.fromBits(l.low, l.high) as Long

object Util : pbandk.UtilInterface {
    override fun stringToUtf8(str: String) = ByteArray(util.utf8.length(str)).also { util.utf8.write(str, it.asUint8Array(), 0) }
    override fun utf8ToString(bytes: ByteArray) = bytes.asUint8Array().let { util.utf8.read(it, 0, it.length) }

    override fun base64ToBytes(str: String) = js("Buffer").from(str, "base64")
    override fun bytesToBase64(bytes: ByteArray) = js("Buffer").from(bytes).toString("base64")

    override fun timestampToString(ts: Timestamp.JsonMapper) =
        Date(((ts.seconds ?: 0) * 1000) + ((ts.nanos ?: 0) / 1_000_000)).toISOString()

    override fun stringToTimestamp(str: String) = Date(str).getTime().let {
        Timestamp.JsonMapper(
            seconds = floor(it / 1000.0).toLong(),
            nanos = (it % 1000 * 1_000_000).toInt()
        )
    }
}