package com.fosociety.algorithm;

public class RecursionPalindrome {

  public static void main(String[] Args) {

        String str = "maham";
        System.out.println(isPalindrome(str));

    }
    
  public static char firstCharacter(String str) {
        return str.charAt(0);
    }

    public static char lastCharacter(String str) {
        return str.charAt(str.length() - 1);
    }

    public static String middleCharacters(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        if (firstCharacter(str) == lastCharacter(str)) {
            return isPalindrome(middleCharacters(str));
        } else {
            return false;
        }
    }
}
