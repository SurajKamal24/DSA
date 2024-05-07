package leetcodedaily;

import java.util.Collection;
import java.util.Collections;

public class RemoveNodesFromLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode tempPrev = dummyHead;
        curr = prev;
        while (curr != null) {
            if (curr.val >= tempPrev.val) {
                tempPrev.next = curr;
                tempPrev = curr;
            }
            curr = curr.next;
        }
        tempPrev.next = null;
        ListNode newPrev = null, newCurr = dummyHead.next;
        while (newCurr != null) {
            ListNode next = newCurr.next;
            newCurr.next = newPrev;
            newPrev = newCurr;
            newCurr = next;
        }
        return newPrev;
    }
    public static void main(String[] args) {
        RemoveNodesFromLinkedList r = new RemoveNodesFromLinkedList();
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);
        ListNode result = r.removeNodes(head);

    }
}
