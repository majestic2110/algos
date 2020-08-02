package com.mp.cp.ctci.ch02;

import java.util.HashSet;
import java.util.Set;

public class Q_01_RemoveDuplicate {
    public void removeDuplicate(Node head) {
        Node curr = head;
        Set<Integer> set = new HashSet<>();
        Node prev = null;
        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = curr.next;
            } else {
                prev = curr;
                set.add(curr.val);
            }
            curr = curr.next;
        }
    }

    public void removeDuplicateII(Node head) {
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (temp.next != null) {
                if (temp.next.val == curr.val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }
    }

}
