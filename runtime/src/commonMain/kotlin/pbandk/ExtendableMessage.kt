package pbandk

@Suppress("UNCHECKED_CAST")
interface ExtendableMessage : Message {
    @PublicForGeneratedCode
    val extensionFields: AtomicReference<Map<Int, Any>>
    fun <M: Message, T> getExtension(fd: FieldDescriptor<M, T>): T {
        var value = extensionFields.get()[fd.number] as? T
        if (value != null) {
            return value
        } else {
            value = unknownFields[fd.number]?.decodeAs(fd)
        }
        return if (value != null) {
            extensionFields.set(extensionFields.get() + (fd.number to value as Any))
            value
        } else if (!fd.type.hasPresence){
            fd.type.defaultValue as T
        } else {
            null as T
        }
    }
}

