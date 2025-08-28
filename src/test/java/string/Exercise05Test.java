package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Exercise05Test {
    @Test
    void testExpandString() {
        final Exercise05 exercise = new Exercise05();
        assertEquals("abbbbbbbbbbbbbc", exercise.expandString("ab13c"));
        assertEquals("aaa", exercise.expandString("a3"));
        assertEquals("abc", exercise.expandString("abc"));
        assertEquals("a", exercise.expandString("a1"));
        assertEquals("b", exercise.expandString("b"));

        assertEquals("", exercise.expandString(""));
        assertNull(exercise.expandString(null));

        assertEquals("aaaaaaaaaa", exercise.expandString("a10"));
        assertEquals("cccccccccccccccccc", exercise.expandString("c18"));
    }
}
