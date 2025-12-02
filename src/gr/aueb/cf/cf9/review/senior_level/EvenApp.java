package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * This program calculates if a number is even or not.
 *
 * @author stef
 */
public class EvenApp {
    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητω
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        //Εισοδος δεδομενων, Validation and Data Binding
        System.out.println("Please enter a number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            sc.nextLine();
        }

        num = sc.nextInt();

        //Επιχειρησιακή λογική - Παραστασεις
        result = isEven(num);

        System.out.println("The number is even: " + result);

    }
    /**
     * Checks if a number is even.
     * @param num   The number to check.
     * @return      true if the number is even, false otherwise.
     */
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
