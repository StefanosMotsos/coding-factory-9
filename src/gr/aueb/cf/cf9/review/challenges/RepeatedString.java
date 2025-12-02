package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Δοθεντος ενος {@link String} επιστρεφει ενα String
 * που αποτελει επαναληψη του αρχικου String, n φορες.
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int times;

        System.out.println("Please insert a sentence: ");
        s = sc.nextLine();

        System.out.println("Please insert how many times you want to repeat the sentence: ");
        while (!sc.hasNextInt()) {
            System.out.println("Please insert an integer!");
            sc.nextLine();
        }
        times = sc.nextInt();

        System.out.println(getRepeat(s, times));
    }

    public static String getRepeat(String s, int times) {
        if (s == null || s.isBlank()) return "";
        return s.repeat(times);
    }

    public static String getRepeated(String s1, int n) {
        int times;
        times = (int) Math.ceil((double) n / s1.length());
        return s1.repeat(times);
    }

    public static int getChCount(String s, char ch, int n) {
        int count = 0;

        if (n > s.length()) return 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) count++;
        }
        return count;
    }

    public static int getChRepeatedCount(String s, char ch, int n) {
        int repeated = 0;
        int count = 0;
        String repeatedString = "";

        if (s.length() < n) {
            repeated = (int) Math.ceil((double) n / s.length());
            repeatedString = s.repeat(repeated);
        } else repeatedString = s;

        for (int i = 0; i < repeatedString.length(); i++) {
            if (repeatedString.charAt(i) == ch) count++;
        }
        return count;
    }

    public static int getMaxAge(int[] ages, int chAge) {
        if (ages == null || ages.length < 0) return 0;
        int maxAge = ages[0];
        int diff = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > maxAge) maxAge = ages[i];
        }
        diff = maxAge - chAge;
        return Math.abs(diff);
    }
}
