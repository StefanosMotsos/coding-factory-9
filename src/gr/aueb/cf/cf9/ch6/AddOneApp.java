package gr.aueb.cf.cf9.ch6;

/**
 * Έστω ότι αναπαριστούμε μεγάλους ακεραίους σε μορφή
 * πίνακα, θέλουμε να προσθέσουμε τη μονάδα.
 */
public class AddOneApp {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        printArray(arr);
        System.out.println();
        int[] addedOne = addOne(arr);
        printArray(addedOne);
    }

    /**
     * Προσθέτει την μονάδα σε ένα πίνακα που
     * αναπαριστά ένα ακέραιο.
     * @param arr   ο input πίνακας.
     * @return      ο
     */
    public static int[] addOne(int[] arr) {
        int carry = 1;
        int sum = 0;
        int[] addedOne = new int[arr.length + 1];

        for(int i = arr.length - 1; i > 0; i--) {
            sum = arr[i] + carry;
            addedOne[i + 1] = sum % 10;
            carry = sum / 10;
        }
        addedOne[0] = carry;
        return addedOne;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

}
