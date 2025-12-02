package gr.aueb.cf.cf9.ch6;

public class Array15 {
    public static void main(String[] args) {
        int[][] arr = {{2, 7, 6},
                       {9, 5, 1},
                       {4, 3, 8},
        };

        System.out.printf("it is%s arr15\n", (isArray15(arr) ? "" : " not"));
    }
    public static boolean isArray15(int[][] arr) {
        int hCount = 0;
        int vCount = 0;
        int diagonal1Sum = 0;
        int diagonal2Sum = 0;
        int[] hSum = new int[3];
        int[] vSum = new int[3];
        boolean isDiagonal1 =  false;
        boolean isDiagonal2 =  false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                hSum[i] += arr[i][j];
                vSum[j] += arr[i][j];
            }

            diagonal1Sum += arr[i][i];
            diagonal2Sum += arr[i][arr.length - i - 1];
        }
        for (int el : hSum) {
            if (el == 15) hCount++;
        }
        for (int el : vSum) {
            if (el == 15) vCount++;
        }

        if (diagonal1Sum == 15) isDiagonal1 = true;
        if (diagonal2Sum == 15) isDiagonal2 = true;
        return (isDiagonal1 && isDiagonal2 && (hCount == 3) && (vCount == 3));
    }
}

