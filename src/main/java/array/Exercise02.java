package array;

/**
 * Exercise02: Write a program that uses a binary search method
 * to search for an integer from an arranged integer array (increasing or decreasing),
 * returning the position if found or -1 if not found
 */
public class Exercise02 {
    public int binarySearch(int[] arr, int x) {
        if (arr == null || arr.length == 0) return -1;

        int left = 0;
        int right = arr.length - 1;
        boolean isAscending = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (isAscending) {
                if (x < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

                continue;
            }

            if (x > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
