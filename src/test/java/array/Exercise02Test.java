package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    void shouldBinarySearch_OK() {
        final Exercise02 ex = new Exercise02();
        // Sorted array in ascending order
        assertEquals(2, ex.binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(0, ex.binarySearch(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(4, ex.binarySearch(new int[]{1, 2, 3, 4, 5}, 5));
        assertEquals(-1, ex.binarySearch(new int[]{1, 2, 3, 4, 5}, 10));

        // Sorted array in descending order
        assertEquals(2, ex.binarySearch(new int[]{9, 7, 5, 3, 1}, 5));
        assertEquals(0, ex.binarySearch(new int[]{9, 7, 5, 3, 1}, 9));
        assertEquals(4, ex.binarySearch(new int[]{9, 7, 5, 3, 1}, 1));
        assertEquals(-1, ex.binarySearch(new int[]{9, 7, 5, 3, 1}, 6));

        assertEquals(-1, ex.binarySearch(new int[]{}, 5));
        assertEquals(-1, ex.binarySearch(null, 5));
    }
}
