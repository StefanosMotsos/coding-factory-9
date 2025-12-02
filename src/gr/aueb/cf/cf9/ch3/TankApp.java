package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Gets a true/false value from the user
 * for if the tanks are below 1/4.
 * It processes it and turns orange if one
 * of them is >1/4, and red when both are >1/4
 */
public class TankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOrange = false;
        boolean isRed = false;
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;

        System.out.println("Please insert if the tanks are below 1/4");
        System.out.println("Tank 1 is...");
        isEmptyTank1 = scanner.nextBoolean();
        System.out.println("Tank 2 is ...");
        isEmptyTank2 = scanner.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange: " + isOrange +", " + "Red: " + isRed);
    }
}
