package sorting;

//https://www.geeksforgeeks.org/problems/minimum-swaps/1

import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwapsToSort {

    public int minSwaps(int nums[])
    {
        Pair[] pair = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pair[i] = new Pair(nums[i], i);
        }
        Arrays.sort(pair, new Custom_Comparator());
        int swaps = 0;
        int i = 0;
        while (i < pair.length) {
            Pair p = pair[i];
            if (p.index == i) {
                i++;
            } else {
                Pair temp = pair[p.index];
                pair[p.index] = pair[i];
                pair[i] = temp;
                swaps++;
            }
        }
        return swaps;
    }

    private class Pair {
        int value;
        int index;
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    class Custom_Comparator implements Comparator<Pair> {
        @Override
        public int compare(Pair p1, Pair p2) {
            return p1.value - p2.value;
        }
    }

    public static void main(String[] args) {
        MinimumSwapsToSort m = new MinimumSwapsToSort();
        int[] nums = {2, 8, 5, 4};
        System.out.println(m.minSwaps(nums));
    }

}
