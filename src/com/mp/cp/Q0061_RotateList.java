package com.mp.cp;

public class Q0061_RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int size = size(head);
        if (k >= size) {
            k = k % size;
        }
        if (k == 0) {
            return head;
        }
        int n = size - k;
        ListNode headBk = head;
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while (--n > 0) {
            curr = curr.next;
        }
        prev = curr;
        next = curr.next;
        ListNode temp = curr.next;
        while (temp != null) {
            if (temp.next == null) {
                temp.next = head;
                break;
            }
            temp = temp.next;
        }
        prev.next = null;
        return next;
    }

    private int size(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
