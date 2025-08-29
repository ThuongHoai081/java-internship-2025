package array;

/**
 * Exercise03: Write a reversal program of elements in an integer array (requirements: in-place, no extra array)
 */
public class Exercise03 {
    public int[] reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}
