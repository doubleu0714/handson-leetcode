package io.doubleu0714.handson.binary_gap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void solutionTest() {
        Solution sol = new Solution();

        int value = sol.solution(529);
        assertEquals(4, value);
        
        assertEquals(0, sol.solution(32));
        assertEquals(0, sol.solution(2_147_483_647));
    }
}