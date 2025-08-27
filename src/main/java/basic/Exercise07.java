package basic;

/**
 * Exercise: Given an integer n, reverse the order of its binary representation
 * and return the resulting integer m.
 * Example: n = 23 -> binary "10111" -> reversed "11101" -> m = 29
 */
public class Exercise07 {
    public long findReversedBinary(long n) {
        long reversed = 0;
        while (n > 0) {
            long lastBit = n % 2;
            reversed = (reversed * 2) + lastBit;
            n = n / 2;
        }
        return reversed;
    }
}
