package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * User inserts start, end and step values
 * and the program calculates how many times
 * will the while loop.
 */
public class GenericWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        final int TIMES = 3;
        int i = 1;

        while (i <= TIMES) {
            int counter = 0;
            start = scanner.nextInt();
            end = scanner.nextInt();
            step = scanner.nextInt();
            i++;
            while (start <= end) {
                counter++;
                start += step;
            }
            System.out.printf("The while loop happened %d times", counter);
        }
        int j = 1;
        int endVal = 10;

        while (j <= endVal) {
            System.out.println("j=" + j);
            j++;
        }

        System.out.println("epanlipseis: " + (j -1));
    }
}

