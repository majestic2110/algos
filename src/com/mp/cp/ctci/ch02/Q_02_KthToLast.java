package com.mp.cp.ctci.ch02;

public class Q_02_KthToLast {
    public int kthToLast(Node head, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException();
        }
        Node first = head;
        while (k > 0) {
            if (first == null) {
                throw new IllegalArgumentException();
            }
            first = first.next;
            k--;
        }
        Node second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.val;
    }
}
