package com.mp.cp.ctci.ch02;

public class Q_05_SumTwo {
    public Node sum(Node head1, Node head2) {
        Node l3 = new Node(0);
        Node l3MV = l3;
        int carry = 0;
        while (head1 != null || head2 != null) {
            int sum = (head1 != null ? head1.val : 0) + (head2 != null ? head2.val : 0) + carry;
            carry = sum / 10;
            l3MV.next = new Node(sum % 10);
            if (head1 != null)
                head1 = head1.next;
            if (head2 != null)
                head2 = head2.next;
            l3MV = l3MV.next;
        }
        if (carry > 0) {
            l3MV.next = new Node(carry);
        }
        return l3.next;
    }

    public Node sumII(Node head1, Node head2) {
        int size1 = size(head1);
        int size2 = size(head2);
        if (size1 > size2) {
            head2 = padWithZero(head2, size1 - size2);
        } else if (size1 < size2) {
            head1 = padWithZero(head1, size2 - size1);
        }
        Node[] nodes = summ(head1, head2);
        if (nodes[1].val > 0) {
            nodes[1].next = nodes[0];
            return nodes[1];
        } else {
            return nodes[0];
        }
    }

    private Node[] summ(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return new Node[]{null, new Node(0)};
        } else {
            Node[] head3 = summ(head1.next, head2.next);
            int sum = head1.val + head2.val + head3[1].val;
            int carry = sum / 10;
            Node temp = new Node(sum % 10);
            temp.next = head3[0];
            Node carryNode = new Node(carry);
            return new Node[]{temp, carryNode};
        }
    }

    private Node padWithZero(Node head, int count) {
        Node temp = new Node(0);
        Node tempMV = temp;
        while (count > 0) {
            tempMV.next = new Node(0);
            tempMV = tempMV.next;
            count--;
        }
        tempMV.next = head;
        return temp.next;
    }

    private int size(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
