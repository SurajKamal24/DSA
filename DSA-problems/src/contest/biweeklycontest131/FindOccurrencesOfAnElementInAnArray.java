package contest.biweeklycontest131;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurrencesOfAnElementInAnArray {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                list.add(i);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] <= list.size()) {
                queries[i] = list.get(queries[i] - 1);
            } else {
                queries[i] = -1;
            }
        }


        return queries;

    }
    public static void main(String[] args) {
        for (int i : new FindOccurrencesOfAnElementInAnArray().occurrencesOfElement(new int[] {1,3,1,7}, new int[] {1,3,2,7}, 1)) {
            System.out.println(i);
        }
    }
}
