package com.fosociety.algorithm;

public class RecursionFactorial {
    /**
     * This class will show how to calculate factorial
     * method doFactorialSimpley will show traditional way to calculate foctorial
     * method doFactorilaRecursively will calculate factorial recursively
     */
    public static void main(String[] args) {

        //Calculate factorial in simple way
        System.out.println(doFactorialSimply(5));

        //Calculate factorial in recursive way
        System.out.println(doFactorialRecursively(5));
    }

    public static int doFactorialSimply(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int doFactorialRecursively(int n) {
        if (n == 0) {
            return 1;
        }
        return n * doFactorialRecursively(n - 1);
    }
}
