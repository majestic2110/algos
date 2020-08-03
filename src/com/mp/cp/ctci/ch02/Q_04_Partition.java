package com.mp.cp.ctci.ch02;

public class Q_04_Partition {
    public Node partition(Node head, int x) {
        Node currHead = new Node(0);
        Node currMV = currHead;
        currMV.next = head;
        Node prevMV = currMV;
        Node secondHead = new Node(0);
        Node secondMV = secondHead;
        while (currMV != null) {
            if (currMV.val < x) {
                prevMV = currMV;
            } else {
                secondMV.next = currMV;
                secondMV = secondMV.next;
                prevMV.next = currMV.next;
            }
            currMV = currMV.next;
        }
        secondMV.next = null;
        prevMV.next = secondHead.next;
        return currHead.next;
    }
}
