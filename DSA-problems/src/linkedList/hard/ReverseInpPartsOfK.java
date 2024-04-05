package linkedList.hard;
//https://leetcode.com/problems/reverse-nodes-in-k-group/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseInpPartsOfK {
    public void reverse(ListNode s, ListNode e) {
        ListNode prev = null, curr = s;
        while (curr != e) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) {
            return head;
        }
        ListNode s = head;
        ListNode e = head;
        int jumps = k - 1;
        while (jumps-- != 0) {
            e = e.next;
            if (e == null) {
                return head;
            }
        }
        ListNode headRem = reverseKGroup(e.next, k);
        reverse(s, e);
        s.next = headRem;
        return e;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        ReverseInpPartsOfK obj = new ReverseInpPartsOfK();
        ListNode headRev = obj.reverseKGroup(head, 3);
        ListNode curr = headRev;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
