package com.mp.cp;

public class Q0086_PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode second = new ListNode(0);
        ListNode secondMV = second;
        ListNode headBk = new ListNode(0);
        headBk.next = head;
        ListNode curr = head;
        ListNode prev = headBk;
        while (curr != null) {
            if (curr.val < x) {
                prev = curr;
            } else {
                ListNode temp = curr;
                prev.next = curr.next;
                secondMV.next = temp;
                secondMV = secondMV.next;
            }
            curr = curr.next;
        }
        secondMV.next = null;
        prev.next = second.next;
        return headBk.next;
    }
}
