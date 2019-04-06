package com.fosociety.algorithm;

/**
 * if string is considered a palindrome if it can be similarly read both form left to right and from right to left
 * Approach 1: isPalindrome1 - simplest way to check palindrome is to reverse the string and them compare if they are equals
 * Drawback: Double memory, and additional computations of equals method.
 * <p>
 * Approach: 2: isPalindrome2 - A more efficient algorithm
 *
 * Approach: 3: isPalindrome3 - Same as 2 but recursive way
 *
 */
public class RecursionPalindrome {

    public static void main(String[] Args) {


        System.out.println("Approach 1: Reverse string.");
        System.out.println(isPalindrome1("12321"));
        System.out.println(isPalindrome1("12345"));

        System.out.println("Approach 2: A more efficient algorithm.");
        System.out.println(isPalindrome2("12321"));
        System.out.println(isPalindrome2("12345"));

        System.out.println("Approach 3: Recursive way but same as 2.");
        System.out.println(isPalindrome3("12321"));
        System.out.println(isPalindrome3("12345"));


    }

    public static boolean isPalindrome1(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindrome2(String str) {
        int start = 0, end = str.length() - 1, half = end / 2;
        for (int i = 0; i < half; i++, start++, end--) {
            if (str.charAt(start) != str.charAt(end)) return false;
        }
        return true;
    }

    public static boolean isPalindrome3(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome3(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }
}
