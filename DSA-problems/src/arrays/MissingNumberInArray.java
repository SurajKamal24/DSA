package arrays;

//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

import java.util.ArrayList;

public class MissingNumberInArray {

    static int missingNumber(int array[], int n) {
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2};
        int N = 3;
        System.out.println(missingNumber(array, N));
    }
}
