package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Δοθέντος ενός string, μετατρέπει σε κεφαλαία-πεζά
 * εναλλάξ. Για παράδειγμα: coding -> CoDiNg
 */
public class UpperLowerCaseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inputStr;
        char ch;

        //Εισοδος δεδομενων
        System.out.println("Παρακαλω εισαγετε ενα string");
        inputStr = sc.nextLine();

        //Επεξεργασια - Business
        for (int i = 0; i < inputStr.length(); i++) {
            ch = inputStr.charAt(i);
            if (Character.isLetter(ch)) {
                ch = i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                sb.append(ch);
            } else sb.append(ch);
        }


        System.out.println(sb);
    }
}
