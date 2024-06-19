package pbandk.internal

internal interface AtomicReference<T> {
    fun set(value: T)
    fun get() : T
}

internal expect fun <T> AtomicReference(value: T): AtomicReference<T>