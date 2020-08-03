package test;

import com.mp.cp.ctci.ch02.Node;
import com.mp.cp.ctci.ch02.Q_02_KthToLast;
import org.junit.jupiter.api.Test;

public class Q_02_KthToLastTest {
    @Test
    public void testCaseI() {
        Q_02_KthToLast test = new Q_02_KthToLast();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next = new Node(2);
        System.out.println(test.kthToLast(head, 2));
    }
}
