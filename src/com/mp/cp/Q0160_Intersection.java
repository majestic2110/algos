package com.mp.cp;

public class Q0160_Intersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        ListNode prevA = null;
        ListNode prevB = null;
        ListNode lastA = null;
        ListNode lastB = null;
        while (ptrA != ptrB) {
            ListNode tempA = ptrA;
            ptrA = ptrA.next;
            if (ptrA == null) {
                ptrA = headB;
                lastA = tempA;
            }
            ListNode tempB = ptrB;
            ptrB = ptrB.next;
            if (ptrB == null) {
                ptrB = headA;
                lastB = tempB;
            }
            if (lastA != null && lastB != null && lastA != lastB) {
                return null;
            }
        }
        return ptrA;
    }
}
