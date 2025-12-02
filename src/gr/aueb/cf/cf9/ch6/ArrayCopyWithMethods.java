package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class ArrayCopyWithMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrayCopy =  new int[5];

        System.arraycopy(arr, 0, arrayCopy, 0, arr.length);
        printArrays(arrayCopy);

        arrayCopy = Arrays.copyOf(arr, arr.length);
        printArrays(arrayCopy);

        arrayCopy =  Arrays.copyOfRange(arr, 0, arr.length);
        printArrays(arrayCopy);
    }

    public static void printArrays(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
