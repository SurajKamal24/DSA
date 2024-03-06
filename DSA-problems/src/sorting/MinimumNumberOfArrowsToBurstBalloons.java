package sorting;

//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/

import java.util.Arrays;

//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
public class MinimumNumberOfArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int result = 1, previous = 0;
        for (int current = 1; current < points.length; current++) {
            if (points[current][0] > points[previous][1]) {
                result++;
                previous = current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MinimumNumberOfArrowsToBurstBalloons m = new MinimumNumberOfArrowsToBurstBalloons();
        int[][] points = {{10,16}, {2,8}, {1,6}, {7,12}};
        System.out.println(m.findMinArrowShots(points));
    }

}
