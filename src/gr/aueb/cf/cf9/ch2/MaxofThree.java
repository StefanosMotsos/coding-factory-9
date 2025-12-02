package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculate the max of 3 numbers.
 */
public class MaxofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int maxOfTwo = 0;
        int totalMax = 0;
        System.out.println("Please enter 3 different numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        maxOfTwo = Math.max(num1, num2);
        totalMax = Math.max(maxOfTwo, num3);
        System.out.println("The maximum number is: " + totalMax);

    }
}
