package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise05Test {
    @Test
    void shouldSumOfMaxDigitNumbers_OK() {
        final Exercise05 ex = new Exercise05();

        assertEquals(999, ex.sumOfMaxDigitNumbers(new int[]{1, 32, 444, 555, 12, 33}));
        assertEquals(333, ex.sumOfMaxDigitNumbers(new int[]{7, 22, 333, 44}));
        assertEquals(99, ex.sumOfMaxDigitNumbers(new int[]{7, 22, 44, 2, 33}));
        assertEquals(6, ex.sumOfMaxDigitNumbers(new int[]{1, 2, 3}));
        assertEquals(0, ex.sumOfMaxDigitNumbers(new int[]{}));
        assertEquals(0, ex.sumOfMaxDigitNumbers(null));
        assertEquals(111, ex.sumOfMaxDigitNumbers(new int[]{-1, -32, -444, 555, 12, 33}));
        assertEquals(-333, ex.sumOfMaxDigitNumbers(new int[]{-333, -22, -7}));
    }
}
