package pbandk.examples.greeter.pb

interface Greeter {
    suspend fun SayHello(req: pbandk.examples.greeter.pb.HelloRequest): pbandk.examples.greeter.pb.HelloReply

    class Client(val client: pbandk.examples.greeter.Rpc.Client) : Greeter {
        override suspend fun SayHello(req: pbandk.examples.greeter.pb.HelloRequest): pbandk.examples.greeter.pb.HelloReply { return client.callUnary("SayHello", req) }
    }

    abstract class Server : pbandk.examples.greeter.Rpc.Server(), Greeter {
        override suspend fun <Req : pbandk.Message, Resp : pbandk.Message> onUnaryCall(name: String, req: Req): Resp {
            return when (name) {
                "SayHello" -> SayHello(req as pbandk.examples.greeter.pb.HelloRequest) as Resp
                else -> error("404")
            }
        }
    }
}