package arrays;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

public class MaxSumSubarrayOfSizeK {

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        long curSum = 0;
        for (int i = 0; i < K; i++) {
            curSum += Arr.get(i);
        }
        //System.out.println("this is currSum before for " + curSum);
        long finalAns = curSum;
        for (int st = 1, en = K; en < N; st++, en++) {
            curSum = curSum - Arr.get(st-1) + Arr.get(en);
            //System.out.println("this is currSum inside for " + curSum);
            finalAns = Math.max(curSum, finalAns);
        }
        return finalAns;
    }

    public static void main(String[] args) {
        int N = 4, K = 2;
        ArrayList<Integer> Arr = new ArrayList<>(List.of(100, 200, 300, 400));
        System.out.println(maximumSumSubarray(K, Arr, N));
    }

}
