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
if [ -z "$1" ] || [ "$1" = "wasmJs" ]; then
    $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/wasmJs/failing_tests.txt $DIR/wasmJs/run.sh
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
if [ "$1" = "androidNative" ]; then
    DEVICE_EXECUTABLE="/data/local/tmp/conformance.kexe"
    abi_list=$(adb shell getprop ro.product.cpu.abilist)
    if [[ "$abi_list" == *"arm64-v8a"* ]]; then
        adb push $DIR/native/build/bin/androidNativeArm64/conformanceReleaseExecutable/conformance.kexe $DEVICE_EXECUTABLE
        adb shell chmod 777 $DEVICE_EXECUTABLE
        $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/native/failing_tests.txt $DIR/native/run_android.sh
        adb shell rm $DEVICE_EXECUTABLE
    fi
    if [[ "$abi_list" == *"armeabi"* ]]; then
        adb push $DIR/native/build/bin/androidNativeArm32/conformanceReleaseExecutable/conformance.kexe $DEVICE_EXECUTABLE
        adb shell chmod 777 $DEVICE_EXECUTABLE
        $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/native/failing_tests.txt $DIR/native/run_android.sh
        adb shell rm $DEVICE_EXECUTABLE
    fi
fi
if [ "$1" = "androidJvm" ]; then
    DEVICE_APK="/data/local/tmp/conformance.apk"
    adb push $DIR/android/build/outputs/apk/release/conformance-android-release-unsigned.apk $DEVICE_APK
    $CONF_TEST_PATH --enforce_recommended --failure_list $DIR/jvm/failing_tests.txt $DIR/android/run.sh
    adb shell rm $DEVICE_APK
fi
