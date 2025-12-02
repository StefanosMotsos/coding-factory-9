package gr.aueb.cf.cf9.ch5;

/**
 * Υπολογιζει το παραγοντικο του n
 * με αναδρομικο τροπο.
 */
public class FactorialRecursive {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        } // or just: return (n <= 1) ? 1 : (n * factorial(n-1))
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
