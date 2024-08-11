package pbandk.internal

/**
 * An implementation of [AtomicReference] that can be used in single-threaded environments, such as Kotlin/JS. It is
 * nothing more than a pass-through wrapper around the provided [value] that implements the [AtomicReference] interface.
 */
internal class SingleThreadAtomicReference<T>(private var value: T) : AtomicReference<T> {
    override fun set(value: T) {
        this.value = value
    }

    override fun get(): T {
        return value
    }
}