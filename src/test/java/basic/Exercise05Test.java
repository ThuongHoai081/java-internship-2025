package basic;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise05Test {
    @Test
    void shouldFindFactorial_OK() {
        final Exercise05 exercise05 = new Exercise05();
        assertEquals(BigInteger.valueOf(120), exercise05.findFactorial(5));
        assertEquals(BigInteger.ONE, exercise05.findFactorial(0));
        assertEquals(BigInteger.ONE, exercise05.findFactorial(1));
        assertEquals(BigInteger.valueOf(2), exercise05.findFactorial(2));
        assertEquals(BigInteger.valueOf(6), exercise05.findFactorial(3));
        assertEquals(BigInteger.valueOf(24), exercise05.findFactorial(4));

        assertEquals(BigInteger.valueOf(720), exercise05.findFactorial(6));
        assertEquals(BigInteger.valueOf(5040), exercise05.findFactorial(7));
        assertEquals(BigInteger.valueOf(40320), exercise05.findFactorial(8));
        assertEquals(BigInteger.valueOf(362880), exercise05.findFactorial(9));
        assertEquals(new BigInteger("3628800"), exercise05.findFactorial(10));
        assertEquals(new BigInteger("39916800"), exercise05.findFactorial(11));
        assertEquals(new BigInteger("479001600"), exercise05.findFactorial(12));

        assertEquals(new BigInteger("6227020800"), exercise05.findFactorial(13));
        assertEquals(new BigInteger("87178291200"), exercise05.findFactorial(14));
        assertEquals(new BigInteger("1307674368000"), exercise05.findFactorial(15));

        assertEquals(BigInteger.valueOf(-1), exercise05.findFactorial(-5));
    }
}
