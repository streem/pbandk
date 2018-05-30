package pbandk

interface Enumerate {
    val value: Int

    interface Marshaller<T : Enumerate>
}