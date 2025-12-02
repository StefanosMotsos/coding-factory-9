package gr.aueb.cf.cf9.ch5;

/**
 * Οριζει μια μεθοδο void swap(int a, int b) n οποια
 * θα ανταλλασει αμοιβαια τις a, b.
 */
public class SwapApp {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.printf("a = %d,  b = %d\n", x, y);
        swap(x, y);

        System.out.printf("a = %d,  b = %d\n", x, y);
    }

    /**
     * Swap two numbers.
     * @param a the first number.
     * @param b the second number.
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
