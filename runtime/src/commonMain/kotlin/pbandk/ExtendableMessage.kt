package pbandk

public interface ExtendableMessage<M : Message> : Message {
    public fun <V> getExtension(fd: FieldDescriptor<M, V>): V
}

public interface MutableExtendableMessage<M : Message> : MutableMessage<M>, ExtendableMessage<M> {
    public fun <V> setExtension(fd: FieldDescriptor<M, V>, newValue: V)
}