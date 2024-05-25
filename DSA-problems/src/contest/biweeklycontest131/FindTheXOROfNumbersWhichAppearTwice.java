package contest.biweeklycontest131;

import java.util.HashMap;
import java.util.Map;

public class FindTheXOROfNumbersWhichAppearTwice {
    public int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result = result ^ entry.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new FindTheXOROfNumbersWhichAppearTwice().duplicateNumbersXOR(new int[] {1,2,1,3}));
    }
}
