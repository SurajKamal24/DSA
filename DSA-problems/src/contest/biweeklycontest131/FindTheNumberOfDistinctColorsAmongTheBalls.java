package contest.biweeklycontest131;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheNumberOfDistinctColorsAmongTheBalls {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColors = new HashMap<>(); // To store color of each ball
        Map<Integer, Integer> colorCount = new HashMap<>(); // To count occurrences of each color
        int[] result = new int[queries.length]; // To store the result

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];

            if (ballColors.containsKey(x)) {
                int oldColor = ballColors.get(x); // Get the old color
                ballColors.put(x, y); // Update the ball color

                // Update colorCount map
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    colorCount.remove(oldColor);
                }
            } else {
                ballColors.put(x, y); // Assign new color to the ball
            }

            colorCount.put(y, colorCount.getOrDefault(y, 0) + 1); // Update color count
            result[i] = colorCount.size(); // Update the result array
        }

        return result;
    }
    public static void main(String[] args) {
        for (int i : new FindTheNumberOfDistinctColorsAmongTheBalls().queryResults(4, new int[][] {{1, 4}, {2, 5}, {1, 3}, {3, 4}})) {
            System.out.println(i);
        }
    }
}
