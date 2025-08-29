package stream;

/**
 * Exercise01: Write a program to find the sum of even numbers
 * and subtract the sum of odd numbers in an array of integers
 */
public class Exercise01 {
    public int sumEvenMinusOdd(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        return java.util.Arrays.stream(arr)
                .map(num -> (num % 2 == 0) ? num : -num)
                .sum();
    }
}
