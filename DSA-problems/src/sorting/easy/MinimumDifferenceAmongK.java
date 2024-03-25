package sorting.easy;

//https://www.geeksforgeeks.org/problems/minimum-difference-among-k5805/1

import java.util.Arrays;
import java.util.Collections;

public class MinimumDifferenceAmongK {

    long minDiff(long a[] ,int N,int K)
    {
        Arrays.sort(a);
        long ans = Integer.MAX_VALUE;
        for (int st = 0, en = K-1; en < N; st++, en++) {
            ans = Math.min(ans, (a[en] - a[st]));
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimumDifferenceAmongK m = new MinimumDifferenceAmongK();
        int N = 7, K = 3;
        long[] arr = {10, 100, 300, 200, 1000, 20, 30};
        System.out.println(m.minDiff(arr, N, K));
    }

}
