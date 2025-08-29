package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Exercise05Test {
    @Test
    void shouldFindMissingNumber_OK() {
        final Exercise05 ex = new Exercise05();

        assertEquals(2, ex.findMissingNumber(new int[]{1, 3, 4}));
        assertEquals(8, ex.findMissingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 9}));
        assertEquals(1, ex.findMissingNumber(new int[]{2, 3, 4}));
        assertEquals(1, ex.findMissingNumber(new int[]{}));
        assertEquals(4, ex.findMissingNumber(new int[]{1, 2, 3, 5, 6}));
    }
}
