package io.doubleu0714.handson.remove_outermost_parentheses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution solution = new Solution();
        String returnValue = solution.removeOuterParentheses("(()())(())(()(()))");
        assertEquals("()()()()(())", returnValue);
    }
}