package gr.aueb.cf.cf9.review.mid_level;

public class EvenApp {
    public static void main(String[] args) {
        int num = 10;
        boolean result = Even(num);
        System.out.println(result);
    }
    public static boolean Even(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return !Even(num);
    }
}
