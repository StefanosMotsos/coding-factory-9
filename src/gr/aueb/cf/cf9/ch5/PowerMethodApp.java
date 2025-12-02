package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 *
 */
public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int exponent = 0;
        int mul = 0;

        System.out.println("Please enter a base: ");
        base = scanner.nextInt();

        System.out.println("Please enter a power: ");
        exponent = scanner.nextInt();

        mul = power(base, exponent);
        System.out.printf("%d^%d is equal to: %d%n", base, exponent, mul);
    }

    public static int power(int a, int b) {
        int basePower = 1;
        for (int i = 1; i <= b; i++) {
            basePower *= a;
        }
        return basePower;
    }
}
