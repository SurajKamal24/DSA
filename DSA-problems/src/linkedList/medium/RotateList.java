package linkedList.medium;
//https://leetcode.com/problems/rotate-list/description/
class RLListNode {
    int val;
    RLListNode next;
    RLListNode() {}
    RLListNode(int val) { this.val = val; }
    RLListNode(int val, RLListNode next) { this.val = val; this.next = next; }
}
public class RotateList {
    public RLListNode rotateRight(RLListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 0;
        RLListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        int go = len - k - 1;
        RLListNode temp = head;
        for (int i = 0; i < go; i++) {
            temp = temp.next;
        }
        RLListNode start = temp.next;
        temp.next = null;
        temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return start;
    }


    public static void main(String[] args) {
        RLListNode head = new RLListNode(1);
        head.next = new RLListNode(2);
        head.next.next = new RLListNode(3);
        head.next.next.next = new RLListNode(4);
        head.next.next.next.next = new RLListNode(5);
        RotateList rotateList = new RotateList();
        RLListNode result = rotateList.rotateRight(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
