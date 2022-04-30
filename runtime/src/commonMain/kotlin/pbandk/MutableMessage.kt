package pbandk

@DslMarker
public annotation class MessageBuilderMarker

@MessageBuilderMarker
public interface MutableMessage<M : Message> : Message {
    override val unknownFields: MutableMap<Int, UnknownField>
}