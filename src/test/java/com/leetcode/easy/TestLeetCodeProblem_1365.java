package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_1365 {

	private LeetCodeProblem_1365 instance;

	@BeforeAll
	public void init() {
		instance = new LeetCodeProblem_1365();
	}

	@Test
	public void testSmallerNumbersThanCurrent_case1() {
		int[] nums = { 8, 1, 2, 2, 3 };
		int[] solution = { 4, 0, 1, 1, 3 };
		int[] result = instance.smallerNumbersThanCurrent(nums);
		Assertions.assertArrayEquals(solution, result, "Failed the test case");
	}

	@Test
	public void testSmallerNumbersThanCurrent_case2() {
		int[] nums = { 6, 5, 4, 8 };
		int[] solution = { 2, 1, 0, 3 };
		int[] result = instance.smallerNumbersThanCurrent(nums);
		Assertions.assertArrayEquals(solution, result, "Failed the test case");
	}

	@Test
	public void testSmallerNumbersThanCurrent_case3() {
		int[] nums = { 7, 7, 7, 7 };
		int[] solution = { 0, 0, 0, 0 };
		int[] result = instance.smallerNumbersThanCurrent(nums);
		Assertions.assertArrayEquals(solution, result, "Failed the test case");
	}

}
