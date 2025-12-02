package gr.aueb.cf.cf9.ch6;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 4, 5};
        int low = 0;
        int high = arr.length -1;
        int position = -1;
        int value = 5;

        position = binarySearch(arr, value, low, high);

        if (position == -1) {
            System.out.println("Error in data");
        } else {
            System.out.printf("The value of %d is found in the position: %d", value, position + 1);
        }
    }

    public static int binarySearch(int[] arr, int value, int low, int high) {
        if (arr == null) return -1;
        if (low < 0 || high > arr.length) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (value == arr[mid]) return mid;

        if (value > arr[mid]) return binarySearch(arr, value, mid + 1, high);
        else return binarySearch(arr, value, low, mid -1);

    }
}
