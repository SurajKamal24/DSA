package leetcodedaily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        int[] res = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (map.get(arr2[i]) > 0) {
                res[index++] = arr2[i];
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }
        int[] remaining = new int[arr1.length - index];
        int resIndex = index;
        index = 0;
        for (int j : arr1) {
            if (map.containsKey(j)) {
                while (map.get(j) > 0) {
                    remaining[index] = j;
                    index++;
                    map.put(j, map.get(j) - 1);
                }
            }
        }
        Arrays.sort(remaining);
        for (int i = 0; i < remaining.length; i++) {
            res[resIndex++] = remaining[i];
        }
        return res;
    }
    public static void main(String[] args) {
        for (int i : new RelativeSortArray().relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6})) {
            System.out.print(i + " ");
        }
    }
}
