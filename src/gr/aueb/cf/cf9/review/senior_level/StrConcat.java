package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Create a message that contains the name of the user and the age.
 */
public class StrConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";

        //Εισοδος δεδομενων με scanner, validation and data binding
        System.out.println("Please enter your first name: ");
        firstname = sc.nextLine();

        System.out.println("Please enter your age: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
        age = sc.nextInt();

        //call a service method
        message = createMessage(firstname, age);

        //Εκτυπωση αποτελεσματων
        System.out.println(message);
    }

    /**
     *  Create a message that contains the name of the user and the age.
     * @param firstname      the user's first name.
     * @param age            the user's age.
     * @return               the message
     */
    public static String createMessage(String firstname, int age) {
        return String.format("Hello, my name is %s and I am %d years old.", firstname, age);
    }
}
