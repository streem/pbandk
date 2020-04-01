There were some issues when compared to other languages, so there is a test.proto here, a Go file that generates some
bytes for it, and a test that uses it. This expects the pbandk repo checked out at
`GOPATH/src/github.com/streem/pbandk`:

To generate the proto code for Kotlin:

    protoc --kotlin_out=kotlin_package=pbandk.testpb:runtime/runtime-jvm/src/test/kotlin runtime/runtime-jvm/src/test/proto/pbandk/testpb/test.proto

If on Windows, add the following arg after the `--kotlin_out` arg:

    --plugin=protoc-gen-kotlin=%GOPATH%/src/github.com/streem/pbandk/protoc-gen-kotlin/protoc-gen-kotlin-jvm/build/install/protoc-gen-kotlin/bin/protoc-gen-kotlin.bat

To generate the proto code for Go (assuming GOPATH/bin is on the PATH and protoc-gen-go is in there):

    protoc --go_out=runtime/runtime-jvm/src/test/go -Iruntime/runtime-jvm/src/test/proto/pbandk runtime/runtime-jvm/src/test/proto/pbandk/testpb/test.proto
