#!/usr/bin/env bash

BIN=bin
OUT=translated_program.v
VERILOG=iverilog
VER_PATH=src/verilog_utils
VER_FILES="$VER_PATH/testbench_debug.v $VER_PATH/flipflop.v $VER_PATH/flipflop_enable.v"
SIMULATOR=vvp
EXE=$BIN/simulation



if [ -z "$1" ] 
then
    echo "No argument supplied. This script needs an input file!"
else
    java -jar $BIN/hw_compilation.jar $1 $OUT
    $VERILOG -o $EXE $VER_FILES $OUT
    $SIMULATOR $EXE <<< "finish"
fi


