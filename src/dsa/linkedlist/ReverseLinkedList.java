package dsa.linkedlist;

public class ReverseLinkedList {
    /*
   null --> 9 --> 5 --> 3--> null
   null --> 3 --> 5 --> 9--> null

     */

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

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // head = 1
        // 5 , 5.4 , 5.4.3,
        ListNode newHead = reverseList(head.next);
        // nh = 5.4.3.2
        head.next.next = head;
        //1.2.next = 1
        //5.4.3.2.1
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))));

        ListNode res = reverseList(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
