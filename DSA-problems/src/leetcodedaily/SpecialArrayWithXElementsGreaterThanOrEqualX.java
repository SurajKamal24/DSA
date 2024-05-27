package leetcodedaily;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public int specialArray(int[] nums) {
        for (int x = 1; x <= nums.length; x++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= x) {
                    count++;
                }
            }
            if (count == x) {
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new SpecialArrayWithXElementsGreaterThanOrEqualX().specialArray(new int[] {0,4,3,0,4}));
    }
}
