package arrays.easy;

//https://www.geeksforgeeks.org/problems/maximum-prefix-sum-for-a-given-range0227/1
public class MaximumPrefixSumForAGivenRange {

    long[] maxPrefixes(long a[], long L[], long R[], long N, long Q)
    {
        long[] ans = new long[(int) Q];
        for (int i = 0; i < Q; i++) {
            long sum = a[(int)L[i]], max = sum;
            for (int j = (int) (L[i] + 1); j <= R[i]; j++) {
                sum += a[j];
                max = Math.max(max, sum);
            }
            ans[i] = max;
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumPrefixSumForAGivenRange m = new MaximumPrefixSumForAGivenRange();
        long[] a = {-1, 2, 3, -5};
        long[] L = {0, 3};
        long[] R = {1, 3};
        long N = 4;
        long Q = 2;
        for (long num : m.maxPrefixes(a, L, R, N, Q)) {
            System.out.print(num + " ");
        }
    }

}
