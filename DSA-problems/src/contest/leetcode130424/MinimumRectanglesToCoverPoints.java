package contest.leetcode130424;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumRectanglesToCoverPoints {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int last = -1, rectangle = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > last) {
                rectangle++;
                last = points[i][0] + w;
            }
        }
        return rectangle;
    }
    public static void main(String[] args) {
        System.out.println(new MinimumRectanglesToCoverPoints().minRectanglesToCoverPoints(new int[][]{{0,0}, {1,1}, {2,2}, {3,3}, {4,4}, {5,5}, {6,6}}, 2));
    }
}
