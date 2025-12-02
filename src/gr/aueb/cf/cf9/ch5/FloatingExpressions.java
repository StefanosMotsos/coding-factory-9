package gr.aueb.cf.cf9.ch5;

/**
 * Demo of Floating Point Expressions.
 */
public class FloatingExpressions {
    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 10.5f;
        double doubleNum = 10.56789;

        double result = 0.0;

        result = intNum + floatNum + doubleNum;

        System.out.println("Result is: " + result);
    }
}
