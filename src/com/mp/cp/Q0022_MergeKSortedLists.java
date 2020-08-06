package com.mp.cp;

public class Q0022_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(0, lists.length - 1, lists);
    }

    private ListNode merge(int start, int end, ListNode[] lists) {
        if (start >= end) {
            return lists[end];
        }
        int mid = start + (end - start) / 2;
        ListNode left = merge(start, mid, lists);
        ListNode right = merge(mid + 1, end, lists);
        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l3MV = l3;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : Integer.MAX_VALUE;
            int val2 = l2 != null ? l2.val : Integer.MAX_VALUE;
            if (val1 < val2) {
                l3MV.next = l1;
                if (l1 != null) {
                    l1 = l1.next;
                }
            } else {
                l3MV.next = l2;
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            l3MV = l3MV.next;
        }
        return l3.next;
    }
}
