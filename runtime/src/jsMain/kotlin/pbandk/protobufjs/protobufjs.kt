@file:JsModule("protobufjs/light")
package pbandk.protobufjs

import org.khronos.webgl.Uint8Array

external class Reader {
    val len: Int
    val pos: Int

    fun bool(): Boolean
    fun bytes(): Uint8Array
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
        fun create(buf: Uint8Array): Reader
    }
}

external class Writer {
    val len: Int

    fun bool(value: Boolean): Writer
    fun bytes(value: Uint8Array): Writer
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
    fun <T>_push(func: (value: T, buf: ByteArray, pos: Int) -> Unit, len: Int, value: T)


    fun finish(): Uint8Array

    companion object {
        fun create(): Writer
    }
}

external class util {
    class utf8 {
        companion object {
            fun length(str: String): Int
            fun write(str: String, arr: Uint8Array, offset: Int): Int
            fun read(buf: Uint8Array, start: Int, end: Int): String
        }
    }
}