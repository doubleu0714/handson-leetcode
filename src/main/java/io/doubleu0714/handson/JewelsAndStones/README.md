# Problem
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

**Example 1:**

>Input: J = "aA", S = "aAAbbbb"  
>Output: 3  

**Example 2:**

>Input: J = "z", S = "ZZ"  
>Output: 0  

Note:
* S and J will consist of letters and have length at most 50.
* The characters in J are distinct.
# Solve
bucket 배열을 생성한다 아스키 코드 값으로 알파벳은 65부터 시작하며 대문자 소문자 코드값 중간에 6개의 특수문자가 있으므로 길이를 58로 설정한다.  
입력값 문자열 J를 char 배열로 변환 후 0 인덱스부터 시작하도록 65를 빼고 해당 인덱스의 bucket배열에 1로 표시해 놓는다. 이후 S문자열의 char배열을 loop돌면서 해당 인덱스에 값이 1이면 count값을 증가 시킨다.