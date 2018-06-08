package pbandk

import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array

inline fun ByteArray.asUint8Array() =
    Uint8Array(unsafeCast<Int8Array>().buffer, unsafeCast<Int8Array>().byteOffset, unsafeCast<Int8Array>().length)
inline fun Uint8Array.asByteArray() =
    Int8Array(buffer, byteOffset, length).unsafeCast<ByteArray>()

actual typealias Marshaller = pbandk.protobufjs.Marshaller
actual typealias Sizer = pbandk.protobufjs.Sizer
actual typealias Unmarshaller = pbandk.protobufjs.Unmarshaller
actual typealias Util = pbandk.protobufjs.Util