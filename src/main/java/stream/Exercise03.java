package stream;

import java.util.stream.Collectors;

/**
 * Exercise03: Write a stream program to read the digits of an integer, the result is a String.
 * For example, entering 123, the result is "One, Two, Three"
 */
public class Exercise03 {
    private static final String[] DIGIT_WORDS = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public String intToString(int number) {
        final String digitsString = String.valueOf(Math.abs(number)).chars()
                .mapToObj(c -> DIGIT_WORDS[Character.getNumericValue(c)])
                .collect(Collectors.joining(", "));

        return number < 0 ? "Minus, " + digitsString : digitsString;
    }
}
