@file:JsModule("protobufjs/light")
package pbandk.protobufjs

external class Reader {
    val len: Int
    val pos: Int

    fun bool(): Boolean
    fun bytes(): ByteArray
    fun double(): Double
    fun fixed32(): Int
    fun fixed64(): dynamic
    fun float(): Float
    fun int32(): Int
    fun int64(): dynamic
    fun sfixed32(): Int
    fun sfixed64(): dynamic
    fun sint32(): Int
    fun sint64(): dynamic
    fun string(): String
    fun uint32(): Int
    fun uint64(): dynamic

    fun skipType(wireType: Int): Reader

    companion object {
        fun create(buf: ByteArray): Reader
    }
}

external class Writer {

    fun fork(): Writer
    fun ldelim(): Writer

    fun bool(value: Boolean): Writer
    fun bytes(value: ByteArray): Writer
    fun double(value: Double): Writer
    fun fixed32(value: Int): Writer
    fun fixed64(value: dynamic): Writer
    fun float(value: Float): Writer
    fun int32(value: Int): Writer
    fun int64(value: dynamic): Writer
    fun sfixed32(value: Int): Writer
    fun sfixed64(value: dynamic): Writer
    fun sint32(value: Int): Writer
    fun sint64(value: dynamic): Writer
    fun string(value: String): Writer
    fun uint32(value: Int): Writer
    fun uint64(value: dynamic): Writer

    fun finish(): ByteArray

    companion object {
        fun alloc(size: Int): Writer
    }
}

external class util {
    class utf8 {
        companion object {
            fun length(str: String): Int
            fun write(str: String, arr: ByteArray, offset: Int): Int
        }
    }
}