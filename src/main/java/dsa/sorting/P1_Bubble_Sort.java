package dsa.sorting;

import java.util.Arrays;

/**
 * Bubble sort
 * <p>
 * Time Complexity: O(n^2)
 * We can make it adaptive
 * It is stable by default
 */

public class P1_Bubble_Sort {

    public static void main(String[] args) {

        int[] input = {5, 3, 9, 2, 7, 1, 6};
        System.out.println("Before sort: " + Arrays.toString(input));
        bubbleSort(input);
        System.out.println("After sort: " + Arrays.toString(input));
    }

    static void bubbleSort(int[] input) {
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input.length - i - 1; j++) {
                if(input[j] > input[j + 1]) {
                    swap(j, j + 1, input);
                }
            }
        }
    }

    static void swap(int idx1, int idx2, int[] input) {
         int temp = input[idx1];
         input[idx1] = input[idx2];
         input[idx2] = temp;
    }
}
