package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_977 {

	private LeetCodeProblem_977 instance;

	@BeforeAll
	public void init() {
		instance = new LeetCodeProblem_977();
	}

	@Test
	public void testSortedSquares_case1() {
		int[] inputArray = { -4, -1, 0, 3, 10 };
		int[] solution = { 0, 1, 9, 16, 100 };
		int[] result = instance.sortedSquares(inputArray);
		Assertions.assertArrayEquals(solution, result);
	}

	@Test
	public void testSortedSquares_case2() {
		int[] inputArray = { -7, -3, 2, 3, 11 };
		int[] solution = { 4, 9, 9, 49, 121 };
		int[] result = instance.sortedSquares(inputArray);
		Assertions.assertArrayEquals(solution, result);
	}

	@Test
	public void testSortedSquares1_case1() {
		int[] inputArray = { -4, -1, 0, 3, 10 };
		int[] solution = { 0, 1, 9, 16, 100 };
		int[] result = instance.sortedSquares1(inputArray);
		Assertions.assertArrayEquals(solution, result);
	}

	@Test
	public void testSortedSquares1_case2() {
		int[] inputArray = { -7, -3, 2, 3, 11 };
		int[] solution = { 4, 9, 9, 49, 121 };
		int[] result = instance.sortedSquares1(inputArray);
		Assertions.assertArrayEquals(solution, result);
	}

}
