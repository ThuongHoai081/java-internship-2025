package stream;

import java.util.stream.Collectors;

/**
 * Exercise03: Write a stream program to read the digits of an integer, the result is a String.
 * For example, entering 123, the result is "One, Two, Three"
 */
public class Exercise03 {
    private static final String[] DIGIT_WORDS = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public String intToString(int number) {
        boolean negative = number < 0;
        int absNumber = Math.abs(number);

        String digitsString = String.valueOf(absNumber).chars()
                .mapToObj(c -> DIGIT_WORDS[Character.getNumericValue(c)])
                .collect(Collectors.joining(", "));

        return negative ? "Minus, " + digitsString : digitsString;
    }
}
