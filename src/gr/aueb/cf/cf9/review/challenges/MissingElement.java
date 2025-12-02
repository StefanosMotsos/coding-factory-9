package gr.aueb.cf.cf9.review.challenges;

/**
 * Εστω πινακας με n στοιχεια απο 1 εως n+1
 * Για παραδειγμα [1,2,3,5]
 */
public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(findMissing(arr));
    }

    public static int findMissing(int[] arr) {
        if (arr == null || arr.length <= 0) return 0;
        int n = arr.length + 1;
        int actualSum = 0;
        int expectedSum = 0;
        int missing = 0;

        expectedSum = n * (n + 1) / 2;
        for (int i : arr) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }
}
