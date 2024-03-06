package sorting.easy;

//https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/jumbled-queries-afb23321/?purpose=login&source=problem-page&update=google

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferentQueries {

    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println("read n and q");
        long[] arr = new long[n];
        // Taking input for the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        System.out.println("read arr");
        // Three separate lists to store the three types of queries
        List<int[]> decrementQueries = new ArrayList<>();
        List<int[]> incrementQueries = new ArrayList<>();
        List<int[]> setQueries = new ArrayList<>();
        while (q > 0) {
            int t = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            if (t == 1) {
                if (x > 0) {
                    incrementQueries.add(new int[]{x, l, r});
                } else {
                    decrementQueries.add(new int[]{x, l, r});
                }
            } else {
                setQueries.add(new int[]{x, l, r});
            }
            q--;
        }
        for (int[] query : decrementQueries) {
            for (int i = query[1] - 1; i < query[2]; i++) {
                arr[i] += query[0];
            }
        }
        for (int[] query : setQueries) {
            for (int i = query[1] - 1; i < query[2]; i++) {
                arr[i] = query[0];
            }
        }
        for (int[] query : incrementQueries) {
            for (int i = query[1] - 1; i < query[2]; i++) {
                arr[i] += query[0];
            }
        }
        // Outputting the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
