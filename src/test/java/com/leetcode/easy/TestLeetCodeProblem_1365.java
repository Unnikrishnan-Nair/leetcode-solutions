package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLeetCodeProblem_1365 {

	private static final Logger logger = LoggerFactory.getLogger(TestLeetCodeProblem_1119.class);

	@Test
	public void testKidsWithCandies() {

		LeetCodeProblem_1365 instance = new LeetCodeProblem_1365();

		int[] nums = { 8, 1, 2, 2, 3 };
		int[] solution = { 4, 0, 1, 1, 3 };
		int[] result = instance.smallerNumbersThanCurrent(nums);

		Assertions.assertArrayEquals(solution, result, "Failed the test case");

		int[] nums1 = { 6, 5, 4, 8 };
		int[] solution1 = { 2, 1, 0, 3 };
		result = instance.smallerNumbersThanCurrent(nums1);

		Assertions.assertArrayEquals(solution1, result, "Failed the test case");

		int[] nums2 = { 7, 7, 7, 7 };
		int[] solution2 = { 0, 0, 0, 0 };
		result = instance.smallerNumbersThanCurrent(nums2);

		Assertions.assertArrayEquals(solution2, result, "Failed the test case");

	}

}
