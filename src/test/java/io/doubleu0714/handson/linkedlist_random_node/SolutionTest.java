package io.doubleu0714.handson.linkedlist_random_node;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;

public class SolutionTest {
    @Test
    public void 랜덤노드의_값선택() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution sol = new Solution(head);
        assertThat(sol.getRandom(), anyOf(is(1), is(2), is(3), is(4), is(5)));
    }
    @Test
    public void 랜덤테스트() {
        Random r = new Random();
        int val = r.nextInt(10) + 1;
        System.out.println(val);
        val = r.nextInt(10) + 1;
        System.out.println(val);
        val = r.nextInt(10) + 1;
        System.out.println(val);
        val = r.nextInt(10) + 1;
        System.out.println(val);
    }

    @Test
    public void 노드사이즈구하기() {
        ListNode head = new ListNode(1);
        Solution sol = new Solution(head);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        assertThat(3, is(sol.getNodeSize(head)));

        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        assertThat(5, is(sol.getNodeSize(head)));
    }
}