package basic;

/**
 * Exercise: Convert a decimal (integer) number to its Roman numeral representation.
 */
public class Exercise08 {
    private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};
    private static final String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] UNITS = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


    public String convertToRoman(int number) {
        if (number <= 0 || number > 3999) {
            return "Error: Number must be between 1 and 3999";
        }

        return THOUSANDS[number / 1000] +
                HUNDREDS[(number % 1000) / 100] +
                TENS[(number % 100) / 10] +
                UNITS[number % 10];
    }
}
