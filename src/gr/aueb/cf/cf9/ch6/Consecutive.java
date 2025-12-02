package gr.aueb.cf.cf9.ch6;

public class Consecutive {
    public static boolean moreThanTwo(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean moreThanTwoEndings(int[] arr) {
        if (arr==null) return false;
        int end = 0;
        int[] endings = new int[10];
        for (int el : arr) {
            end = el%10;
            endings[end]++;
            if (endings[end] > 2) return true;
            // if (++endings[end%10] > 2) return true;
        }
        return false;
    }
}
