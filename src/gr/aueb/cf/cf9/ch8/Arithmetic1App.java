package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Creates one {@link ArithmeticException} without
 * being handled.
 */
public class Arithmetic1App {

    public static int div(int num1, int num2) {
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        result = div(num1,num2);                       // Αν το num2 = 0 θα δωσει ArithmeticException

        System.out.println("Result: " + result);    //Δεν εκτελειται αυτη η γραμμη
    }
}
