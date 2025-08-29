package stream;

import java.util.Arrays;

/**
 * Exercise02: A whole number of n elements values from 1 to n, removing any value and then randomly arranged.
 * Write a program to receive the integer array of the above process and search for the number that has been removed.
 */
public class Exercise02 {
    public int findMissingNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 1;
        }

        final int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();

        return expectedSum - actualSum;
    }
}
