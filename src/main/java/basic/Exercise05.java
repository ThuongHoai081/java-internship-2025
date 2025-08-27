package basic;

import java.math.BigInteger;

/**
 * Exercise05: Write an equation to calculate the factorial n! of a number.
 */
public class Exercise05 {
    public BigInteger findFactorial(int n) {
        if (n < 0) return BigInteger.valueOf(-1);
        if (n == 0 || n == 1) return BigInteger.ONE;

        return factorialDivideAndConquer(1, n);
    }

    public BigInteger factorialDivideAndConquer(int start, int end) {
        if (start > end) return BigInteger.ONE;
        if (start == end) return BigInteger.valueOf(start);
        if (end - start == 1) return BigInteger.valueOf(start).multiply(BigInteger.valueOf(end));
        int mid = (start + end) / 2;
        return factorialDivideAndConquer(start, mid).multiply(factorialDivideAndConquer(mid + 1, end));
    }
}
