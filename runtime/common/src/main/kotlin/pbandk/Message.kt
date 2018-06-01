package pbandk

interface Message {
    val protoSize: Int
    fun protoMarshal(m: Marshaller)
    fun protoMarshal() = ByteArray(protoSize).also { Marshaller(it).also(::protoMarshal) }

    interface Companion<T : Message> {
        fun protoUnmarshal(u: Unmarshaller): T
        fun protoUnmarshal(arr: ByteArray) = protoUnmarshal(Unmarshaller.fromByteArray(arr))
    }
}