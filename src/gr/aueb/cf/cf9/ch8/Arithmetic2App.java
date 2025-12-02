package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic2App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        try {
            result = num1 / num2;
            System.out.println();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        System.out.println("Result = " + result + "");  //This line will be executed only if there is not an exception
    }
}
