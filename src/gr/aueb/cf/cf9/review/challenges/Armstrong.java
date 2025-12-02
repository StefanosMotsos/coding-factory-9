package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * 'Ενας αριθμός Armstrong είναι ένας αριθμός
 * που είναι ίσος με το άθροισμα των ψηφίων του
 * όπου το κάθε ψηφίο έχει υψωθεί στη δύναμη του
 * αριθμού των ψηφίων.
 * Για παράδειγμα, 153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numberOfDigits;
        int digit;
        int sum = 0;
        int ogNum;

        System.out.println("Please enter a number: ");
        num = sc.nextInt();

        ogNum = num;
        numberOfDigits = String.valueOf(num).length();

        while (num != 0) {
            digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        if (ogNum == sum) System.out.printf("The number %d is an Armstrong number\n", ogNum);
        else System.out.printf("The number %d is NOT an Armstrong number\n", ogNum);

        System.out.printf("%d%s Armstrong\n", ogNum, (sum == ogNum) ? " is" : " is not");
    }
}
