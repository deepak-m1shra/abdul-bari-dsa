package dsa.sorting;

import java.util.Arrays;

public class P4_Insertion_Sort {
    public static void main(String[] args) {
        int[] input = {5, 3, 9, 2, 7, 1, 6};
        System.out.println("Before sort: " + Arrays.toString(input));
        insertionSort(input);
        System.out.println("After sort: " + Arrays.toString(input));
    }

    private static void insertionSort(int[] input) {
        int n = input.length;
        for (int i = 1; i < n; i++) {

            int num = input[i];
            int j = i - 1;

            // keep shifting if number pointed by j is greater, keep decrementing j
            while(j >= 0 && input[j] > num) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = num;
        }
    }
}
