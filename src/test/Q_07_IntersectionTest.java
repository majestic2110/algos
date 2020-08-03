package test;

import com.mp.cp.ctci.ch02.Node;
import com.mp.cp.ctci.ch02.Q_07_Intersection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_07_IntersectionTest {
    @Test
    public void testCaseI() {
        Q_07_Intersection test = new Q_07_Intersection();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(8);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        Node head2 = new Node(5);
        head2.next = new Node(4);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(6);
        head2.next.next.next.next = head.next.next.next.next.next;
        assertTrue(test.intersection(head, head2));
    }

    @Test
    public void testCaseII() {
        Q_07_Intersection test = new Q_07_Intersection();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(8);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        Node head2 = new Node(5);
        head2.next = new Node(4);
        head2.next.next = new Node(8);
        assertFalse(test.intersection(head, head2));
    }
}
