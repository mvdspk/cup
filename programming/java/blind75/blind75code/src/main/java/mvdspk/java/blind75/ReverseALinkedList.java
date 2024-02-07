package mvdspk.java.blind75;

public class ReverseALinkedList {
    public ListNode usingRecursion(ListNode node) {
        return flip(null, node);
    }

    private ListNode flip(ListNode previous, ListNode node) {
        if (node == null)
            return previous;

        ListNode next = node.next;
        node.next = previous;

        return flip(node, next);
    }

    public static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public void setnext(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return this.next != null ? value + " -> " : value + " -> NULL";
        }
    }
}
