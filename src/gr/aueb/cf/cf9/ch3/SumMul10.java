package gr.aueb.cf.cf9.ch3;

/**
 * Sum of 10 numbers, from 1 to 10.
 */
public class SumMul10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int mul = 1;
        int j = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum= " + sum);

        while (j <= 10) {
            mul *= j;
            j++;
        }
        System.out.println("Product= " + mul);
    }
}
