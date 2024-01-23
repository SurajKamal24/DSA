package arrays;

import java.util.ArrayList;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {

    public static int countPairs(List<Integer> nums, int target) {
        int res = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target)
                    res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(-1,1,2,3,1));
        int target = 2;
        System.out.println(countPairs(nums, target));
    }

}
