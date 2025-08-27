package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise01Test {
    @Test
    void shouldIsPalindrome_OK() {
        final Exercise01 exercise01 = new Exercise01();

        assertTrue(exercise01.isPalindrome("abcba"));
        assertTrue(exercise01.isPalindrome("RaceCar"));
        assertTrue(exercise01.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(exercise01.isPalindrome("12321"));
        assertTrue(exercise01.isPalindrome(""));
        assertTrue(exercise01.isPalindrome("a"));

        assertFalse(exercise01.isPalindrome("hello"));
        assertFalse(exercise01.isPalindrome("12345"));
        assertFalse(exercise01.isPalindrome("abcd"));
    }
}
