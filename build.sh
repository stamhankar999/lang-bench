#!/bin/sh

mkdir -p out
cd out
gcc -o kthprime ../kthprime.c
gcc -O2 -o kthprime_opt ../kthprime.c
javac -d . ../KthPrime.java
