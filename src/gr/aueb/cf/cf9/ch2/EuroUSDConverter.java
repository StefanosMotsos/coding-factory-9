package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα πόσο (ακέραιος) σε ευρώ και το
 * μετατρέπει σε δολάρια ΗΠΑ με βάση μία ισοτιμία. Για παράδειγμα,
 * αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία είναι 1 Euro = 99 USA cents,
 * τότε τα συνολικά USA cents είναι 9900 και αυτό αντιστοιχεί σε 99 USA Dollars
 * και 0 USA cents
 */

public class EuroUSDConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        final int PARITY = 116;
        int usaDollars = 0;
        int usaCents = 0;
        int totalUsaCents = 0;

        System.out.println("Please insert an amount in Euros: ");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d Euros = %d usa cents = %d USDollars & %d usa cents%n", inputEuros, totalUsaCents, usaDollars, usaCents);
    }

}
