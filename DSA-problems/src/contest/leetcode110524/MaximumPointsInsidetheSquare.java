package contest.leetcode110524;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class MaximumPointsInsidetheSquare {
    public int maxPointsInsideSquare(int[][] points, String s) {
        int n = points.length;
        for (int i = 0; i < n; i++) {
            points[i][0] = abs(points[i][0]);
            points[i][1] = abs(points[i][1]);
        }
        int left = 0, right = 1000000000;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Map<Character, Integer> charCount = new HashMap<>();
            boolean isValid = true;
            for (int i = 0; i < n; i++) {
                if (points[i][0] <= mid && points[i][1] <= mid) {
                    charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() > 1) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (points[i][0] <= result && points[i][1] <= result) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new MaximumPointsInsidetheSquare().maxPointsInsideSquare(new int[][]{{1,1},{2,2},{3,3}}, "abc"));
    }
}
