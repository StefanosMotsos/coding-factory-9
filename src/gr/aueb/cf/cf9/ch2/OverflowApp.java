package gr.aueb.cf.cf9.ch2;

/**
 * Προσθέτει δυο ακεραιους και το αποτελεσμα
 * δημιουργει υπερχηληση (overflow).
 */
public class OverflowApp {
    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        // Εντολες
        result = num1 + num2;

        //Εκτυπωση αποτελεσματος
        System.out.println("το αποτελεσμα ειναι: " + result);
    }
}
