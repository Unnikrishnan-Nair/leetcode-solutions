package com.leetcode.easy;

import static com.leetcode.common.TestUtils.getInputLinkedList;
import static com.leetcode.common.TestUtils.getOutputLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.leetcode.common.ListNode;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_1480 {

	private LeetCodeProblem_1480 instance;

    @BeforeAll
    public void init() {
        instance = new LeetCodeProblem_1480();
    }

    @Test
    public void testRunningSum_case1() {
        int[] nums = {1,2,3,4};
        int[] solution = {1,3,6,10};
        int[] result = instance.runningSum(nums);
        Assertions.assertArrayEquals(solution, result, "Failed the test case");
    }
    
    @Test
    public void testRunningSum_case2() {
        int[] nums = {1,1,1,1,1};
        int[] solution = {1,2,3,4,5};
        int[] result = instance.runningSum(nums);
        Assertions.assertArrayEquals(solution, result, "Failed the test case");
    }
    
    @Test
    public void testRunningSum_case3() {
        int[] nums = {3,1,2,10,1};
        int[] solution = {3,4,6,16,17};
        int[] result = instance.runningSum(nums);
        Assertions.assertArrayEquals(solution, result, "Failed the test case");
    }
}
