package contest.contest1.easy;

//https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/count-triplets-4

import java.util.Scanner;

public class CountTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] != arr[i]) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[k] != arr[j] && arr[k] != arr[i]) {
                            if ((arr[i] + arr[j] > arr[k]) && (arr[j] + arr[k] > arr[i]) && (arr[k] + arr[i] > arr[j])) {
                                count++;
                                //System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                            }
                        }
                    }
                }

            }
        }
        System.out.println(count);
    }
}
