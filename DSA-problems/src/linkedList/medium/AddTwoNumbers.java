package linkedList.medium;
//https://leetcode.com/problems/add-two-numbers/description/
class AListNode {
    int val;
    AListNode next;
    AListNode() {}
    AListNode(int val) { this.val = val; }
    AListNode(int val, AListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {
    public AListNode addTwoNumbers(AListNode l1, AListNode l2) {
        AListNode dummyHead = new AListNode(0);
        AListNode tail = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            AListNode newNode = new AListNode(digit);
            tail.next = newNode;
            tail = newNode;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AListNode l1 = new AListNode(2);
        l1.next = new AListNode(4);
        l1.next.next = new AListNode(3);
        AListNode l2 = new AListNode(5);
        l2.next = new AListNode(6);
        l2.next.next = new AListNode(4);
        AListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
