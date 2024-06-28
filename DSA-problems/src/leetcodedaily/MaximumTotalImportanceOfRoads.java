package leetcodedaily;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumTotalImportanceOfRoads {
    public long maximumImportance(int n, int[][] roads) {
        int[] connections = new int[n];
        for (int[] road: roads) {
            connections[road[0]]++;
            connections[road[1]]++;
        }
        Integer[] cities = new Integer[n];
        for (int i = 0; i < n; i++) {
            cities[i] = i;
        }
        Arrays.sort(cities, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return connections[o2] - connections[o1];
            }
        });
        long importance = 0;
        for (int i = 0; i < n; i++) {
            importance += (long) connections[cities[i]] * (n - i);
        }
        return importance;
    }
    public static void main(String[] args) {
        System.out.println(new MaximumTotalImportanceOfRoads().maximumImportance(5, new int[][]{{0,1}, {1,2}, {2,3}, {0,2}, {1,3}, {2,4}}));
    }
}
