package gr.aueb.cf.cf9.ch6;

public class CircularRotation {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9};
        int[] right = doRightShift(arr, 3);
        int[] left = doLeftShift(arr, 2);

        printArray(right);
        System.out.println();
        printArray(left);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static int[] doRightShift(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated =  new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] doLeftShift(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated =  new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }
}
