package array;

/**
 * Exercise05: A whole number of n elements values from 1 to n, removing any value and then randomly arranged.
 * Write a program to receive the integer array of the above process and search for the number that has been removed.
 */
public class Exercise05 {
    public int findMissingNumber(int[] arr) {
        int n = arr.length + 1;

        int xorAll = 0;
        for (int i = 0; i < n; i++) {
            xorAll ^= i;
        }

        int xorArr = 0;
        for (int num : arr) {
            xorArr ^= num;
        }

        return xorAll ^ xorArr;
    }
}
