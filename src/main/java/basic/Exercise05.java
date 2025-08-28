package basic;

import java.math.BigInteger;

/**
 * Exercise05: Write an equation to calculate the factorial n! of a number.
 */
public class Exercise05 {
    public BigInteger findFactorial(int n) {
        if (n < 0) return BigInteger.valueOf(-1);
        if (n == 0 || n == 1) return BigInteger.ONE;

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
