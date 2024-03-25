package sorting.medium;

//https://leetcode.com/problems/most-beautiful-item-for-each-query/description/

import java.util.*;

public class MostBeautifulItemForEachQuery {

    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = queries.length;
        List<int[]> newQueries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newQueries.add(new int[] {queries[i], i});
        }
        int[] ans = new int[n];
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        Collections.sort(newQueries, (a, b) -> Integer.compare(a[0], b[0]));
       /* for (int[] num : items) {
            System.out.println(num[0] + " " + num[1]);
        }
        for (int[] num : newQueries) {
            System.out.println(num[0] + " " + num[1]);
        }*/
        for (int j = 0, i= 0, x = 0; j < newQueries.size(); j++) {
            while (i < items.length && newQueries.get(j)[0] >= items[i][0]) {
                //System.out.println("query " + newQueries.get(j)[0] + " items " + items[i][0]);
                x = Math.max(x, items[i][1]);
                i++;
            }
            //System.out.println("this is x " + x);
            ans[newQueries.get(j)[1]] = x;
        }
        return ans;
    }

    public static void main(String[] args) {
        MostBeautifulItemForEachQuery m = new MostBeautifulItemForEachQuery();
        int[][] items = {{1,2}, {3,2}, {2,4}, {5,6}, {3,5}};
        int[] queries = {1,2,3,4,5,6};
        for (int num : m.maximumBeauty(items, queries)) {
            System.out.print(num + " ");
        }
    }

}
