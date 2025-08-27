package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise06Test {
    @Test
    void shouldGetMonthName_OK() {
        final Exercise06 exercise06 = new Exercise06();
        assertEquals("January", exercise06.getMonthName(1));
        assertEquals("February", exercise06.getMonthName(2));
        assertEquals("March", exercise06.getMonthName(3));
        assertEquals("April", exercise06.getMonthName(4));
        assertEquals("May", exercise06.getMonthName(5));
        assertEquals("June", exercise06.getMonthName(6));
        assertEquals("July", exercise06.getMonthName(7));
        assertEquals("August", exercise06.getMonthName(8));
        assertEquals("September", exercise06.getMonthName(9));
        assertEquals("October", exercise06.getMonthName(10));
        assertEquals("November", exercise06.getMonthName(11));
        assertEquals("December", exercise06.getMonthName(12));

        assertEquals("Error: Invalid month number", exercise06.getMonthName(0));
        assertEquals("Error: Invalid month number", exercise06.getMonthName(-1));
        assertEquals("Error: Invalid month number", exercise06.getMonthName(13));
        assertEquals("Error: Invalid month number", exercise06.getMonthName(100));
    }
}
