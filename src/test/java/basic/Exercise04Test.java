package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;

public class Exercise04Test {
    @Test
    void shouldFindFibonacci_OK() {
        final Exercise04 exercise04 = new Exercise04();
        assertEquals(Collections.emptyList(), exercise04.findFibonacci(0));
        assertEquals(Collections.emptyList(), exercise04.findFibonacci(-1));

        assertEquals(Arrays.asList(1, 1), exercise04.findFibonacci(1));

        assertEquals(Arrays.asList(1, 1, 2), exercise04.findFibonacci(2));
        assertEquals(Arrays.asList(1, 1, 2, 3), exercise04.findFibonacci(3));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5), exercise04.findFibonacci(5));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5), exercise04.findFibonacci(6));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5), exercise04.findFibonacci(7));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8), exercise04.findFibonacci(8));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8), exercise04.findFibonacci(9));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13), exercise04.findFibonacci(13));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21), exercise04.findFibonacci(21));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34), exercise04.findFibonacci(34));
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), exercise04.findFibonacci(55));


    }
}
