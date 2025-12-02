package gr.aueb.cf.cf9.ch7;

/**
 * Palindrome is one sentence (string) which is read
 * the same from start to finish.
 */
public class Palindrome {
    public static void main(String[] args) {
        String s =  "AABAA";
    }
    public static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
