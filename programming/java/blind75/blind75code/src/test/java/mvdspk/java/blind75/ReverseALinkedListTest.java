package mvdspk.java.blind75;

import org.junit.Test;

import mvdspk.java.blind75.ReverseALinkedList.ListNode;

public class ReverseALinkedListTest {

    @Test
    public void testRecursiveMethod() {
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();
        printLinkedList(
                reverseALinkedList.usingRecursion(
                        getLinkedList(new int[] { 1, 2, 3 })));
    }

    public ListNode getLinkedList(int[] items) {
        ListNode head = null;
        ListNode previous = null;
        for (int i = 0; i < items.length; i++) {
            ListNode node = new ListNode(items[i]);
            if (head == null) {
                head = node;
            }

            if (previous != null) {
                previous.setnext(node);
            }

            previous = node;
        }

        return head;
    }

    public void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.toString());
            head = head.next;
        }
    }
}
