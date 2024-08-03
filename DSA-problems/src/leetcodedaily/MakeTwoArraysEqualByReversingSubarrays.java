package leetcodedaily;
import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        /*Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;*/
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

    public static void main(String[] args) {
        System.out.println(new MakeTwoArraysEqualByReversingSubarrays().canBeEqual(new int[] {1,2,3,4}, new int[] {2,4,1,3}));
    }
}

