package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise08Test {
    @Test
    void shouldConvertToRoman_OK() {
        final Exercise08 ex = new Exercise08();
        assertEquals("I", ex.convertToRoman(1));
        assertEquals("II", ex.convertToRoman(2));
        assertEquals("III", ex.convertToRoman(3));
        assertEquals("IV", ex.convertToRoman(4));
        assertEquals("V", ex.convertToRoman(5));
        assertEquals("IX", ex.convertToRoman(9));

        assertEquals("X", ex.convertToRoman(10));
        assertEquals("XX", ex.convertToRoman(20));
        assertEquals("XL", ex.convertToRoman(40));
        assertEquals("L", ex.convertToRoman(50));
        assertEquals("XC", ex.convertToRoman(90));

        assertEquals("C", ex.convertToRoman(100));
        assertEquals("CC", ex.convertToRoman(200));
        assertEquals("CD", ex.convertToRoman(400));
        assertEquals("D", ex.convertToRoman(500));
        assertEquals("CM", ex.convertToRoman(900));

        assertEquals("M", ex.convertToRoman(1000));
        assertEquals("MM", ex.convertToRoman(2000));
        assertEquals("MMM", ex.convertToRoman(3000));

        assertEquals("LVIII", ex.convertToRoman(58));
        assertEquals("MCMXCIV", ex.convertToRoman(1994));
        assertEquals("MMMCMXCIX", ex.convertToRoman(3999));

        assertEquals("Error: Number must be between 1 and 3999", ex.convertToRoman(0));
        assertEquals("Error: Number must be between 1 and 3999", ex.convertToRoman(-1));
        assertEquals("Error: Number must be between 1 and 3999", ex.convertToRoman(4000));
    }
}
