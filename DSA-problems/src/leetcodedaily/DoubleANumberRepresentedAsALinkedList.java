package leetcodedaily;

public class DoubleANumberRepresentedAsALinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
 }
    public ListNode doubleIt(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr = prev;
        int carry = 0;
        while (curr != null) {
            int val = curr.val;
            curr.val = (val * 2 + carry) % 10;
            carry = (val * 2) / 10;
            curr = curr.next;
        }
        curr = prev;
        prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if (carry > 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = prev;
            prev = newHead;
        }
        return prev;
    }
    public static void main(String[] args) {
        DoubleANumberRepresentedAsALinkedList d = new DoubleANumberRepresentedAsALinkedList();
        ListNode head = d.new ListNode(3);
        //head.next = d.new ListNode(8);
        //head.next.next = d.new ListNode(9);
        //head.next.next.next = d.new ListNode(4);
        //head.next.next.next.next = d.new ListNode(5);
        ListNode result = d.doubleIt(head);
    }
}
