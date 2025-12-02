package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Calculate the maximum value of an array.
 */
public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];

        // Εισοδος δεδομενων, validation and data binding
        System.out.println("Please enter five integers: ");
        for (int i = 0; i < numbers.length; i++) {

            //Validate input
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine();
            }

            numbers[i] = sc.nextInt();
        }
        
        //Delegation - καλει υπηρεσιες / μεθοδους
        int maxPos = getMax(numbers);
        int max = numbers[maxPos];

        // Εκτυπωση αποτελεσματων
        System.out.printf("The biggest number is %d and it is at position %d\n", max, (maxPos + 1));
    }

    /**
     * Finds the position of the maximum value in an array.
     * @param arr   The input array.
     * @return      The position of the maximum value.
     */
    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int maxPosition = 0;
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
