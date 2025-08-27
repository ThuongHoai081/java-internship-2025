package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    void shouldSumOfIntegersInString_OK() {
        final Exercise02 exercise02 = new Exercise02();
        assertEquals(6, exercise02.sumOfIntegersInString("a1b2c3"));
        assertEquals(123, exercise02.sumOfIntegersInString("abc123xyz"));
        assertEquals(0, exercise02.sumOfIntegersInString("abc"));
        assertEquals(123, exercise02.sumOfIntegersInString("123"));
        assertEquals(0, exercise02.sumOfIntegersInString(""));
        assertEquals(0, exercise02.sumOfIntegersInString(null));

        assertEquals(146, exercise02.sumOfIntegersInString("100start23middle23end"));
        assertEquals(146, exercise02.sumOfIntegersInString("123abc23"));

        assertEquals(6, exercise02.sumOfIntegersInString("1.2.3"));
        assertEquals(46, exercise02.sumOfIntegersInString("12,34?!"));

        assertEquals(10000000000L, exercise02.sumOfIntegersInString("abc10000000000xyz"));

        assertEquals(380, exercise02.sumOfIntegersInString("abc 123 def 33 mn 3.221"));
    }
}
