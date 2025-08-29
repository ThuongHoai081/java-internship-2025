package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Exercise05Test {
    @Test
    void shouldFindMissingNumber_OK() {
        final Exercise05 ex = new Exercise05();

        assertEquals(2, ex.findMissingNumber(new int[]{0, 1, 3}));
        assertEquals(8, ex.findMissingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        assertEquals(1, ex.findMissingNumber(new int[]{0}));
        assertEquals(0, ex.findMissingNumber(new int[]{1}));
        assertEquals(5, ex.findMissingNumber(new int[]{0, 1, 2, 3, 4, 6}));
    }
}
