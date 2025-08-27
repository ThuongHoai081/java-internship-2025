package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise03Test {
    @Test
    void shoudPrimeFactorization_OK() {
        final Exercise03 exercise03 = new Exercise03();
        assertEquals("2 * 3 * 3 * 5", exercise03.primeFactorization(90));
        assertEquals("13", exercise03.primeFactorization(13));
        assertEquals("2 * 2 * 5 * 5", exercise03.primeFactorization(100));
        assertEquals("1 cannot be factorized into prime numbers", exercise03.primeFactorization(1));
        assertEquals("2 * 2 * 2 * 5 * 5 * 5", exercise03.primeFactorization(1000));
    }
}
