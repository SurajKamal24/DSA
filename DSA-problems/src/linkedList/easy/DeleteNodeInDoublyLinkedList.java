package linkedList.easy;
class DNode
{
    int data;
    DNode next;
    DNode prev;
    DNode(int d)
    {
        data = d;
        next = prev = null;
    }
}
public class DeleteNodeInDoublyLinkedList {
    DNode deleteNode(DNode head,int x)
    {
        int cnt = 1;
        DNode prev = null;
        DNode curr = head;
        if (x == 1) {
            curr.next.prev = null;
            return curr.next;
        }
        while (cnt < x) {
            cnt++;
            curr = curr.next;
        }
        DNode left = curr.prev;
        DNode right = curr.next;
        left.next = right;
        if (right != null) {
            right.prev = left;
        }
        return head;
    }

    public static void main(String[] args) {
        DNode head = new DNode(10);
        head.next = new DNode(20);
        head.next.prev = head;
        head.next.next = new DNode(30);
        head.next.next.prev = head.next;
        head.next.next.next = new DNode(40);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DNode(50);
        head.next.next.next.next.prev = head.next.next.next;
        DeleteNodeInDoublyLinkedList obj = new DeleteNodeInDoublyLinkedList();
        head = obj.deleteNode(head, 3);
        DNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
