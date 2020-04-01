package pbandk

import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array

inline fun ByteArray.asUint8Array() =
    unsafeCast<Int8Array>().run { Uint8Array(buffer, byteOffset, length) }
inline fun Uint8Array.asByteArray() =
    Int8Array(buffer, byteOffset, length).unsafeCast<ByteArray>()

actual typealias Marshaller = pbandk.protobufjs.Marshaller
actual typealias Sizer = pbandk.protobufjs.Sizer
actual typealias Unmarshaller = pbandk.protobufjs.Unmarshaller
actual typealias Util = pbandk.protobufjs.Util