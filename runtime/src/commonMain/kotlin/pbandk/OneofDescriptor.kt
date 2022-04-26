package pbandk

import pbandk.wkt.OneofOptions
import kotlin.js.JsExport
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty0
import kotlin.reflect.KProperty1

@JsExport
public class OneofDescriptor<M : Message, T : Message.OneOf<*>> private constructor(
    getMessageDescriptor: () -> MessageDescriptor<M>,
    @ExperimentalProtoReflection
    public val name: String,
    internal val getValue: (M) -> T?,
    internal val updateValue: (MutableMessage<M>, T?) -> Unit,
    @ExperimentalProtoReflection
    public val fields: FieldDescriptorSet<M>,
    // TODO: make this public once we're actually populating it correctly in the CodeGenerator
    internal val options: OneofOptions = OneofOptions.defaultInstance
) {
    internal val messageDescriptor: MessageDescriptor<M> by lazy { getMessageDescriptor() }

    public companion object {
        @PublicForGeneratedCode
        @Suppress("UNCHECKED_CAST")
        public fun <M : Message, MM : MutableMessage<M>, T : Message.OneOf<*>> of(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            value: KProperty1<M, T?>,
            mutableValue: KMutableProperty1<MM, T?>,
            fields: Collection<FieldDescriptor<M, *>>,
            options: OneofOptions = OneofOptions.defaultInstance
        ): OneofDescriptor<M, T> = OneofDescriptor(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            getValue = value::get,
            updateValue = mutableValue::set as (MutableMessage<M>, T?) -> Unit,
            fields = FieldDescriptorSet(fields),
            options = options
        )
    }
}