package gr.aueb.cf.cf9.ch5;

/**
 * Demo του method overloading.
 * Overload = ιδιο ονομα μεθοδου, διαφορετικες παραμετροι
 * method signature => ονομα + παραμετροι
 */
public class MethodOverload {
    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(long a, long b, long c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int sum1, sum3;
        long sum2, sum4;

        sum1 = add(1,2);
        sum2 = add(1L, 2L);
        sum3 = add(1, 2, 3);
        sum4 = add(1L, 2L, 3L);

        System.out.println("Sum1= " + sum1);
        System.out.println("Sum2= " + sum2);
        System.out.println("Sum3= " + sum3);
        System.out.println("Sum4= " + sum4);
    }
}
