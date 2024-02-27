package arrays.medium;

public class CountNumberOfNiceSubarrays {

    public int numberOfSubarrays(int[] nums, int k) {
        int l = 0, r = 0, oddCount = 0, ans = 0;
        while (r < nums.length) {
            if (nums[r] % 2 != 0) {
                oddCount++;
            }
            while (oddCount > k) {
                if (nums[l] % 2 != 0) {
                    oddCount--;
                }
                l++;
            }
            if (oddCount == k) {
                ans++;
            }
            r++;
        }
        return ans;
    }

    public static void main(String[] args) {
        CountNumberOfNiceSubarrays c = new CountNumberOfNiceSubarrays();
        int[] nums = {1,1,2,1,1};
        int k = 3;
        System.out.println(c.numberOfSubarrays(nums, k));
    }

}
