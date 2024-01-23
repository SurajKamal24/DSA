package arrays;

import java.util.ArrayList;
import java.util.Collections;


public class LeadersInAnArray {

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int current_leader = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] >= current_leader) {
                current_leader = arr[i];
                ans.add(current_leader);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        for (int num : leaders(arr, arr.length)) {
            System.out.print(num + " ");
        }

    }

}
