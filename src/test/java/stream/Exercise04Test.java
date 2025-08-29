package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise04Test {
    @Test
    void shouldSortByDictionaryOrder_OK() {
        final Exercise04 ex = new Exercise04();

        assertArrayEquals(new int[]{1, 100, 123, 23, 43, 45, 9}, ex.sortByDictionaryOrder(new int[]{1, 9, 23, 123, 100, 45, 43}));
        assertArrayEquals(new int[]{5, 50, 500, 5000}, ex.sortByDictionaryOrder(new int[]{5000, 5, 50, 500}));
        assertArrayEquals(new int[]{}, ex.sortByDictionaryOrder(new int[]{}));
        assertArrayEquals(new int[]{42}, ex.sortByDictionaryOrder(new int[]{42}));
        assertArrayEquals(new int[]{0, 1, 10, 2}, ex.sortByDictionaryOrder(new int[]{2, 10, 0, 1}));
        assertArrayEquals(new int[]{-10, -2, 1, 10}, ex.sortByDictionaryOrder(new int[]{1, -10, 10, -2}));
        assertArrayEquals(new int[]{1, 1, 10, 10, 2, 2}, ex.sortByDictionaryOrder(new int[]{10, 2, 1, 1, 2, 10}));
        assertArrayEquals(new int[]{1, 10, 100, 1000, 2, 20, 200}, ex.sortByDictionaryOrder(new int[]{2, 10, 1, 100, 20, 200, 1000}));
    }
}
