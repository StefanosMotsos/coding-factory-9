package gr.aueb.cf.cf9.ch6;

public class Mapping {
    public static void main(String[] args) {
        int[] salaries = {1000, 1200, 900, 1700};
        double BONUS = 0.25;
        double[] wages = getBonus(salaries, BONUS);

        for (double el : wages) {
            System.out.print(el + " ");
        }
    }

    public static double[] getBonus(int[] arr, double BONUS) {
        if (arr == null || arr.length == 0) return new double[0];
        double[] mapped = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] + (arr[i] * BONUS);
        }
        return mapped;
    }
}
