package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class Filtering {
    public static void main(String[] args) {
        int[] grades = {1,2,3,4,5,6,7,8,9,10};
        int PASS = 5;
        int[] passed = getPassed(grades, PASS);
        for (int p : passed) {
            System.out.print(p + " ");
        }
    }
    public static int[] getPassed(int[] arr, int PASS) {
        if (arr == null || arr.length == 0) return new int[0];

        int total = 0;
        int[] processingPass = new int[arr.length];

        for (int el : arr) {
            if (el >= PASS) {
                processingPass[total++] = el;
            }
        }
        return Arrays.copyOf(processingPass, total);
    }
}
