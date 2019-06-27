package io.doubleu0714.handson.additive_number;

public class Solution {
    public boolean isAdditiveNumber(String num) {
        char[] charArrs = num.toCharArray();
        int firstNum = Character.getNumericValue(charArrs[0]);
        int secondNum = Character.getNumericValue(charArrs[1]);

        int sum = firstNum + secondNum;
        System.out.println("firstNum : " + firstNum + ", secondNum : " + secondNum + ", sum : " + sum);
        for(int i = 2 ; i < charArrs.length ; i++) {
            int nextNum = Character.getNumericValue(charArrs[i]);
            System.out.println("sum : " + sum + ", nextNum : " + nextNum);
            if(sum != nextNum) return false;

            sum = nextNum + Character.getNumericValue(charArrs[i - 1]);
        }
        return true;
    }
}