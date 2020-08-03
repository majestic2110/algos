package com.mp.cp.ctci.ch02;

public class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public String display() {
        Node temp = this;
        StringBuffer buff = new StringBuffer();
        while (temp != null) {
            buff.append(temp.val + " -> ");
            temp = temp.next;
        }
        buff.append("null");
        return buff.toString();
    }

    public int size() {
        int size = 0;
        Node temp = this;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}