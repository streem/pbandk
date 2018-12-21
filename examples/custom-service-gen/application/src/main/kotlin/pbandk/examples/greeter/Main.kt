package pbandk.examples.greeter

import kotlinx.coroutines.runBlocking
import pbandk.examples.greeter.pb.Greeter
import pbandk.examples.greeter.pb.HelloReply
import pbandk.examples.greeter.pb.HelloRequest

fun main(args: Array<String>) {
    // Just a fake little mock sample
    val server = object : Greeter.Server() {
        override suspend fun SayHello(req: HelloRequest): HelloReply {
            return HelloReply("Hello, ${req.name}!")
        }
    }

    val client = Greeter.Client(Rpc.Client.Mock(server))

    runBlocking {
        val reply = client.SayHello(HelloRequest("World"))
        println("Result: ${reply.message}")
    }
}