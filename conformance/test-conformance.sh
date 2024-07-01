#!/usr/bin/env bash

set -e

if [ -z "$CONF_TEST_PATH" ]; then
    echo "Need to set CONF_TEST_PATH to conformance-test-runner"
    exit 1
fi

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

if [ -z "$1" ] || [ "$1" = "jvm" ]; then
    $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/jvm/failing_tests.txt $DIR/jvm/build/install/conformance/bin/conformance
fi
if [ -z "$1" ] || [ "$1" = "js" ]; then
    $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/js/failing_tests.txt $DIR/js/run.sh
fi
if [ -z "$1" ] || [ "$1" = "linux" ]; then
    $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/native/failing_tests.txt $DIR/native/build/bin/linuxX64/conformanceReleaseExecutable/conformance.kexe
fi
if [ "$1" = "macos" ]; then
    if [ -f "$DIR/native/build/bin/macosX64/conformanceReleaseExecutable/conformance.kexe" ]; then
        $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/native/failing_tests.txt $DIR/native/build/bin/macosX64/conformanceReleaseExecutable/conformance.kexe
    elif [ -f "$DIR/native/build/bin/macosArm64/conformanceReleaseExecutable/conformance.kexe" ]; then
        $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/native/failing_tests.txt $DIR/native/build/bin/macosArm64/conformanceReleaseExecutable/conformance.kexe
    else
        echo "No binaries found for macosX64 or macosArm64"
        exit 1
    fi
fi
