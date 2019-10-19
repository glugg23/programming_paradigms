#!/bin/bash

if [[ $# -ne 1 ]]; then
    echo 'Usage: build.sh [debug/release]'
    exit 1
fi

if [[ $1 == 'debug' ]]; then
    if [[ ! -d 'cmake-build-debug' ]]; then
        mkdir 'cmake-build-debug'
    fi

    cd cmake-build-debug
    cmake -D CMAKE_C_COMPILER=gcc CMAKE_BUILD_TYPE=Debug .. && make

elif [[ $1 == 'release' ]]; then
    if [[ ! -d 'cmake-build-release' ]]; then
        mkdir 'cmake-build-release'
    fi

    cd cmake-build-release
    cmake -D CMAKE_C_COMPILER=gcc CMAKE_BUILD_TYPE=Release .. && make
fi
