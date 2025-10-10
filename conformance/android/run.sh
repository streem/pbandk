#!/usr/bin/env bash

set -e
set -o pipefail

exec adb shell "CLASSPATH=/data/local/tmp/conformance.apk app_process . pbandk.conformance.MainKt"