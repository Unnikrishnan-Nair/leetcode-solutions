package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeedCodeProblem_1313 {

	private LeetCodeProblem_1313 instance;

	@BeforeAll
	public void init() {
		instance = new LeetCodeProblem_1313();
	}

	@Test
	public void testDecompressRLElist_Case1() {
		int[] nums = { 1, 2, 3, 4 };
		int[] solution = { 2, 4, 4, 4 };
		int[] result = instance.decompressRLElist(nums);
		Assertions.assertArrayEquals(solution, result, "Failed the test case");
	}

	@Test
	public void testDecompressRLElist_Case2() {
		int[] nums = { 1, 1, 2, 3 };
		int[] solution = { 1, 3, 3 };
		int[] result = instance.decompressRLElist(nums);
		Assertions.assertArrayEquals(solution, result, "Failed the test case");
	}

}
