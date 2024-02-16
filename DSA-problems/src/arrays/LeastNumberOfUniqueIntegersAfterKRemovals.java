package arrays;

//https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/description/?envType=daily-question&envId=2024-02-16

import java.util.*;

public class LeastNumberOfUniqueIntegersAfterKRemovals {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }
        int i = 0;
        while (k-- != 0) {
            int[] currMin = pq.poll();
            if (currMin[1] > 1) {
                currMin[1]--;
                pq.add(currMin);
            }
        }
        return pq.size();
        /*Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> counterList = new ArrayList<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }
        for (int num : freqMap.values()) {
            counterList.add(num);
        }
        Collections.sort(counterList);
        int i = 0;
        while (k-- != 0) {
            int curr = counterList.get(i);
            if (curr > 1) {
                counterList.set(i, curr -= 1);
            } else {
                counterList.remove(i);
            }
        }
        return counterList.size();*/
    }

    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }

}
