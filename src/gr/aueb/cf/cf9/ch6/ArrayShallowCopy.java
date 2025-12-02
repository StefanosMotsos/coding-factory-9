package gr.aueb.cf.cf9.ch6;

/**
 * Όταν κάνουμε copy referencess, τότε
 * το copy ονομάζεται shallow και έχει
 * side effects
 */
public class ArrayShallowCopy {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] arr2 = array1; //shallow copy

        arr2[0] = 1000;
        System.out.println(array1[0]);
    }
}
