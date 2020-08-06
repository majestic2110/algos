package com.mp.cp;

public class Q0002_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l3MV = l3;
        int carry = 0;
        ListNode head1 = l1;
        ListNode head2 = l2;
        while (head1 != null || head2 != null) {
            int sum = (head1 != null ? head1.val : 0) + (head2 != null ? head2.val : 0) + carry;
            carry = sum / 10;
            l3MV.next = new ListNode(sum % 10);
            if (head1 != null)
                head1 = head1.next;
            if (head2 != null)
                head2 = head2.next;
            l3MV = l3MV.next;
        }
        if (carry > 0) {
            l3MV.next = new ListNode(carry);
        }
        return l3.next;
    }
}
