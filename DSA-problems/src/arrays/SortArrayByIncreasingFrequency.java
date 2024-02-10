package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> {
            int freqCompare = map.get(n1) - map.get(n2);
            if (freqCompare == 0) {
                return n1 - n2;
            }
            return freqCompare;
        });
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            pq.offer(num);
        }
        int i = 0;
        while (! pq.isEmpty()) {
            int num = pq.poll();
            System.out.println("num : " + num + " freq : " + map.get(num));
            for (int j = 0; j < map.get(num); j++) {
                nums[i] = num;
                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        for (int num : frequencySort(nums)) {
            System.out.print(num + " ");
        }
    }
}
