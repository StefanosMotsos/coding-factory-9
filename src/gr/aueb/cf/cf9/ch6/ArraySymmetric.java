package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει αν ένας πίνακας ακεραίων
 * είναι συμμετρικός  ή όχι. Συμμετρικός
 * είναι ένας πίνακας αν διαβάζεται το ίδιο
 * από την αρχή και το τελός.
 * Για παράδειγμα, [1, 2, 3, 3, 2, 1]
 * [1, 2, 3, 2, 1]
 */
public class ArraySymmetric {

    public static void main(String[] args) {

    }

    public static boolean isSym(int[] arr) {
        // boolean isSymmetric = false;

        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
           if (arr[i] != arr[j]) {
               // isSymmetric = false;
               // break;
               return false;
           }
        }
        return true;
    }

    public static boolean isSym2(int[] arr) {
        boolean isSymmetric = false;
        int n = arr.length - 1;

        for (int i = 0; i <= n /2; i++) {
            if (arr[i] != arr[n - i]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
