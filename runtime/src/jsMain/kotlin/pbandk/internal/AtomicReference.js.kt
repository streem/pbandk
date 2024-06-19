package pbandk.internal

private class JsAtomicReference<T>(private var value: T) : AtomicReference<T> {
    override fun set(value: T) {
        this.value = value
    }

    override fun get(): T {
        return value
    }
}

internal actual fun <T> AtomicReference(value: T): AtomicReference<T> = JsAtomicReference(value)