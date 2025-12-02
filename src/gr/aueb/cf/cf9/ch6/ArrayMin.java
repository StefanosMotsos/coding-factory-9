package gr.aueb.cf.cf9.ch6;

/**
 * Βρίσκει το ελάχιστο στοιχείο ενός πίνακα.
 */
public class ArrayMin {
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 2, 9, 1, 8};
        int minPosition = getMin(arr);
        System.out.printf("the position of the minimum number is %d and the number is: %d",minPosition, arr[minPosition]);
        System.out.println();

        int minPosition2 = getMin2(arr, 0, arr.length -1);
        System.out.printf("the position of the minimum number is %d and the number is: %d",minPosition2, arr[minPosition2]);
    }

    public static int getMin(int[] arr) {
        int minPosition = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMin2(int[] arr, int low, int high){
        int minPosition = low;
        if (low < 0 || high > arr.length - 1) return -1;

        int minValue = arr[low];
        for (int i = low; i < high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMin3(int[] arr) {
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
