package com.fosociety.algorithm;

/**
 * Tower of Hanoi is a mathematical puzzle where we have three rods and n disks.
 * The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
 * 1) Only one disk can be moved at a time.
 * 2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
 * 3) No disk may be placed on top of a smaller disk.
 * */
public class RecursionTowerOfHanoi {

    public static void main(String[] Args) {
        towerOfHanoi(4, 'A', 'C', 'B');
    }

    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println(n + " " + from + " -> " + to);
            return;
        }

        towerOfHanoi(n - 1, from, aux, to);
        System.out.println(n + " " + from + " -> " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }
}
