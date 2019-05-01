package io.doubleu0714.handson.odd_occurrences_in_array;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i = 0 ; i < A.length - 1 ; i++) {
            if(A[i] != A[i + 1]) return A[i];
            else i++;
        }
        return A[A.length - 1];
    }
}