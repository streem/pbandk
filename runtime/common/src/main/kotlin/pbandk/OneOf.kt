package pbandk

interface OneOf {
    interface Marshaller<T : OneOf> {
        val entries: Map<Int, OneOf.Message.Marshaller<out T>>
    }

    interface Message {
        interface Marshaller<T : OneOf>
    }
}