package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the weight and the program calculates
 * the weight in grams.
 */
public class KiloToGrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilos = 0;
        final int GRAMS_PER_KG = 1000;
        int totalGrams = 0;

        System.out.println("Παρακαλώ εισάγετε τα κιλά σας: ");

        kilos = scanner.nextInt();
        totalGrams = kilos * GRAMS_PER_KG;
        System.out.printf("Το βάρος σε γραμμάρια είναι: %,d", totalGrams);
    }
}
