package io.doubleu0714.handson.remove_outermost_parentheses;

import java.util.Arrays;

public class Solution {
    public String removeOuterParentheses(String S) {
        int primitiveCount = 0;
        StringBuilder returnValue = new StringBuilder();
        char[] sArr = S.toCharArray();
        // for(int i = 0 ; i < S.length() ; i++) {
        for(int i = 0 ; i < sArr.length ; i++) {
            // if(40 == S.charAt(i)) {
            if(40 == sArr[i]) {
                primitiveCount++;
            } else {
                primitiveCount--;
            }

            if(primitiveCount == 0) {
                Arrays.copyOfRange(sArr, 1, i);
                // returnValue.append(S.substring(1, i));
                returnValue.append(Arrays.copyOfRange(sArr, 1, i));
                // S = S.substring(i + 1);
                sArr = Arrays.copyOfRange(sArr, i + 1, sArr.length);
                i = -1;
            }
        }

        return returnValue.toString();
    }
}