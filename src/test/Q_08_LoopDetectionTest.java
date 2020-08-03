package test;

import com.mp.cp.ctci.ch02.Node;
import com.mp.cp.ctci.ch02.Q_08_LoopDetection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_08_LoopDetectionTest {
    @Test
    public void testCaseI() {
        Q_08_LoopDetection test = new Q_08_LoopDetection();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(8);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = head.next.next.next;
        assertTrue(test.hasCycle(head));
        assertTrue(test.loopStart(head) == head.next.next.next);
    }

    @Test
    public void testCaseII() {
        Q_08_LoopDetection test = new Q_08_LoopDetection();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(8);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        assertFalse(test.hasCycle(head));
        assertTrue(test.loopStart(head) == null);
    }
}
