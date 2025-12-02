package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός
 * ακεραίου. Για παράδειγμα, αν ο ακέραιος είναι
 * ο 170, το πλήθος των ψηφίων είναι 3.
 */
public class DigitsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int digits = 0;
        int inputNum = 0;

        System.out.println("Please insert a number: ");
        inputNum = scanner.nextInt();
        num = inputNum;

        while (num > 0) { //also "do {} while (num > 0)"
            digits++;
            num /= 10;
        }
        System.out.printf("%d has %d digits", inputNum, digits);
    }
}
