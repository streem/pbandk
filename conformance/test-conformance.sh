#!/usr/bin/env bash

if [ -z "$CONF_TEST_PATH" ]; then
    echo "Need to set CONF_TEST_PATH to conformance-test-runner"
    exit 1
fi

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# TODO: Reenable full test suite when things are working by adding --enforce_recommended flag to both commands below

if [ -z "$1" ] || [ "$1" = "jvm" ]; then
    $CONF_TEST_PATH --failure_list $DIR/jvm/failing_tests.txt $DIR/jvm/build/install/conformance/bin/conformance
fi
if [ -z "$1" ] || [ "$1" = "js" ]; then
    $CONF_TEST_PATH --failure_list $DIR/js/failing_tests.txt $DIR/js/run.sh
fi
if [ -z "$1" ] || [ "$1" = "native" ]; then
    $CONF_TEST_PATH --failure_list $DIR/native/failing_tests.txt $DIR/native/build/install/conformance/bin/conformance
fi
