package dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2_Merge_Sort {
    public static void main(String[] args) {
        int[] input = {5, 3, 9, 2, 7, 1, 6};
        System.out.println("Before sort: " + Arrays.toString(input));
        mergeSort(input, 0, input.length - 1);
        System.out.println("After sort: " + Arrays.toString(input));
    }

    private static void mergeSort(int[] input, int low, int high) {
        int mid;
        if(low < high) {
            mid = (low + high) / 2;
            mergeSort(input, low, mid);
            mergeSort(input, mid + 1, high);
            merge(input, low, mid, high);
        }
    }

    //TODO:WIP

    static void merge(int[] input, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;
        List<Integer> result = new ArrayList<>();

        while(left <= mid && right <= high) {
            if(input[left] < input[right]) {
                result.add(input[left]);
                left++;
            } else{
                result.add(input[right]);
                right++;
            }
        }

        while(left <= mid) {
            result.add(input[left++]);
        }

        while(right <= high) {
            result.add(input[right++]);
        }

        // Finally copy contents of result to input
        for(int idx = low; idx <= high; idx++) {
            input[idx] = result.get(idx);
        }
    }
}
