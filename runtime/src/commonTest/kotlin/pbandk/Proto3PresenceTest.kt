package pbandk

import pbandk.testpb.Proto3PresenceEnum
import pbandk.testpb.Proto3PresenceMain
import pbandk.testpb.Proto3PresenceMessage
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class Proto3PresenceTest {
    @Test
    fun testExplicitDefaultValues() {
        val msg = Proto3PresenceMain.decodeFromByteArray(
            Proto3PresenceMain(
                optionalMessage = Proto3PresenceMessage(),
                message = Proto3PresenceMessage(),
                optionalString = "",
                string = "",
                optionalInt = 0,
                int = 0,
                optionalEnum = Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_UNSPECIFIED,
                enum = Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_UNSPECIFIED,
                oneOf = Proto3PresenceMain.OneOf.OneOfString(oneOfString = ""),
            ).encodeToByteArray()
        )

        assertEquals(Proto3PresenceMessage.defaultInstance, msg.optionalMessage)
        assertEquals(Proto3PresenceMessage.defaultInstance, msg.message)

        assertEquals("", msg.optionalString)
        assertEquals("", msg.string)

        assertEquals(0, msg.optionalInt)
        assertEquals(0, msg.int)

        assertEquals(Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_UNSPECIFIED, msg.optionalEnum)
        assertEquals(Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_UNSPECIFIED, msg.enum)

        assertEquals("", msg.oneOfString)
        assertNull(msg.oneOfInt)
    }

    @Test
    fun testImplicitDefaultValues() {
        val msg = Proto3PresenceMain.decodeFromByteArray(Proto3PresenceMain().encodeToByteArray())

        assertNull(msg.optionalMessage)
        assertNull(msg.message)

        assertNull(msg.optionalString)
        assertEquals("", msg.string)

        assertNull(msg.optionalInt)
        assertEquals(0, msg.int)

        assertNull(msg.optionalEnum)
        assertEquals(Proto3PresenceEnum.PROTO3_PRESENCE_ENUM_UNSPECIFIED, msg.enum)

        assertNull(msg.oneOfString)
        assertNull(msg.oneOfInt)
    }
}