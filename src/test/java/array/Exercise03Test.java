package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise03Test {
    @Test
    void shouldReverseArray_OK() {
        final Exercise03 ex = new Exercise03();

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ex.reverseArray(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{2, 1}, ex.reverseArray(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, ex.reverseArray(new int[]{1}));
        assertArrayEquals(new int[]{}, ex.reverseArray(new int[]{}));
        assertArrayEquals(null, ex.reverseArray(null));
    }
}
