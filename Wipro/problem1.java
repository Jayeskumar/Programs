package Wipro;

public class problem1 {
    /*Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false */
static boolean isShift(String s, String goal) {
    if(s.length() !=goal.length())
    return false;
    int i=0;
    while(i<s.length()){
        if(s.charAt(i)!=goal.charAt(i))
        break;
        i++;
        
    }
}
    
}
