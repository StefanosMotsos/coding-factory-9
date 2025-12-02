package gr.aueb.cf.cf9.ch6;

public class XorApp {
    public static void main(String[] args) {

    }

    public static boolean xor(boolean a, boolean b) {
        // return (a && !b) || (!a && b);
        return (a ^ b);
    }
}
