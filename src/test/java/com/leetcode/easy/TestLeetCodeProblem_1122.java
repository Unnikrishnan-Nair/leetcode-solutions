package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_1122 {

    private LeetCodeProblem_1122 instance;

    @BeforeAll
    public void init() {
        instance = new LeetCodeProblem_1122();
    }

    @Test
    public void testSmallerNumbersThanCurrent_case1() {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        int[] solution = { 2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19 };
        int[] result = instance.relativeSortArray(arr1, arr2);
        Assertions.assertArrayEquals(solution, result, "Failed the test case");
    }
}
