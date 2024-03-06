package sorting.medium;

//https://geeksforgeeks.org/problems/inversion-of-array-1587115620/1

import java.util.Arrays;

public class CountInversions {

    public static long mergeAndCount(long arr[], long[] left, long[] right) {
        int i = 0, j = 0, k = 0;
        long ans = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                //The number of inversions is the number of remaining elements in the left half
                // when an element from the right half is being selected.
                ans += left.length - i;
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return ans;
    }

    static long inversionCount(long arr[], long N)
    {
        if (N == 1) return 0;
        long left[] = Arrays.copyOfRange(arr, 0, (int) N/2);
        long right[] = Arrays.copyOfRange(arr, (int) N/2, (int) N);
        return inversionCount(left, left.length) + inversionCount(right, right.length) + mergeAndCount(arr, left, right);
    }

    public static void main(String[] args) {
        long N = 5;
        long[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr, N));
    }

}
