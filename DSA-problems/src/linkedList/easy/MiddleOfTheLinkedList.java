package linkedList.easy;
//https://leetcode.com/problems/middle-of-the-linked-list/description/

class MListNode {
    int val;
    MListNode next;
    MListNode() {}
    MListNode(int val) { this.val = val; }
    MListNode(int val, MListNode next) { this.val = val; this.next = next; }
}

public class MiddleOfTheLinkedList {
    public MListNode middleNode(MListNode head) {
        //Approach 1
        /*int len = 0;
        MListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        int halfLen = len / 2;
        curr = head;
        while (halfLen-- != 0) {
            curr = curr.next;
        }
        return curr;*/
        //Approach 2
        MListNode slow = head;
        MListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MListNode head = new MListNode(1);
        head.next = new MListNode(2);
        head.next.next = new MListNode(3);
        head.next.next.next = new MListNode(4);
        head.next.next.next.next = new MListNode(5);
        head.next.next.next.next.next = new MListNode(6);
        MiddleOfTheLinkedList obj = new MiddleOfTheLinkedList();
        MListNode middle = obj.middleNode(head);
        System.out.println(middle.val);
    }
}
