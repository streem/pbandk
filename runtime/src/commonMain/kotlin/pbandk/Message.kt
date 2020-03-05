package pbandk

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

interface Message<T : Message<T>> {
    operator fun plus(other: T?): T
    val protoSize: Int
    fun protoMarshal() = Marshaller.allocate(protoSize).also(::protoMarshal).complete()
    fun protoMarshal(m: Marshaller)
    fun jsonMarshal() = jsonMarshal(Json(JsonConfiguration.Stable.copy(strictMode = false)))
    fun jsonMarshal(json: Json): String

    interface Companion<T : Message<T>> {
        fun protoUnmarshal(u: Unmarshaller): T
        fun protoUnmarshal(arr: ByteArray) = protoUnmarshal(Unmarshaller.fromByteArray(arr))
        fun jsonUnmarshal(data: String): T = jsonUnmarshal(Json(JsonConfiguration.Stable.copy(strictMode = false)), data)
        fun jsonUnmarshal(json: Json, data: String): T
    }

    interface Enum {
        val value: Int
        val name: String?

        interface Companion<T : Enum> {
            fun fromValue(value: Int): T
            fun fromName(name: String): T
        }
    }

    abstract class OneOf<T>(val value: T) {
        override fun equals(other: Any?) = this::class.isInstance(other) && value == (other as OneOf<*>).value
        override fun hashCode() = value.hashCode()
        override fun toString() = "OneOf.${this::class.simpleName}($value)"
    }

}

operator fun <T : Message<T>> Message<T>?.plus(other: T?) = this?.plus(other) ?: other
