package leetcodedaily;

public class MinimumSwapsToGroupAll1sTogetherII {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int onesCount = 0;
        for (int num : nums) {
            if (num == 1) {
                onesCount++;
            }
        }
        if (onesCount == 0) {
            return 0;
        }
        int[] newNums = new int[n + n];
        System.arraycopy(nums, 0, newNums, 0, n);
        System.arraycopy(nums, 0, newNums, n, n);
        int zerosCount = 0;
        for (int i = 0; i < onesCount; i++) {
            if (newNums[i] == 0) {
                zerosCount++;
            }
        }
        int minZeros = zerosCount;
        for (int i = 1; i < n; i++) {
            if (newNums[i - 1] == 0) {
                zerosCount--;
            }
            if (newNums[i + onesCount - 1] == 0) {
                zerosCount++;
            }
            minZeros = Math.min(minZeros, zerosCount);
        }
        return minZeros;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumSwapsToGroupAll1sTogetherII().minSwaps(new int[]{1}));
    }
}
