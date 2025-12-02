package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculate factorial of a number.
 * n! = 1 * 2 * 3 * ... * n
 * For instance, 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int facto = 1;
        int n = 0;

        System.out.println("Please insert a number: ");
        n = scanner.nextInt();

        while (i <= n) {
            facto *= i;
            i++;
        }
        System.out.printf("%d! = %d ", n, facto);
        }
    }
