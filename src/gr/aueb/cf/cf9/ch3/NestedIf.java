package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * δεχεται ως εισοδο: 1) βαθμολογια
 * και 2) συνολο μαθηματων και υπολογιζει
 * τον μεσο ορο. Στην συνεχεια δινει feedback
 * στο χρηστη: 9 10 αριστα, 7 8 πολυ καλος,
 * 5 6 καλος, >5 αποτυχια
 */
public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjectCount = 0;
        int score = 0;
        int average = 0;

        System.out.println("Please insert the total score and the amount of subjects");
        score = scanner.nextInt();
        subjectCount = scanner.nextInt();

        if (subjectCount == 0) {
            System.out.println("cant be 0");
            System.exit(1);
        }

        average = score / subjectCount;

        if (average < 0 || average > 10) {
            System.out.println("wrong data");
            System.exit(1);
        }

        if (average >=9) {
            System.out.println("excellent");
        } else if (average < 9 && average >= 7) {
            System.out.println("very good");
        } else if (average < 7 && average >= 5) {
            System.out.println("good");
        } else {
            System.out.println("fail lol");
        }
    }
}
