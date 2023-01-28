package pbandk

public interface ExtendableMessage<M : Message> : Message {
    public fun <V> getExtension(fd: FieldDescriptor<M, V>): V?
    public fun <T> getRepeatedExtension(fd: FieldDescriptor<M, List<T>>): List<T>
}

public interface MutableExtendableMessage<M : Message> : MutableMessage<M>, ExtendableMessage<M> {
    override fun <T> getRepeatedExtension(fd: FieldDescriptor<M, List<T>>): MutableList<T>
    public fun <V> setExtension(fd: FieldDescriptor<M, V>, newValue: V)
}