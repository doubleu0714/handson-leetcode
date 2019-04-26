package io.doubleu0714.handson.remove_outermost_parentheses;

public class Solution {
    public String removeOuterParentheses(String S) {
        int primitiveCount = 0;
        StringBuilder returnValue = new StringBuilder();
        for(int i = 0 ; i < S.length() ; i++) {
            if(40 == S.charAt(i)) {
                primitiveCount++;
            } else {
                primitiveCount--;
            }

            if(primitiveCount == 0) {
                returnValue.append(S.substring(1, i));
                S = S.substring(i + 1);
                i = -1;
            }
        }

        return returnValue.toString();
    }
}