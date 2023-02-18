package pbandk

public interface ExtendableMessage<M : Message> : Message {
    public val extensionFields: FieldSet<M>
}

public interface MutableExtendableMessage<M : Message> : MutableMessage<M>, ExtendableMessage<M> {
    override val extensionFields: MutableFieldSet<M>
}