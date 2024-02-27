package arrays.easy;

public class RangeAddition {

    public int[] getModifiedArray(int length, int[][] updates) {
        int[] arr = new int[length];
        for (int i = 0; i < updates.length; i++) {
            int l = updates[i][0];
            int r = updates[i][1];
            arr[l] += 1;
            if (r + 1 < length) {
                arr[r + 1] -= 1;
            }
        }
        for (int i = 1; i < length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] updates = {{0, 4}, {1, 3}};
        RangeAddition r = new RangeAddition();
        for (int num : r.getModifiedArray(5, updates)) {
            System.out.print(num + " ");
        }
    }

}
