package com.mp.cp;

public class Q0019_RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headBk = new ListNode(0);
        headBk.next = head;
        ListNode mv = head;
        ListNode slow = headBk;
        ListNode fast = headBk;
        while (n-- > 0) {
            slow = slow.next;
        }
        ListNode prev = null;
        while (slow != null) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = fast.next;
        return headBk.next;
    }
}
