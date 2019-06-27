package io.doubleu0714.handson.additive_number;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void given테스트한자리숫자() {
        Solution sol = new Solution();

        assertThat(sol.isAdditiveNumber("112358"), is(true));
    }
}