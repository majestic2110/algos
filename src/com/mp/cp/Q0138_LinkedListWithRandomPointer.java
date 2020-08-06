package com.mp.cp;

import java.util.HashMap;
import java.util.Map;

public class Q0138_LinkedListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            Node node = map.get(curr);
            node.random = curr.random != null ? map.get(curr.random) : null;
            node.next = map.get(curr.next);
            curr = curr.next;
        }
        return map.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
