package gr.aueb.cf.cf9.ch6;

public class MinMaxApp {
    public static void main(String[] args) {
        int[] grades = new int[] {7, 6, 3, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = grades[0];  //or INTEGER.MAX_VALUE
        int maxValue = grades[0];  //OR INTEGER.MIN_VALUE

        for (int i = 1; i < grades.length; i++) {  //0 If INTEGER
            if (grades[i] < minValue) {
                minPosition = i;
                minValue = grades[i];
            }

            if (grades[i] > maxValue) {
                maxPosition = i;
                maxValue = grades[i];
            }
        }

        System.out.printf("min value: %d, min position: %d ", minValue, minPosition);
        System.out.println();
        System.out.printf("max value: %d, max position: %d ", maxValue, maxPosition);
    }
}
