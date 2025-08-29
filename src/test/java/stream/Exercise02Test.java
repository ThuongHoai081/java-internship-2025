package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    void shouldFindMissingNumber_OK() {
        final Exercise02 ex = new Exercise02();

        assertEquals(2, ex.findMissingNumber(new int[]{1, 3, 4}));
        assertEquals(8, ex.findMissingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 9}));
        assertEquals(1, ex.findMissingNumber(new int[]{2, 3, 4}));
        assertEquals(1, ex.findMissingNumber(new int[]{}));
        assertEquals(4, ex.findMissingNumber(new int[]{1, 2, 3, 5, 6}));
    }
}
