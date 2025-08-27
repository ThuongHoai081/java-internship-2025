package basic;

/**
 * Exercise04: Fibonacci numbers are a sequence of numbers starting from 1 1
 * and then the next number is equal to the previous 2 numbers added together.
 * That is 1 1 2 3 5 8 ..... Enter an integer n, print out a list of fibonacci numbers not greater than n.
 */
public class Exercise04 {
    public int findFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
         return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
