package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise06Test {
    @Test
    void shouldIsValidEAN13() {
        final Exercise06 exercise06 = new Exercise06();
        assertTrue(exercise06.isValidEAN13("4006381333931"));
        assertTrue(exercise06.isValidEAN13("9780201379624"));
        assertTrue(exercise06.isValidEAN13("5901234123457"));

        assertFalse(exercise06.isValidEAN13("4006381333930"));
        assertFalse(exercise06.isValidEAN13("9780201379623"));
        assertFalse(exercise06.isValidEAN13("5901234123456"));

        assertFalse(exercise06.isValidEAN13(null));
        assertFalse(exercise06.isValidEAN13(""));
        assertFalse(exercise06.isValidEAN13("123456789012"));
        assertFalse(exercise06.isValidEAN13("12345678901234"));
        assertFalse(exercise06.isValidEAN13("12345678901a3"));
    }
}
