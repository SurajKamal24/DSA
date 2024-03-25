package sorting.easy;

//https://www.codechef.com/problems/QUALPREL

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QualifyingToPreElimination {

    public static int numTeams(Integer arr[], int k) {
        Arrays.sort(arr, Collections.reverseOrder());
        int count = 0;
        for (int num : arr) {
            if (num >= arr[k-1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer arr[] = new Integer[n];

            for(int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();

            System.out.println(numTeams(arr, k));

            tests--;
        }

    }


}
