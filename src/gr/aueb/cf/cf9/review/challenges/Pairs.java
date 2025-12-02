package gr.aueb.cf.cf9.review.challenges;

public class Pairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int result = 0;
        for (int num : arr) result ^= num;

        System.out.println(result);
    }
}
