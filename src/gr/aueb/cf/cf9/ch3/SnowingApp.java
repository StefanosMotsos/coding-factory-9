package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperature in Celsius, and the status of isRaining
 * variable and calculates if it is snowing or not. If it is raining and
 * temperature is below 0, it is snowing.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temperature = 0;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Please insert a temperature: ");
        temperature = scanner.nextInt();
        isSnowing = isRaining && (temperature < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
