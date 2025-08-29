package array;

/**
 * Exercise01: Write a program to find the sum of even numbers
 * and subtract the sum of odd numbers in an array of integers
 */
public class Exercise01 {
    public int sumEvenMinusOdd(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += (num % 2 == 0) ? num : -num;
        }

        return sum;
    }
}
