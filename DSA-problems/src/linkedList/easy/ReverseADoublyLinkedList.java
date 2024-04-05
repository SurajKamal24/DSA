package linkedList.easy;
//https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseADoublyLinkedList {
    public static Node reverseDLL(Node  head)
    {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            if (prev != null) {
                prev.prev = curr;
            }
            prev = curr;
            curr = next;
        }
        if (prev != null) {
            prev.prev = null;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;
        Node result = reverseDLL(head);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
