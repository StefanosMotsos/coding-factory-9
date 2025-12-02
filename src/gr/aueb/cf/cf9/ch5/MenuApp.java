package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void printMenu() {
        System.out.println("C");
        System.out.println("R");
        System.out.println("U");
        System.out.println("D");
        System.out.println("Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("SC");
                case 2 -> System.out.println("SR");
                case 3 -> System.out.println("SU");
                case 4 -> System.out.println("SD");
                case 5 -> System.out.println("S. Exit");
                default -> {}
            }
        } while (choice !=5);
    }
}