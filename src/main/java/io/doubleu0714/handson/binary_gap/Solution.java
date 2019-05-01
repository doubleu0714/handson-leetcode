package io.doubleu0714.handson.binary_gap;

public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N); 
        String[] gaps = binary.split("1");

        if(binary.endsWith("0")) {
            gaps[gaps.length - 1] = ""; 
        }

        int maxGap = 0;
        for(String gap : gaps) {
            maxGap = maxGap > gap.length() ? maxGap : gap.length();
        }

        return maxGap;
    }
}