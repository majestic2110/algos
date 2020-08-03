package com.mp.cp.ctci.ch02;

public class Q_03_DeleteNode {
    public void delete(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
