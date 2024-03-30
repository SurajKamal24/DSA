package binarysearch.easy;

public class BinarySearchableCount {
    public boolean binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 3, 5, 7};
        int count = 0;
        for (int num : arr) {
            if (new BinarySearchableCount().binarySearch(arr, num)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
