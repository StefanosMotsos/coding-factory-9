package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο που συμβολίζει μία
 * θερμοκρασία. Και το πρόγραμμα υπολογίζει αν η
 * θερμοκρασία < 0 τότε μια μεταβλητή γίνεται true,
 * αλλιώς γίνεται false.
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Please insert a temperature: ");
        temperature = scanner.nextInt();
        isTempBelowZero = temperature < 0;
        System.out.println("The temperature is below 0 " + isTempBelowZero);
    }
}
