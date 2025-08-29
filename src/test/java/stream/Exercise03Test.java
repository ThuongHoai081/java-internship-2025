package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise03Test {
    @Test
    void shouldIntToString_OK() {
        final Exercise03 exercise03 = new Exercise03();

        assertEquals("One, Two, Three", exercise03.intToString(123));
        assertEquals("Nine, Zero, Seven", exercise03.intToString(907));
        assertEquals("Zero", exercise03.intToString(0));
        assertEquals("Seven", exercise03.intToString(7));

    }
}
