package binarysearch.medium;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int id = 0;
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            id = i;
            int l = i+1, r = numbers.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (x + numbers[mid] == target) {
                    return new int[]{id+1, mid+1};
                } else if (x + numbers[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] result = new TwoSumIIInputArrayIsSorted().twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(result[0] + " " + result[1]);
    }
}
