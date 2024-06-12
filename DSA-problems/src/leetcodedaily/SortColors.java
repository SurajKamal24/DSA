package leetcodedaily;

public class SortColors {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for (int num : nums) {
            if (num == 0) {
                zero++;
            }
            if (num == 1) {
                one++;
            }
            if (num == 2) {
                two++;
            }
        }
        int index  = 0;
        while (zero > 0) {
            nums[index++] = 0;
            zero--;
        }
        while (one > 0) {
            nums[index++] = 1;
            one--;
        }
        while (two > 0) {
            nums[index++] = 2;
            two--;
        }
    }
    public static void main(String[] args) {
        new SortColors().sortColors(new int[]{2,0,2,1,1,0});
    }
}
