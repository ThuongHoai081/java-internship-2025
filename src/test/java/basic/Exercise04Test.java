package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise04Test {
    @Test
    void shouldFindFibonacci_OK() {
        final Exercise04 exercise04 = new Exercise04();
        assertEquals(0, exercise04.findFibonacci(0));
        assertEquals(1, exercise04.findFibonacci(1));
        assertEquals(1, exercise04.findFibonacci(2));
        assertEquals(2, exercise04.findFibonacci(3));
        assertEquals(3, exercise04.findFibonacci(4));
        assertEquals(5, exercise04.findFibonacci(5));
        assertEquals(8, exercise04.findFibonacci(6));
        assertEquals(13, exercise04.findFibonacci(7));
        assertEquals(21, exercise04.findFibonacci(8));
        assertEquals(34, exercise04.findFibonacci(9));
        assertEquals(55, exercise04.findFibonacci(10));
        assertEquals(0, exercise04.findFibonacci(-1));
    }
}
