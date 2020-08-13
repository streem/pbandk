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
    $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/native/failing_tests.txt $DIR/native/build/bin/linux/conformanceReleaseExecutable/conformance.kexe
fi
if [ "$1" = "macos" ]; then
    $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/native/failing_tests.txt $DIR/native/build/bin/macos/conformanceReleaseExecutable/conformance.kexe
fi
