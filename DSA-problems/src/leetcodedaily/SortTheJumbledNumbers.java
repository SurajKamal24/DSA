package leetcodedaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortTheJumbledNumbers {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> mappedList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                sb.append(mapping[s.charAt(j) - '0']);
            }
            mappedList.add(new int[] {nums[i], Integer.parseInt(sb.toString()), i});
        }
        mappedList.sort((a, b) -> {
            if (a[1] == b[1]) {
                return a[2] - b[2];
            }
            return a[1] - b[1];
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = mappedList.get(i)[0];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortTheJumbledNumbers().sortJumbled(new int[] {8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, new int[] {991, 338, 38})));
    }
}
