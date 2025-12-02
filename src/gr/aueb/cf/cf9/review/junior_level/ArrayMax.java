package gr.aueb.cf.cf9.review.junior_level;

/**
 * Οι μεταβλητες a, m δεν ειναι 'καλα' ονοματα
 * Ο κωδικας θα μπορουσε να ειναι μεθοδος
 * Δεν εχει documentation
 * Δεν υπαρχει ελεγχος για κενο array
 * Δεν εχει δομη
 * Δεν εχει SoC
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,9,8,15,10};
        int m = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) m = a[i];
        }

        System.out.println(m);
    }
}

