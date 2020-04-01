#!/usr/bin/env bash

if [ -z "$CONF_TEST_PATH" ]; then
    echo "Need to set CONF_TEST_PATH to conformance-test-runner"
    exit 1
fi

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# TODO: Reenable full test suite when things are working by adding --enforce_recommended flag to both commands below
$CONF_TEST_PATH --failure_list $DIR/src/jvmMain/failing_tests.txt $DIR/../conformance/build/install/conformance/bin/conformance
# TODO: js tests currently fail to run with a `Error: Cannot find module 'kotlinx-serialization-kotlinx-serialization-runtime'` error.
# Reenable these tests once the error has been fixed.
# $CONF_TEST_PATH --failure_list $DIR/src/jsMain/failing_tests.txt $DIR/conformance-js/run.sh
