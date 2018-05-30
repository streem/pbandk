package pbandk

interface Message {
    fun marshal() = ByteBuilder().let { marshal(it) }.array
    fun marshal(bld: ByteBuilder): ByteBuilder

    interface Marshaller<T : Message> {
        fun marshal(msg: T) = ByteBuilder().let { marshal(it, msg) }.array
        fun marshal(bld: ByteBuilder, msg: T): ByteBuilder

        fun unmarshal(bytes: ByteArray) = unmarshal(ByteReader.fromByteArray(bytes))
        fun unmarshal(rdr: ByteReader): T
    }
}