package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * To {@link java.util.InputMismatchException} συμβαίνει
 * όταν ο {@link java.util.Scanner} αποτυγχάνει να διαβάσει
 * το σωστό τύπο δεδομένων.
 */
public class InputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Please enter one int: ");
        // num = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Μη αποδεκτή χαρακτήρες!");
            sc.nextLine();
        }

        num = sc.nextInt();

        System.out.println("Num: " + num);
    }
}
