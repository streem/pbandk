package pbandk

actual object Sizer: pbandk.impl.Sizer(), SizerInterface
actual typealias Util = pbandk.impl.Util

internal actual fun unmarshallerByteArray(arr: ByteArray): Unmarshaller =
        pbandk.impl.Unmarshaller.fromByteArray(arr)
internal actual fun marshallerAllocate(size: Int): ByteArrayMarshaller =
        pbandk.impl.ByteArrayMarshaller.allocate(size)