package pbandk

actual object SizerImpl: pbandk.impl.SizerImpl(), Sizer
actual typealias UtilImpl = pbandk.impl.UtilImpl

internal actual fun unmarshallerByteArray(arr: ByteArray): Unmarshaller =
        pbandk.impl.Unmarshaller.fromByteArray(arr)
internal actual fun marshallerAllocate(size: Int): ByteArrayMarshaller =
        pbandk.impl.ByteArrayMarshaller.allocate(size)