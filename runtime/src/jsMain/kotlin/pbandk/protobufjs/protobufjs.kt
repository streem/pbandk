@file:JsModule("protobufjs/light")
@file:JsNonModule
package pbandk.protobufjs

import org.khronos.webgl.Uint8Array

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