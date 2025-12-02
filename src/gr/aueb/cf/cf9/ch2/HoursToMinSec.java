package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Calc Hours to Minutes and Seconds for a given number of hours.
 * The user inserts the number of hours, and the program calculates
 * the number of minutes and the number of seconds. For instance, if
 * the user inserts 1 hour, the program will calculate 60 minutes and
 * 3600 seconds.
 */
public class HoursToMinSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int mins = 0;
        int sec = 0;
        final int MIN_PER_HOUR = 60;
        final int SEC_PER_HOUR = 3600;

        System.out.println("Παρακαλώ εισάγετε τον αριθμό των ωρών");

        inputHours = scanner.nextInt();
        mins = inputHours * MIN_PER_HOUR;
        sec = inputHours * SEC_PER_HOUR;

        System.out.printf(Locale.US, "The number of minutes is: %,d%n", mins);
        System.out.printf(Locale.forLanguageTag("el"), "The number of seconds is: %,d%n", sec);
    }
}
