package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        List<Integer> criticalPoints = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        int position = 1;
        while (curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                    (curr.val < prev.val && curr.val < curr.next.val)) {
                criticalPoints.add(position);
            }
            prev = curr;
            curr = curr.next;
            position++;
        }
        if (criticalPoints.size() < 2) {
            return new int[]{-1, -1};
        }
        int maxDistance = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < criticalPoints.size(); i++) {
            minDistance = Math.min(minDistance, criticalPoints.get(i) - criticalPoints.get(i - 1));
        }
        return new int[]{minDistance, maxDistance};
    }
    public static void main(String[] args) {
        FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints = new FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints();
        ListNode head = findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.new ListNode(5);
        head.next = findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.new ListNode(3);
        head.next.next = findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.new ListNode(1);
        head.next.next.next = findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.new ListNode(2);
        head.next.next.next.next = findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.new ListNode(5);
        head.next.next.next.next.next = findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.new ListNode(1);
        head.next.next.next.next.next.next = findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.new ListNode(2);
        int[] result = findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.nodesBetweenCriticalPoints(head);
        System.out.println("Minimum number of nodes between critical points: " + result[0]);
        System.out.println("Maximum number of nodes between critical points: " + result[1]);
    }
}
