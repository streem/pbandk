package pbandk

expect class ByteBuilder() {
    fun ensureCapacity(i: Int): ByteBuilder

    val array: ByteArray
}

fun ByteBuilder.buildMessage(fn: () -> ByteBuilder): ByteBuilder = TODO()

fun <T : OneOf> ByteBuilder.append(oneof: T?, marshaller: OneOf.Marshaller<T>): ByteBuilder = TODO()
fun ByteBuilder.append(enum: Enumerate, fieldNum: Int): ByteBuilder = TODO()
fun ByteBuilder.append(msg: Message?, fieldNum: Int): ByteBuilder = TODO()
fun ByteBuilder.append(str: String, fieldNum: Int): ByteBuilder = TODO()