package pbandk.protobufjs

val Long.protobufjsLong: dynamic get() {
    val ret = js("{}")
    ret.high = this.asDynamic().getLowBits()
    ret.low = this.asDynamic().getLowBits()
    return ret
}

fun Long.Companion.fromProtobufjsLong(l: dynamic) = Long.Companion.asDynamic().fromBits(l.lo, l.hi) as Long