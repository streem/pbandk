package pbandk.internal

import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array
import pbandk.PbandkInternal

actual typealias Util = pbandk.protobufjs.Util

@PbandkInternal
@Suppress("NOTHING_TO_INLINE")
inline fun ByteArray.asUint8Array() = unsafeCast<Int8Array>().run { Uint8Array(buffer, byteOffset, length) }

@PbandkInternal
inline fun Uint8Array.asByteArray() = Int8Array(buffer, byteOffset, length).unsafeCast<ByteArray>()