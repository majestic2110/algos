package com.mp.cp.ctci.ch02;

public class Q_06_Palindrome {
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node first = null;
        Node fast = slow;
        int size = head.size();
        while (fast != null && fast.next != null) {
            Node temp = new Node(slow.val);
            slow = slow.next;
            fast = fast.next.next;
            temp.next = first;
            first = temp;
        }
        if (size % 2 == 1) {
            slow = slow.next;
        }
        while (slow != null || first != null) {
            if (slow != null && first == null) {
                return false;
            }
            if (slow == null && first != null) {
                return false;
            }
            if (slow.val != first.val) {
                return false;
            }
            slow = slow.next;
            first = first.next;
        }
        return true;
    }
}
