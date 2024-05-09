package leetcodedaily;

import java.util.Arrays;

public class MaximizeHappinessOfSelectedChildren {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Arrays.sort(happiness);
        int i = 0, j = 0;
        long sum = 0;
        while (k > 0) {
            int val = happiness[n - i - 1] - j;
            sum += val > 0 ? val : 0;
            i++;
            j++;
            k--;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new MaximizeHappinessOfSelectedChildren().maximumHappinessSum(new int[]{12,1,42}, 3));
    }
}
