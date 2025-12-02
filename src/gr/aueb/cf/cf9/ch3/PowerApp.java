package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number, a^n.
 * a^n = a * a * a * ... * a
 * (n times)
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;

        System.out.println("Please insert a base and a power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();
        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.printf("%d ^ %d = %d\n", base, power, result);
        }
    }
