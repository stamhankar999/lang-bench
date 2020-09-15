#!/bin/sh

echo "Python:"
time python3 kthprime.py
echo

echo "C:"
time ./out/kthprime
echo

echo "Optimized C:"
time ./out/kthprime_opt
echo

echo "Java:"
time java -cp out KthPrime
