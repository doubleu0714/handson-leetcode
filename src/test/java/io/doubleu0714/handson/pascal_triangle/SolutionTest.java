package io.doubleu0714.handson.pascal_triangle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void 리스트_조회_테스트() {
        List<Integer> test = new ArrayList<>();
        test.add(0, 1);
        test.add(0, 2);
        test.add(0, 3);
        test.add(0, 4);

        assertEquals(4, (int)test.get(0));
        assertEquals(3, (int)test.get(1));
        assertEquals(2, (int)test.get(2));
        assertEquals(1, (int)test.get(3));
    }
    
    @Test
    public void getRow() {
        Solution solution = new Solution();
        List<Integer> result = solution.getRow(3);
        List<Integer> expected = Arrays.asList(new Integer[]{1, 3, 3, 1});
        assertEquals(expected, result);
    }
}