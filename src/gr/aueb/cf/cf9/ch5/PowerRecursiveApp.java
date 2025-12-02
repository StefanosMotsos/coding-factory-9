package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerRecursiveApp {
    public static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * pow(base, power -1);
        }
    }

    public static void main(String[] args) {
        int b = 0;
        int w = 0;
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        w = scanner.nextInt();
        int  result = pow(b, w);
        System.out.printf("%d^%d is: %d", b, w, result);
    }
}
