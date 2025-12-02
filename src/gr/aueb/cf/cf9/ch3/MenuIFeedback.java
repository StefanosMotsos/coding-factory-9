package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * shortened menu for quick exercise
 */
public class MenuIFeedback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("option 1");
            System.out.println("option 2");
            System.out.println("option 3");
            System.out.println("option 4");
            System.out.println("option 5");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("u picked option 1");
            } else if (choice == 2) {
                System.out.println("u picked option 2");
            } else if (choice == 3) {
                System.out.println("u picked option 3");
            } else if (choice == 4) {
                System.out.println("u picked option 4");
            } else if (choice == 5) {
                System.out.println("u picked option 5");
                break;
            } else {
                System.out.println("wrong input");
            }
        }
    }
}
