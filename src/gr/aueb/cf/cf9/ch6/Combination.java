package gr.aueb.cf.cf9.ch6;

public class Combination{

    public static void main(String[] args) {
        int[] initialArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m = 2;
        int[] row = new int[m];
        int size = initialArr.length;
        int counter = 0;

        for (int i = 0; i <= size - m; i++) {
            for (int j = i + 1; j <= size - m + 1; j++) {
                counter++;
                row[0] = initialArr[i];
                row[1] = initialArr[j];
                System.out.printf("%4d. \t%d\t%d\n", counter, row[0], row[1]);
                    }
                }
            }
        }

