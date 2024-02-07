package strings.medium;

//https://www.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1

import java.util.Arrays;

public class LargestNumberFormedFromAnArray {
    static String printLargest(String[] arr) {
        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] arr = {"3", "30", "34", "5", "9"};
        System.out.println(printLargest(arr));
        System.out.println(Math.pow(10, 0));
    }
}
