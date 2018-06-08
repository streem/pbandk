package pbandk.protobufjs

val Long.protobufjsLong: dynamic get() {
    val ret = js("{}")
    ret.high = this.asDynamic().getHighBits()
    ret.low = this.asDynamic().getLowBits()
    return ret
}

fun Long.Companion.fromProtobufjsLong(l: dynamic) = js("Kotlin").Long.fromBits(l.low, l.high) as Long