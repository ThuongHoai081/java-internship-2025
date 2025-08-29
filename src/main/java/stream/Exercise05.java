package stream;

import java.util.Arrays;

/**
 * Write a program to receive an array of integers, find the list of the most digital numbers and then calculate their sum.
 * For example, the input array [1, 32, 444, 555, 12, 33], there are [444, 555] with 3 digits and the most,so the total need to find is 444 + 555 = 999
 * Hint: It is allowed to convert numbers into string and use the length () function to get the number of digits
 */
public class Exercise05 {
    public int sumOfMaxDigitNumbers(int[] arr) {
        if (arr == null) return 0;

        final int maxDigits = Arrays.stream(arr)
                .map(n -> String.valueOf(Math.abs(n)).length())
                .max()
                .orElse(0);

        return Arrays.stream(arr)
                .filter(n -> String.valueOf(Math.abs(n)).length() == maxDigits)
                .sum();
    }
}
