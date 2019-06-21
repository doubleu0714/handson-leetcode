package io.doubleu0714.handson.linkedlist_random_node;

import java.util.Objects;
import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private ListNode head;
    private int nodeSize;
    private Random random;
    
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        Objects.requireNonNull(head);
        this.head = head;
        nodeSize = getNodeSize(head);
        random = new Random();
    }

    public int getNodeSize(ListNode node) {
        int nodeSize = 1;
        ListNode tmpNode = node;

        while(tmpNode.next != null) {
            nodeSize++;
            tmpNode = tmpNode.next;
        }
        return nodeSize;
    }

    public int getRandomNumber() {
        return random.nextInt(nodeSize) + 1;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int randomNode = getRandomNumber();
        ListNode tmpNode = head;
        int nodeSeq = 1;
        while(nodeSeq < randomNode) {
            tmpNode = tmpNode.next;
            nodeSeq++;
        }
        return tmpNode.val;
    }
    
}