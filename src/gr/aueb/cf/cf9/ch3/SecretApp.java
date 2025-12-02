package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης προσπαθεί να μαντέψει ένα μυστικό αριθμό
 */
public class SecretApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;
        int i = 1;

        System.out.println("Please guess the secret number: ");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("CONGRATULATIONS!");
        } else {
            System.out.println("You did NOT guess the secret number");
        }
    }
}
