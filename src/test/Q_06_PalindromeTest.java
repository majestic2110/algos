package test;

import com.mp.cp.ctci.ch02.Node;
import com.mp.cp.ctci.ch02.Q_06_Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_06_PalindromeTest {
    @Test
    public void testCaseI() {
        Q_06_Palindrome test = new Q_06_Palindrome();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        assertTrue(test.isPalindrome(head));
    }

    @Test
    public void testCaseII() {
        Q_06_Palindrome test = new Q_06_Palindrome();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        assertTrue(test.isPalindrome(head));
    }

    @Test
    public void testCaseIII() {
        Q_06_Palindrome test = new Q_06_Palindrome();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        assertFalse(test.isPalindrome(head));
    }

    @Test
    public void testCaseIV() {
        Q_06_Palindrome test = new Q_06_Palindrome();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(8);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        assertFalse(test.isPalindrome(head));
    }
}
