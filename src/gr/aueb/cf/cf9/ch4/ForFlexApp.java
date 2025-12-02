package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class ForFlexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int iterations = 0;

        start = scanner.nextInt();
        end = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = start; i <= end; i += step ) {
            iterations++;
            System.out.println(i + " ");
        }

        System.out.println(iterations);
    }
}
