package pbandk

import pbandk.impl.AbstractUtil

actual object SizerImpl: pbandk.impl.SizerImpl(), Sizer

@OptIn(ExperimentalStdlibApi::class)
actual object UtilImpl : AbstractUtil(), Util {
        override fun stringToUtf8(str: String): ByteArray = str.encodeToByteArray()
        override fun utf8ToString(bytes: ByteArray): String = bytes.decodeToString()
}

internal actual fun unmarshallerByteArray(arr: ByteArray): Unmarshaller =
        pbandk.impl.Unmarshaller.fromByteArray(arr)
internal actual fun marshallerAllocate(size: Int): ByteArrayMarshaller =
        pbandk.impl.ByteArrayMarshaller.allocate(size)