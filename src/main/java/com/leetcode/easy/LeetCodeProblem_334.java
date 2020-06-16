package com.leetcode.easy;

/**
 * 
 * 344. Reverse String
 * 
 * Write a function that reverses a string. The input string is given as an
 * array of characters char[].
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * You may assume all the characters consist of printable ascii characters.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: ["h","e","l","l","o"] Output: ["o","l","l","e","h"]
 * 
 * Example 2:
 * 
 * Input: ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
 *
 */
public class LeetCodeProblem_334 {

    public void reverseString(char[] inputArray) {
        for (int i = 0; i < inputArray.length / 2; i++) {
            char temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = temp;
        }
    }

}
