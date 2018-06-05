package pbandk

interface Message<T : Message<T>> {
    operator fun plus(other: T?): T
    val protoSize: Int
    fun protoMarshal(m: Marshaller)
    fun protoMarshal() = ByteArray(protoSize).also { Marshaller(it).also(::protoMarshal) }

    interface Companion<T : Message<T>> {
        fun protoUnmarshal(u: Unmarshaller): T
        fun protoUnmarshal(arr: ByteArray) = protoUnmarshal(Unmarshaller.fromByteArray(arr))
    }

    interface Enum {
        val value: Int

        interface Companion<T : Enum> {
            fun fromValue(value: Int): T
        }
    }

    interface MapEntry<K, V> : Message<MapEntry<K, V>>, Map.Entry<K, V>
}