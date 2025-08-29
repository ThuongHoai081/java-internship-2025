package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise04Test {
    @Test
    void shouldMergeTwoSortedArrays_OK() {
        final Exercise04 ex = new Exercise04();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, ex.mergeArrayAndSort(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
        assertArrayEquals(new int[]{1, 2, 3}, ex.mergeArrayAndSort(new int[]{1, 2, 3}, new int[]{}));
        assertArrayEquals(new int[]{1, 2, 3}, ex.mergeArrayAndSort(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{}, ex.mergeArrayAndSort(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{1, 2, 3}, ex.mergeArrayAndSort(null, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, ex.mergeArrayAndSort(new int[]{1, 2, 3}, null));
        assertArrayEquals(null, ex.mergeArrayAndSort(null, null));
    }
}
