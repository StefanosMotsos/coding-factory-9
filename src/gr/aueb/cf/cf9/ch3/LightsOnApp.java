package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Decides to turn on the lights of a car
 * based on 3 variables: If it rains AND
 * simultaneously one of the following is true:
 * It's dark or we are speeding (speed > 100).
 * We take these values from the user.
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        boolean isRunning = false;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining: ");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert if it is dark: ");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert your current speed: ");
        speed = scanner.nextInt();

        isRunning = speed > MAX_SPEED;
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("The lights are on: " + lightsOn);
    }
}
