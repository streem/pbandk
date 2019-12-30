package main

import (
	"fmt"
	"log"
	"strconv"

	"github.com/streem/pbandk/runtime/runtime-jvm/src/test/go/testpb"
	"github.com/golang/protobuf/proto"
)

func main() {
	if err := run(); err != nil {
		log.Fatal(err)
	}
}

func run() error {
	bar := &testpb.Bar{Foos: []*testpb.Foo{
		&testpb.Foo{Val: "foo1"},
		&testpb.Foo{Val: "foo2"},
	}}
	byts, err := proto.Marshal(bar)
	if err != nil {
		return err
	}
	fmt.Printf("Byte array from %v: %v\n", bar, toKotlinArray(byts))
	return nil
}

func toKotlinArray(byts []byte) string {
	ret := "intArrayOf("
	for i, b := range byts {
		if i > 0 {
			ret += ", "
		}
		ret += strconv.Itoa(int(b))
	}
	return ret + ").map { it.toByte() }.toByteArray()"
}
