#!/usr/bin/env bash

if [ -z "$CONF_TEST_PATH" ]; then
    echo "Need to set CONF_TEST_PATH to conformance-test-runner"
    exit 1
fi

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

$CONF_TEST_PATH  --enforce_recommended $DIR/conformance-jvm/build/install/conformance-jvm/bin/conformance-jvm
# $CONF_TEST_PATH --enforce_recommended $DIR/conformance-js/run.sh