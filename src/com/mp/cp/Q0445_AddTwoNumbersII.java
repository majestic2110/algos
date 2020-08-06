package com.mp.cp;

public class Q0445_AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size1 = size(l1);
        int size2 = size(l2);
        if (size1 > size2) {
            l2 = padWithZero(l2, size1 - size2);
        } else if (size1 < size2) {
            l1 = padWithZero(l1, size2 - size1);
        }
        Sum sum = sum(l1, l2);
        if (sum.carry > 0) {
            ListNode temp = new ListNode(sum.carry);
            temp.next = sum.node;
            return temp;
        } else {
            return sum.node;
        }
    }

    private Sum sum(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return new Sum(null, 0);
        } else {
            Sum l3 = sum(l1.next, l2.next);
            int sum = l1.val + l2.val + l3.carry;
            ListNode temp = new ListNode(sum % 10);
            temp.next = l3.node;
            int carry = sum / 10;
            return new Sum(temp, carry);
        }
    }

    private ListNode padWithZero(ListNode head, int count) {
        ListNode temp = new ListNode(0);
        ListNode tempMV = temp;
        while (count > 0) {
            tempMV.next = new ListNode(0);
            tempMV = tempMV.next;
            count--;
        }
        tempMV.next = head;
        return temp.next;
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

    class Sum {
        ListNode node;
        int carry;

        public Sum(ListNode node, int carry) {
            this.node = node;
            this.carry = carry;
        }
    }
}
