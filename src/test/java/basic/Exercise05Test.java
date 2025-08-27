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
    }
}
