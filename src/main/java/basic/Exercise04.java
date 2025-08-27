package basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise04: Fibonacci numbers are a sequence of numbers starting from 1 1
 * and then the next number is equal to the previous 2 numbers added together.
 * That is 1 1 2 3 5 8 ..... Enter an integer n, print out a list of fibonacci numbers not greater than n.
 */
public class Exercise04 {
    public List<Integer> findFibonacci(int n) {
        List<Integer> fibonacciNumbers = new ArrayList<>();

        if (n <= 0) {
            return fibonacciNumbers;
        }
        int a = 1, b = 1;
        fibonacciNumbers.add(a);

        while (b <= n) {
            fibonacciNumbers.add(b);
            int temp = b;
            b = a + b;
            a = temp;
        }

        return fibonacciNumbers;
    }
}
