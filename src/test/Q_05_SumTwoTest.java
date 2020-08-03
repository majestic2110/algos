package test;

import com.mp.cp.ctci.ch02.Node;
import com.mp.cp.ctci.ch02.Q_05_SumTwo;
import org.junit.jupiter.api.Test;

public class Q_05_SumTwoTest {
    @Test
    public void testCaseI() {
        Q_05_SumTwo test = new Q_05_SumTwo();
        Node head = new Node(7);
        head.next = new Node(1);
        head.next.next = new Node(6);
        Node head2 = new Node(5);
        head2.next = new Node(9);
        head2.next.next = new Node(2);
        System.out.println(head.display());
        System.out.println(head2.display());
        Node newHead = test.sum(head, head2);
        System.out.println(newHead.display());
    }

    @Test
    public void testCaseII() {
        Q_05_SumTwo test = new Q_05_SumTwo();
        Node head = new Node(7);
        head.next = new Node(1);
        head.next.next = new Node(6);
        Node head2 = new Node(2);
        head2.next = new Node(5);
        head2.next.next = new Node(9);
        head2.next.next.next = new Node(2);
        System.out.println(head.display());
        System.out.println(head2.display());
        Node newHead = test.sumII(head, head2);
        System.out.println(newHead.display());
    }
}
