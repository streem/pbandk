package pbandk

import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array

inline fun ByteArray.asUint8Array() =
        Uint8Array(unsafeCast<Int8Array>().buffer, unsafeCast<Int8Array>().byteOffset, unsafeCast<Int8Array>().length)
inline fun Uint8Array.asByteArray() =
        Int8Array(buffer, byteOffset, length).unsafeCast<ByteArray>()

actual typealias Sizer = pbandk.protobufjs.Sizer

actual typealias Util = pbandk.protobufjs.Util

fun Unmarshaller(r: pbandk.protobufjs.Reader, discardUnknownFields: Boolean = false)
        = pbandk.protobufjs.Unmarshaller(r = r, discardUnknownFields = discardUnknownFields)
fun Marshaller(w: pbandk.protobufjs.Writer, expectedSize: Int)
        = pbandk.protobufjs.Marshaller(w = w, expectedSize = expectedSize)

internal actual fun unmarshallerByteArray(arr: ByteArray): Unmarshaller =
        pbandk.protobufjs.Unmarshaller.fromByteArray(arr)
internal actual fun marshallerAllocate(size: Int): ByteArrayMarshaller =
        pbandk.protobufjs.Marshaller.allocate(size)