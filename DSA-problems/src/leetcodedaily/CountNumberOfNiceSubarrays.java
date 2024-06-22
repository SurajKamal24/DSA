package leetcodedaily;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0, count = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            if (nums[r] % 2 == 1) {
                k--;
                count  = 0;
            }
            while (k == 0) {
                count++;
                k += nums[l++] % 2;
            }
            res += count;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new CountNumberOfNiceSubarrays().numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
    }
}
