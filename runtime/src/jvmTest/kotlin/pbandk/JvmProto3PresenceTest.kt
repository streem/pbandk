package pbandk.pbandk

import org.junit.Test
import pbandk.pbandkJavaRoundtripTest
import pbandk.testpb.Proto3Presence
import pbandk.testpb.Proto3PresenceEnum
import pbandk.testpb.Proto3PresenceMain
import pbandk.testpb.Proto3PresenceMessage
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JvmProto3PresenceTest {
    @Test
    fun testProto3Presence() {
        val descriptor = Proto3PresenceMain.descriptor
        val javaDescriptor = Proto3Presence.Proto3PresenceMain.getDescriptor()
        val fieldsPairs = descriptor.fields.map { it to javaDescriptor.fields.find { jit -> jit.name == it.name }!! }
        fieldsPairs.forEach { (field, jField) ->
            // If instead of assertEquals, to generate more verbose error messages.
            if (jField.hasPresence()) {
                assertTrue("${field.name} should have presence.") { field.type.hasPresence }
            } else {
                assertFalse("${field.name} should NOT have presence.") { field.type.hasPresence }
            }
        }
    }

    @Test
    fun testDefaults() {
        val proto = Proto3PresenceMain()
        val jProto = Proto3Presence.Proto3PresenceMain.newBuilder().build()
        pbandkJavaRoundtripTest(jProto, proto, Proto3PresenceMain.Companion)
    }

    @Test
    fun testCustomized() {
        val proto = Proto3PresenceMain(
            message = Proto3PresenceMessage(1),
            optionalMessage = Proto3PresenceMessage(1),
            string = "test",
            optionalString = "test",
            int = 1,
            optionalInt = 1,
            enum = Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_SPECIFIED,
            optionalEnum = Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_SPECIFIED
        )
        val jProto = Proto3Presence.Proto3PresenceMain.newBuilder()
            .setMessage(Proto3Presence.Proto3PresenceMessage.newBuilder().setInt(1).build())
            .setOptionalMessage(Proto3Presence.Proto3PresenceMessage.newBuilder().setInt(1).build())
            .setString("test")
            .setOptionalString("test")
            .setInt(1)
            .setOptionalInt(1)
            .setEnum(Proto3Presence.Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_SPECIFIED)
            .setOptionalEnum(Proto3Presence.Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_SPECIFIED)
            .build()
        pbandkJavaRoundtripTest(jProto, proto, Proto3PresenceMain.Companion)
    }
}