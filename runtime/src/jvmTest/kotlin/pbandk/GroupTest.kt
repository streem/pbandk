package pbandk

import pbandk.testpb.MessageWithGroup
import pbandk.testpb.java.TestProto2
import pbandk.testpb.java.TestProto2.MessageWithGroup.Bar
import pbandk.testpb.java.TestProto2.MessageWithGroup.Bar.NestedGroup
import kotlin.test.Test

class GroupTest {
    @Test
    fun testGroup() {
        val builtJavaObj = TestProto2.MessageWithGroup.newBuilder()
            .setFoo(
                TestProto2.MessageWithGroup.Foo.newBuilder()
                    .setA("abc")
                    .setB(5)
            )
            .setBar(
                Bar.newBuilder()
                    .setC(true)
                    .setD(3.14f)
                    .setNestedGroup(NestedGroup.newBuilder().setE(572))
            )
            .build()
        val builtKotlinObj = MessageWithGroup(
            foo = MessageWithGroup.Foo(a = "abc", b = 5),
            oneofWithGroup = MessageWithGroup.OneofWithGroup.Bar(
                MessageWithGroup.Bar(
                    c = true,
                    d = 3.14f,
                    nestedgroup = MessageWithGroup.Bar.NestedGroup(e = 572)
                )
            )
        )
        pbandkJavaRoundtripTest(builtJavaObj, builtKotlinObj, MessageWithGroup.Companion)
    }
}