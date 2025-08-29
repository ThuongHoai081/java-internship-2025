package array;

/**
 * Exercise04: Write a program to receive 2 arrays of arranged integers,
 * create an integer array from two given integer arrays and keep the order arranged.
 * (Requirements: Do not use more sort operations)
 */
public class Exercise04 {
    public int[] mergeArrayAndSort(int[] arr1, int[] arr2) {
        if (arr1 == null) return arr2;
        if (arr2 == null) return arr1;

        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                 mergedArray[k++] = arr2[j++];
             }
        }

        while (i < len1) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < len2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
