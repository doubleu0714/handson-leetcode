package io.doubleu0714.handson.to_lower_case;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void toLowerCaseTest1() {
        String testCase = "Hello";
        String expectedValue = "hello";
        String actual = toLowerCase(testCase);
        assertEquals(expectedValue, actual);
    }

    @Test
    public void toLowerCaseTest2() {
        String testCase = "here";
        String expectedValue = "here";
        String actual = toLowerCase(testCase);
        assertEquals(expectedValue, actual);
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}