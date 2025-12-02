package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18.
 * Έλεγχει αν μία ηλικία έχει δικαίωμα
 * να ψηφίσει.
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean VoteEligible = false;
        final int VOTING_AGE = 18;
        int inputAge = 0;

        System.out.println("Please insert an age: ");
        inputAge = scanner.nextInt();

        VoteEligible = inputAge >= VOTING_AGE;

        System.out.printf("You are eligble: " + VoteEligible);
        }
    }
