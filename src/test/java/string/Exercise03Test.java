package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise03Test {
    @Test
    void shouldRepeatedSubstring_OK() {
        final Exercise03 ex = new Exercise03();

        assertTrue(ex.isRepeatedSubstring("abab"), "abab is repeated by ab");
        assertTrue(ex.isRepeatedSubstring("abcabcabc"), "abcabcabc is repeated by abc");
        assertTrue(ex.isRepeatedSubstring("aaaa"), "aaaa is repeated by a");

        assertFalse(ex.isRepeatedSubstring("abcd"), "abcd is not repeated");
        assertFalse(ex.isRepeatedSubstring("abcde"), "abcde is not repeated");

        assertFalse(ex.isRepeatedSubstring(null), "null should return false");
        assertFalse(ex.isRepeatedSubstring(""), "empty string should return false");
        assertFalse(ex.isRepeatedSubstring("a"), "single character should return false");
    }
}
