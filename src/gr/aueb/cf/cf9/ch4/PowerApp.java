package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει το base και power και το πρόγραμμα
 * υπολογίζει το base^power, π.χ 2^10 = 1024.
 */
public class PowerApp {
    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a base: ");
        base = scanner.nextInt();
        System.out.println("Please insert a power:");
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        System.out.printf("The result of %d^%d is: %d", base, power, result);
    }
}
