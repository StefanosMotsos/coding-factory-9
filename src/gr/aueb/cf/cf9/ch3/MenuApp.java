package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού μέχρι ο χρήστης να
 * επιλέξει 'Exit'.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Do-while version
        int choice = 0;
        do {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή αίτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the program!");

        // while true-break version
        int choice2 = 0;
        while (true) {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή αίτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Έξοδος");
            choice2 = scanner.nextInt();
            if (choice2 == 3) {
                break;
            }
        }

        System.out.println("Thanks for using the program!");
    }
}
