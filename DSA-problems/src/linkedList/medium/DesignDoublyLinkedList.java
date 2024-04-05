package linkedList.medium;
//https://leetcode.com/problems/design-linked-list/description/
class DNode {
    int val;
    DNode prev;
    DNode next;
    public DNode(int val, DNode prev, DNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

class DMyLinkedList {
    DNode head;
    int length;

    DNode getNode(int index) {
        DNode DNode = head;
        for (int i = 0; i < index; i++) {
            DNode = DNode.next;
        }
        return DNode;
    }

    public DMyLinkedList() {
        head = null;
        length = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        DNode cur = getNode(index);
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(length, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        if (index <= 0) {
            DNode newHead = new DNode(val, null, head);
            head = newHead;
            if (head.next != null) {
                head.next.prev = head;
            }
        } else {
            DNode prevDNode = getNode(index - 1);
            DNode nextDNode = prevDNode.next;
            DNode newDNode = new DNode(val, prevDNode, nextDNode);
            prevDNode.next = newDNode;
            if (newDNode.next != null) {
                newDNode.next.prev = newDNode;
            }
        }
        length += 1;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            DNode prevDNode = getNode(index - 1);
            DNode nextDNode = prevDNode.next.next;
            prevDNode.next = nextDNode;
            if (nextDNode != null) {
                nextDNode.prev = prevDNode;
            }
        }
        length -= 1;
    }
}
public class DesignDoublyLinkedList {
}
