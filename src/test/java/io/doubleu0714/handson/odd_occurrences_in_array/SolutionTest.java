package io.doubleu0714.handson.odd_occurrences_in_array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void solutionTest() {
        Solution sol = new Solution();
        assertEquals(7, sol.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}