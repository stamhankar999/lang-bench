# Lang-Bench

Compare the performance of equivalent programs to find the kth prime in C, Python, and Java.

Build the C and Java programs:

```
./build.sh
```

This puts compiled files in an `out` subdirectory. Note, that the C program is compiled twice: once "normally" and once
with the `-O2` option to enable "level 2 optimization" in gcc.

Run all of the programs and report timings:

```
./run.sh
```

All of the programs are hard-coded to find the 10000'th prime number. Modifying them to be more flexible (e.g. take
a command-line arg to specify "k") is left as an exercise for the reader.

## Credits
C and Python code copied from code blocks in https://medium.com/delta-force/extending-python-with-c-f4e9656fbf5d

Java code mimics the copied C code, with minor syntactic fixes.
