package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void shouldSumEvenMinusOdd_OK() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(2, exercise01.sumEvenMinusOdd(new int[]{1, 2, 3, 4}));
        assertEquals(12, exercise01.sumEvenMinusOdd(new int[]{2, 4, 6}));
        assertEquals(-9, exercise01.sumEvenMinusOdd(new int[]{1, 3, 5}));
        assertEquals(2, exercise01.sumEvenMinusOdd(new int[]{-1, -2, -3}));
        assertEquals(0, exercise01.sumEvenMinusOdd(new int[]{}));
        assertEquals(0, exercise01.sumEvenMinusOdd(null));
        assertEquals(-5, exercise01.sumEvenMinusOdd(new int[]{5}));
        assertEquals(4, exercise01.sumEvenMinusOdd(new int[]{4}));
        assertEquals(0, exercise01.sumEvenMinusOdd(new int[]{0, 0, 0}));
        assertEquals(55, exercise01.sumEvenMinusOdd(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30}));
    }
}
