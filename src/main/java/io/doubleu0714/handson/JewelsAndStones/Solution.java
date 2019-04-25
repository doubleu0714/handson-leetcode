package io.doubleu0714.handson.JewelsAndStones;


public class Solution {

    public int numJewelsInStones(String J, String S) {
        int[] jBucket = new int[58];

        for (char j : J.toCharArray()) {
            jBucket[j - 65] = 1;
        }

        int returnValue = 0;
        for(char s : S.toCharArray()) {
            if(jBucket[s - 65] == 1) {
                returnValue++;
            }
        }

        return returnValue;
    }

}