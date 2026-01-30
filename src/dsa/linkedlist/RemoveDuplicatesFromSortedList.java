package dsa.linkedlist;

public class RemoveDuplicatesFromSortedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode temp = curr;

        while (curr != null) {
            if (temp.val < curr.val) {
                temp.next = curr;
                temp = curr;
            }
            curr = curr.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 =
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(3)))));

        ListNode result1 = deleteDuplicates(head1);
        printList(result1);

        ListNode head2 =
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(1)));

        ListNode result2 = deleteDuplicates(head2);
        printList(result2);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

