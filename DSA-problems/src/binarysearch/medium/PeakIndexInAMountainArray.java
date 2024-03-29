package binarysearch.medium;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0, r = n - 1, mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                break;
            } else if (arr[mid] > arr[mid - 1]) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        System.out.println(new PeakIndexInAMountainArray().peakIndexInMountainArray(new int[]{0,1,0}));
    }
}
