package pbandk

interface Message {
    val size: Int
    fun marshal(m: Marshaller)
    fun marshal() = ByteArray(size).also { Marshaller(it).also(::marshal) }

    interface Companion<T : Message> {
        fun unmarshal(u: Unmarshaller): T
        fun unmarshal(arr: ByteArray) = unmarshal(Unmarshaller.fromByteArray(arr))
    }
}