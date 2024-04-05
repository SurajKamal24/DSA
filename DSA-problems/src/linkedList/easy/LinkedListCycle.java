package linkedList.easy;
//https://leetcode.com/problems/linked-list-cycle/description/
class CListNode {
    int val;
    CListNode next;
    CListNode(int x) {
        val = x;
         next = null;
    }
}
public class LinkedListCycle {
    public boolean hasCycle(CListNode head) {
        CListNode slow = head;
        CListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CListNode head = new CListNode(3);
        head.next = new CListNode(2);
        head.next.next = new CListNode(0);
        head.next.next.next = new CListNode(-4);
        head.next.next.next.next = head.next;
        LinkedListCycle obj = new LinkedListCycle();
        System.out.println(obj.hasCycle(head));
    }
}
