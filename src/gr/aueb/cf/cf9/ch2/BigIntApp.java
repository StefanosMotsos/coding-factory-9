package gr.aueb.cf.cf9.ch2;

import java.math.BigInteger;

/**
 * BigInteger Class Demo
 */
public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("1234534265324612352145212336789");
        BigInteger bigNum2 = new BigInteger("9876543342532463212312312313214621");
        BigInteger bigResult;

        bigResult = bigNum1.add(bigNum2);

        System.out.printf("result is: %,d%n", bigResult);
    }
}
