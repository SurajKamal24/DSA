package leetcodedaily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] temp = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            temp[i] = nums[i];
        }
        Arrays.sort(temp, (a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(a) - map.get(b);
            } else {
                return b - a;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(new SortArrayByIncreasingFrequency().frequencySort(new int[]{1, 1, 2, 2, 2, 3}));
    }
}
