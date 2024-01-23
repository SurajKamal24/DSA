package arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int maxRight = -1;
        for (int i = arr.length -1; i >= 0; i--) {
            ans[i] = maxRight;
            if (arr[i] > maxRight) {
                maxRight = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        for (int num: replaceElements(arr)) {
            System.out.print(num + " ");
        }
    }
}
