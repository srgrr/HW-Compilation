# HW-Compilation
A simple programming language that can be compiled to Verilog. This was a project for the compilers course at FIB (UPC).
Authors: @gispsan and Sergio Rodríguez Guasch (me).

## Language details
* Very simple syntax! Check the examples/ folder
* Turing complete! (wow, such achievement)
* Has warnings! (duh)
* It has only one type: the bit vector
* It has no I/O mechanisms, altough they can be easily implemented (I guess)
* No recursivity allowed. This does NOT mean you can't make nested function calls (as long as they don't form a recursive cycle)
* Generated circuits are not guaranteed to be optimal. In fact, they might be bloated as f*ck

## Usage
Write your .hwc program, then run the command _java -jar <your path>/HWCompilation.jar inputpath_

## More info
This project was inspired by the paper _Hardware compilation: Translating programs into circuits_ of N.Wirth.
