package binarysearch.medium;
//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
public class NumberOfOccurrence {
    int count(int[] arr, int n, int x) {
        int[] ans = {-1, -1};
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                if (arr[mid] == x) {
                    ans[0] = mid;
                }
                r = mid - 1;
            }
        }
        l = 0; r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] > x) {
                r = mid - 1;
            } else {
                if (arr[mid] == x) {
                    ans[1] = mid;
                }
                l = mid + 1;
            }
        }
        if (ans[0] == -1) {
            return 0;
        }
        return ans[1] - ans[0] + 1;
    }
    public static void main(String[] args) {
        int N = 7, X = 2;
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println((new NumberOfOccurrence()).count(arr, N, X));
    }
}
