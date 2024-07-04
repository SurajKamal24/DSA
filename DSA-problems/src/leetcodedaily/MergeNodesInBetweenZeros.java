package leetcodedaily;

public class MergeNodesInBetweenZeros {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeNodes(ListNode head) {
        ListNode modifyPointer = head.next;
        ListNode traversalPointer = modifyPointer;
        while (traversalPointer != null) {
            int sum = 0;
            while (traversalPointer.val != 0) {
                sum += traversalPointer.val;
                traversalPointer = traversalPointer.next;
            }
            modifyPointer.val = sum;
            traversalPointer = traversalPointer.next;
            modifyPointer.next = traversalPointer;
            modifyPointer = modifyPointer.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        MergeNodesInBetweenZeros mergeNodesInBetweenZeros = new MergeNodesInBetweenZeros();
        ListNode head = mergeNodesInBetweenZeros.new ListNode(0);
        head.next = mergeNodesInBetweenZeros.new ListNode(3);
        head.next.next = mergeNodesInBetweenZeros.new ListNode(1);
        head.next.next.next = mergeNodesInBetweenZeros.new ListNode(0);
        head.next.next.next.next = mergeNodesInBetweenZeros.new ListNode(4);
        head.next.next.next.next.next = mergeNodesInBetweenZeros.new ListNode(5);
        head.next.next.next.next.next.next = mergeNodesInBetweenZeros.new ListNode(2);
        head.next.next.next.next.next.next.next = mergeNodesInBetweenZeros.new ListNode(0);
        mergeNodesInBetweenZeros.mergeNodes(head);
    }
}
