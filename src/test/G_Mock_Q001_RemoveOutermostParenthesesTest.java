package test;

import com.mp.cp.G_Mock_Q001_RemoveOutermostParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class G_Mock_Q001_RemoveOutermostParenthesesTest {
    @Test
    public void testEmpty() {
        G_Mock_Q001_RemoveOutermostParentheses test = new G_Mock_Q001_RemoveOutermostParentheses();
        assertTrue(test.removeOuterParentheses("").equals(""));
    }

    @Test
    public void test1() {
        G_Mock_Q001_RemoveOutermostParentheses test = new G_Mock_Q001_RemoveOutermostParentheses();
        assertTrue(test.removeOuterParentheses("(()())(())").equals("()()()"));
    }

    @Test
    public void test2() {
        G_Mock_Q001_RemoveOutermostParentheses test = new G_Mock_Q001_RemoveOutermostParentheses();
        assertTrue(test.removeOuterParentheses("(()())(())(()(()))").equals("()()()()(())"));
    }

    @Test
    public void test3() {
        G_Mock_Q001_RemoveOutermostParentheses test = new G_Mock_Q001_RemoveOutermostParentheses();
        assertTrue(test.removeOuterParentheses("()()").equals(""));
    }
}
