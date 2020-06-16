package com.leetcode.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 
 * 977. Squares of a Sorted Array
 * 
 * Given an array of integers A sorted in non-decreasing order, return an array
 * of the squares of each number, also in sorted non-decreasing order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [-4,-1,0,3,10] Output: [0,1,9,16,100]
 * 
 * Example 2:
 * 
 * Input: [-7,-3,2,3,11] Output: [4,9,9,49,121]
 * 
 * 
 * Note:
 * 
 * 1 <= A.length <= 10000 -10000 <= A[i] <= 10000 A is sorted in non-decreasing
 * order.
 *
 */
public class LeetCodeProblem_977 {

    public int[] sortedSquares(int[] inputArray) {
        return IntStream.of(inputArray).boxed().map(val -> val * val).sorted().mapToInt(i -> i).toArray();
    }

    public int[] sortedSquares1(int[] inputArray) {
        int[] result = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            result[i] = inputArray[i] * inputArray[i];
        }
        Arrays.sort(result);
        return result;
    }

}
