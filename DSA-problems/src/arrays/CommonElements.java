package arrays;

//https://www.geeksforgeeks.org/problems/common-elements1132/1

import java.util.ArrayList;

public class CommonElements {

    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i = 0, j = 0,  k = 0;
        int last = Integer.MIN_VALUE;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && A[i] == C[k] && A[i] != last) {
                res.add(A[i]);
                last = A[i];
                i++;
                j++;
                k++;
            } else if (Math.min(A[i], Math.min(B[j], C[k])) == A[i]) {
                i++;
            } else if (Math.min(A[i], Math.min(B[j], C[k])) == B[j]) {
                j++;
            } else {
                k++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n1 = 3, n2 = 3, n3 = 3;
        int[] A = {3, 3, 3};
        int[] B = {3, 3, 3};
        int[] C = {3, 3, 3};
        System.out.println(commonElements(A, B, C, n1, n2, n3));
    }

}
