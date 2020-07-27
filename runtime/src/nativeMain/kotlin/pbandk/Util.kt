package pbandk

import pbandk.impl.AbstractUtil

actual object Sizer : pbandk.impl.Sizer()

@OptIn(ExperimentalStdlibApi::class)
actual object Util : AbstractUtil() {
        actual fun stringToUtf8(str: String): ByteArray = str.encodeToByteArray()
        actual fun utf8ToString(bytes: ByteArray): String = bytes.decodeToString()
}

internal actual fun unmarshallerByteArray(arr: ByteArray): Unmarshaller =
        pbandk.impl.Unmarshaller.fromByteArray(arr)
internal actual fun marshallerAllocate(size: Int): ByteArrayMarshaller =
        pbandk.impl.ByteArrayMarshaller.allocate(size)