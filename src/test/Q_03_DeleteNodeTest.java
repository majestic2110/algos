package test;

import com.mp.cp.ctci.ch02.Node;
import com.mp.cp.ctci.ch02.Q_03_DeleteNode;
import org.junit.jupiter.api.Test;

public class Q_03_DeleteNodeTest {
    @Test
    public void testCaseI() {
        Q_03_DeleteNode test = new Q_03_DeleteNode();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next = new Node(2);
        System.out.println(head.display());
        test.delete(head.next.next.next);
        System.out.println(head.display());
    }
}
