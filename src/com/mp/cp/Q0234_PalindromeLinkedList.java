package com.mp.cp;

public class Q0234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode first = null;
        ListNode fast = slow;
        int size = size(head);
        while (fast != null && fast.next != null) {
            ListNode temp = new ListNode(slow.val);
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
