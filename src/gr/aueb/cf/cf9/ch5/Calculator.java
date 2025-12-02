package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("Choose one option");
        System.out.println("1: Addition");
        System.out.println("2: Subtract");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Remainer of Division");
        System.out.println();
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }
    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 % num2;
    }

    public static int getResultOnChoice (int choice, int num1, int num2) {
        int result = 0;

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;

        while (true) {
            printMenu();
            choice = getOneInt();
            System.out.println();

            if(!isChoiceValid(choice)) {
                System.out.println("Error in input data");
                continue;
            }

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
            System.out.println("Please insert 2 numbers:");
            int num1 = getOneInt();
            int num2 = getOneInt();

            result = getResultOnChoice(choice, num1, num2);
            System.out.println("result is: " + result);
            System.out.println();
        }
    }
}