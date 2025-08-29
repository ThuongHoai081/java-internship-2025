package stream;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Exercise04: Install the program to enter the integer array, arrange the integer array gradually increased in the order of the dictionary.
 * For example, the integer array is [1, 9, 23, 123, 100, 45, 43], the result is [1, 100, 23, 43, 45, 9]
 * Hint: convert numbers into chains and use compareto jaws in string class
 */
public class Exercise04 {
    public int[] sortByDictionaryOrder(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparing(String::valueOf))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
