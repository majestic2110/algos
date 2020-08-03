package com.mp.cp.ctci.ch02;

public class Q_07_Intersection {
    public boolean intersection(Node head1, Node head2) {
        Node lastA = null;
        Node lastB = null;
        Node prevA = null;
        Node prevB = null;
        Node ptrA = head1;
        Node ptrB = head2;
        while (ptrA != null && ptrB != null) {
            prevA = ptrA;
            prevB = ptrB;
            ptrA = ptrA.next;
            ptrB = ptrB.next;
            if (ptrA == null) {
                lastA = prevA;
                ptrA = head2;
            }
            if (ptrB == null) {
                lastB = prevB;
                ptrB = head1;
            }
            if (lastA != null && lastB != null) {
                if (lastA == lastB) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
