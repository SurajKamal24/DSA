package leetcodedaily;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new HeightChecker().heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
