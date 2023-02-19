package pbandk.protobufjs

import pbandk.internal.AbstractUtil
import pbandk.internal.asUint8Array

internal object Util : AbstractUtil() {
    override fun utf8len(str: String): Int = util.utf8.length(str)

    override fun base64ToBytes(str: String): ByteArray = ByteArray(util.base64.length(str)).also {
        util.base64.decode(str, it.asUint8Array(), 0)
    }

    override fun bytesToBase64(bytes: ByteArray): String =
        bytes.asUint8Array().let { util.base64.encode(it, 0, it.length) }
}