package linkedList.easy;
//https://leetcode.com/problems/palindrome-linked-list/
class PListNode {
    int val;
    PListNode next;
    PListNode() {}
    PListNode(int val) { this.val = val; }
    PListNode(int val, PListNode next) { this.val = val; this.next = next; }
}
public class PalindromeLinkedList {
    public boolean isPalindrome(PListNode head) {
        PListNode fast = head;
        PListNode slow = head;
        PListNode prev = null;
        PListNode curr = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            PListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        head = prev;
        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList obj = new PalindromeLinkedList();
        PListNode head = new PListNode(1);
        head.next = new PListNode(2);
        head.next.next = new PListNode(2);
        head.next.next.next = new PListNode(1);
        System.out.println(obj.isPalindrome(head));
    }
}
