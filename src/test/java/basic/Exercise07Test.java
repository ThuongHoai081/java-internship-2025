package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise07Test {
    @Test
    void shouldFindReversedBinary_OK() {
        final Exercise07 exercise07 = new Exercise07();
        assertEquals(29, exercise07.findReversedBinary(23));
        assertEquals(1, exercise07.findReversedBinary(1));
        assertEquals(0, exercise07.findReversedBinary(0));
        assertEquals(1, exercise07.findReversedBinary(2));
        assertEquals(3, exercise07.findReversedBinary(3));
        assertEquals(15, exercise07.findReversedBinary(240));
        assertEquals(536_870_911, exercise07.findReversedBinary(536_870_911));
    }
}
