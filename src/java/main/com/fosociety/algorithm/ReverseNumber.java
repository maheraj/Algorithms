package com.fosociety.algorithm;


public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(12));
    }

    public static int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        return reverse;
    }
}
