package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Αναζητά ένα στοιχείο σε ένα πίνακα.
 */
public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int[] arr = {1, 2, 100, 3, 4};
        int position = -1;

        System.out.println("Please enter a value to search for: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found.");
        } else {
            System.out.printf("The position of the value in arr[] is: %d", position + 1);
        }
    }

        /**
         * Επιστρέφει τη θέση του πρώτου στοιχείου του πίνακα που
         * ισούται με την τιμή αναζήτησης (value). Αν δεν υπάρχει
         * το στοιχείο επιστρέφει -1
         * @param arr       ο input πίνακας.
         * @param value     n τιμή αναζήτησης.
         * @return          το position του πίνακα
         */
        public static int getPosition (int[] arr, int value){
            if (arr == null) return -1;
            int positionToReturn = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    positionToReturn = i;
                    break;
                }
            }
            return positionToReturn;
        }

        public static int getPosition2 ( int[] arr, int value){
            if (arr == null) return -1;
            int positionToReturn = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -1;
        }
    }
