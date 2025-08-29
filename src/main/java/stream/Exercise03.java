package stream;

/**
 * Exercise03: Write a stream program to read the digits of an integer, the result is a String.
 * For example, entering 123, the result is "One, Two, Three"
 */
public class Exercise03 {
    private static final String[] digitWords = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
    };

    public String intToString(int number) {
        if (number == 0) {
            return "Zero";
        }

        return String.valueOf(number).chars()
                .mapToObj(c -> digitWords[Character.getNumericValue(c)])
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
    }
}
