package test;

import com.mp.cp.ctci.ch02.Node;
import com.mp.cp.ctci.ch02.Q_01_RemoveDuplicate;
import org.junit.jupiter.api.Test;

public class Q_01_RemoveDuplicateTest {
    @Test
    public void testCaseI() {
        Q_01_RemoveDuplicate test = new Q_01_RemoveDuplicate();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next = new Node(2);
        System.out.println(head.display());
        test.removeDuplicateII(head);
        System.out.println(head.display());
    }
}
