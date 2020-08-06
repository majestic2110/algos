package com.mp.cp;

public class Q0206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode revMV = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = revMV;
            revMV = temp;
            head = head.next;
        }
        return revMV;
    }
}
