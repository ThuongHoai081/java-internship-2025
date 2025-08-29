package string;

/**
 * Exercise06: A EAN 13 Barcode with 13 digits is considered valid if:
 * the sum of the numbers in odd positions + 3*(sum of the numbers in even positions) is a number divisible by 10.
 * For example, the barcode 8938505974194 has (8+3+5+5+7+1+4) + 3 * (9+8+0+9+4+9) = 150
 * 150 is divisible by 10, so the code 8938505974194 is valid.
 */
public class Exercise06 {
    public boolean isValidEAN13(String str) {
        if (str == null || str.length() != 13 || !str.matches("\\d{13}")) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < 13; i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            sum += digit * ((i + 1) % 2 == 0 ? 3 : 1);
        }

        return sum % 10 == 0;
    }
}
