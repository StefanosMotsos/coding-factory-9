package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Εμφανίζουμε ένα μενού στον χρήστη.
 * Ο χρήστης δίνει το choice.
 * Ανάλογα με το choice να δώσουμε feedback
 * στον χρήστη
 */
public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println("Παρακαλούμε επιλέξτε ένα από τα ακόλουθα");
            System.out.println("1. One-Player game");
            System.out.println("2. Two-Player game");
            System.out.println("3. Team game");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start One-Player game");
                    break;
                case 2:
                    System.out.println("Start Two-Player game");
                    break;
                case 3:
                    System.out.println("Start Team game");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
            System.out.println("exit game");
        } while (choice != EXIT);
        System.out.println("Goodbye");
    }
}
