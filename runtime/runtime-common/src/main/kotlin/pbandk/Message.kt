package pbandk

interface Message<T : Message<T>> {
    operator fun plus(other: T?): T
    val protoSize: Int
    fun protoMarshal(m: Marshaller)
    fun protoMarshal() = Marshaller.allocate(protoSize).also(::protoMarshal).complete()!!

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

    interface NamedEnum : Enum {
        val name: String

        interface Companion<T : Enum> : Enum.Companion<T> {
            fun fromName(name: String): T
        }
    }
}

operator fun <T : Message<T>> Message<T>?.plus(other: T?) = this?.plus(other) ?: other
