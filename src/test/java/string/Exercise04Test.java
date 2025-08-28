package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise04Test {
    @Test
    void shouldShortenString_OK() {
        final Exercise04 exercise04 = new Exercise04();
        assertEquals("a4b2cd2", exercise04.shortenString("aaaabbcdd"));
        assertEquals("a", exercise04.shortenString("a"));
        assertEquals("", exercise04.shortenString(""));
        assertEquals("abcd", exercise04.shortenString("abcd"));
        assertEquals("z5", exercise04.shortenString("zzzzz"));
        assertEquals("a10", exercise04.shortenString("aaaaaaaaaa"));
        assertEquals("a2b3c4", exercise04.shortenString("aabbbcccc"));
        assertEquals("A3B2C", exercise04.shortenString("AAABBC"));
        assertEquals("x2y2z2", exercise04.shortenString("xxyyzz"));
        assertEquals("p2q", exercise04.shortenString("ppq"));
        assertEquals("pq2", exercise04.shortenString("pqq"));
        assertEquals("ab13c", exercise04.shortenString("abbbbbbbbbbbbbc"));
        assertEquals("abc4e6fd", exercise04.shortenString("abcccceeeeeefd"));
    }
}
