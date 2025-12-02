package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Ορίζει δύο μεθοδους, τις isEven και
 * isOdd για τον ελεγχο ενος ακεραιου
 * αν ειναι αρτιος η περιττος
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        num = scanner.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is even");
        } else if (isOdd(num)){
            System.out.println(num + " is odd");
        }

    }

    public static boolean isEven(int a) {
        return (a % 2) == 0;
    }

    public static boolean isOdd(int a) {
        // return (a % 2) != 0;
        return !isEven(a);
    }

}
