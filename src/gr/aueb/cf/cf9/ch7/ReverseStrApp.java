package gr.aueb.cf.cf9.ch7;

public class ReverseStrApp {
    public static void main(String[] args) {
        String str = "Athens University of Economics and Business";
        System.out.println(getReverse2(str));
    }
    public static String getReverse(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
    public static String getReverse2(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
