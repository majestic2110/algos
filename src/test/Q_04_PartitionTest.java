package test;

import com.mp.cp.ctci.ch02.Node;
import com.mp.cp.ctci.ch02.Q_04_Partition;
import org.junit.jupiter.api.Test;

public class Q_04_PartitionTest {
    @Test
    public void testCaseI() {
        Q_04_Partition test = new Q_04_Partition();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next = new Node(2);
        System.out.println(head.display());
        Node newHead = test.partition(head, 5);
        System.out.println(newHead.display());
    }

    @Test
    public void testCaseII() {
        Q_04_Partition test = new Q_04_Partition();
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);
        System.out.println(head.display());
        Node newHead = test.partition(head, 5);
        System.out.println(newHead.display());
    }
}
