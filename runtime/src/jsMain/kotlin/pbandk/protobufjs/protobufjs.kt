@file:JsModule("protobufjs/light")
@file:JsNonModule
package pbandk.protobufjs

import org.khronos.webgl.Uint8Array

internal external class Reader {
    val buf: Uint8Array
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

internal external class Writer {
    val len: Int

    fun bool(value: Boolean): Writer
    fun bytes(value: Uint8Array): Writer
    fun double(value: Double): Writer
    fun fixed32(value: Int): Writer
    fun fixed64(value: dynamic): Writer
    fun float(value: Float): Writer
    fun fork(): Writer
    fun int32(value: Int): Writer
    fun int64(value: dynamic): Writer
    fun ldelim(): Writer
    fun reset(): Writer
    fun sfixed32(value: Int): Writer
    fun sfixed64(value: dynamic): Writer
    fun sint32(value: Int): Writer
    fun sint64(value: dynamic): Writer
    fun string(value: String): Writer
    fun uint32(value: Int): Writer
    fun uint64(value: dynamic): Writer
    fun <T> _push(func: (value: T, buf: ByteArray, pos: Int) -> Unit, len: Int, value: T)


    fun finish(): Uint8Array

    companion object {
        fun create(): Writer
    }
}

internal external class util {
    class base64 {
        companion object {
            fun decode(string: String, buffer: Uint8Array, offset: Int): Int
            fun encode(buffer: Uint8Array, start: Int, end: Int): String
            fun length(string: String): Int
            fun test(string: String): Boolean
        }
    }

    class utf8 {
        companion object {
            fun length(str: String): Int
            fun write(str: String, arr: Uint8Array, offset: Int): Int
            fun read(buf: Uint8Array, start: Int, end: Int): String
        }
    }
}