package sorting;

//https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

import java.util.Arrays;

public class MinimumPlatforms {

    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int ans = 0, plat = 0;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                plat++;
                i++;
            } else {
                plat--;
                j++;
            }
            ans = Math.max(ans, plat);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep, n));
    }

}
