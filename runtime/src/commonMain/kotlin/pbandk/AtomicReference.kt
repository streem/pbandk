package pbandk

expect class AtomicReference<T>(value_: T) {
    fun set(value: T)
    fun get() : T
}
