package arrays.easy;

//https://leetcode.com/problems/maximum-population-year/description/

public class MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {
        int res = 0;
        int[] pop = new int[2051];
        for (int i = 0; i < logs.length; i++) {
            pop[logs[i][0]] += 1;
            pop[logs[i][1]] -= 1;
        }
        for (int i = 1950; i < 2050; i++) {
            pop[i] += pop[i - 1];
            res = pop[i] > pop[res] ? i : res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] logs = {{1993,1999}, {2000,2010}};
        MaximumPopulationYear m = new MaximumPopulationYear();
        System.out.println(m.maximumPopulation(logs));
    }

}
