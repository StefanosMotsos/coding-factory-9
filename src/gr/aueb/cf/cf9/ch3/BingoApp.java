package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class BingoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        while (true) {
            System.out.println("Please insert a number: ");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("try again");
                System.exit(1);
            }
            System.out.println("congrats");
            break;
        }

    }
}
