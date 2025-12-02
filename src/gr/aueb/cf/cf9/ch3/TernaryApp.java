package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής demo. Υπολογίζει τον μικρότερο
 * μεταξύ 2 ακεραίων που δλινει ο χρήστης.
 * Επίσης υπολογίζει το απόλυτο ενός ακεραίου με την
 * χρήση του τριαδικού τελεστή.
 */
public class TernaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.printf("The smallest number is: %d%n", ((num1 < num2) ? num1 : num2));

        int num3 = 0;
        System.out.println("Please enter a number: ");
        num3 = scanner.nextInt();

        System.out.printf("The absolute of %d is: %d", num3, ((num3 > 0) ? num3 : -num3));
    }
}
