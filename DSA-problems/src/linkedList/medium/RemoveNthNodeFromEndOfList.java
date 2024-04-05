package linkedList.medium;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
class RListNode {
    int val;
    RListNode next;
    RListNode() {}
    RListNode(int val) { this.val = val; }
    RListNode(int val, RListNode next) { this.val = val; this.next = next; }
 }
public class RemoveNthNodeFromEndOfList {
    public RListNode removeNthFromEnd(RListNode head, int n) {
        RListNode dummy = new RListNode(0);
        dummy.next = head;
        RListNode first = dummy;
        RListNode second = dummy;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        RListNode head = new RListNode(1);
        head.next = new RListNode(2);
        head.next.next = new RListNode(3);
        head.next.next.next = new RListNode(4);
        head.next.next.next.next = new RListNode(5);
        RListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
