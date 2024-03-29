package pbandk.internal

import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array
import pbandk.PbandkInternal

internal actual typealias Util = pbandk.protobufjs.Util

@PbandkInternal
@Suppress("NOTHING_TO_INLINE")
public inline fun ByteArray.asUint8Array(): Uint8Array =
    unsafeCast<Int8Array>().run { Uint8Array(buffer, byteOffset, length) }

@PbandkInternal
public inline fun Uint8Array.asByteArray(): ByteArray = Int8Array(buffer, byteOffset, length).unsafeCast<ByteArray>()