package pbandk

public interface ExtendableMessage<T : Message> : Message {
    public fun <V> getExtension(fd: FieldDescriptor<T, V>): V
}

public interface MutableExtendableMessage<T : Message> : ExtendableMessage<T>, MutableMessage<T> {
    public fun <V> setExtension(fd: FieldDescriptor<T, V>, newValue: V)
}