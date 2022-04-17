package pbandk

@DslMarker
public annotation class MessageBuilderMarker

@MessageBuilderMarker
public interface MutableMessage<T : Message> {
    public val unknownFields: MutableMap<Int, UnknownField>
}