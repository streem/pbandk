package pbandk

expect class ByteReader {
    companion object {
        fun fromByteArray(bytes: ByteArray): ByteReader
    }
}

fun <T> ByteReader.readMessage(fn: () -> T): T = TODO()
fun <T : OneOf> ByteReader.read(marshaller: OneOf.Marshaller<T>): T? = TODO()
fun <T : Enumerate> ByteReader.read(marshaller: Enumerate.Marshaller<T>, fieldNum: Int): T = TODO()
fun ByteReader.readString(fieldNum: Int): String = TODO()
fun ByteReader.unreadFields(): Map<Int, ByteArray> = TODO()