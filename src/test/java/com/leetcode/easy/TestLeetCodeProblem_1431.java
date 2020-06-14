package com.leetcode.easy;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_1431 {

	private LeetCodeProblem_1431 instance;

	@BeforeAll
	public void init() {
		instance = new LeetCodeProblem_1431();
	}

	@Test
	public void testKidsWithCandies_case1() {
		List<Integer> intList = Arrays.asList(2, 3, 5, 1, 3);
		int[] candies = intList.stream().mapToInt(i -> (int) i).toArray();
		int extraCandies = 3;
		List<Boolean> result = instance.kidsWithCandies(candies, extraCandies);

		Assertions.assertEquals(true, result.get(0), "Failed the test case");
		Assertions.assertEquals(true, result.get(1), "Failed the test case");
		Assertions.assertEquals(true, result.get(2), "Failed the test case");
		Assertions.assertEquals(false, result.get(3), "Failed the test case");
		Assertions.assertEquals(true, result.get(4), "Failed the test case");

	}

	@Test
	public void testKidsWithCandies_case2() {
		List<Integer> intList = Arrays.asList(4, 2, 1, 1, 2);
		int[] candies = intList.stream().mapToInt(i -> (int) i).toArray();
		int extraCandies = 1;
		List<Boolean> result = instance.kidsWithCandies(candies, extraCandies);
		Assertions.assertEquals(true, result.get(0), "Failed the test case");
		Assertions.assertEquals(false, result.get(1), "Failed the test case");
		Assertions.assertEquals(false, result.get(2), "Failed the test case");
		Assertions.assertEquals(false, result.get(3), "Failed the test case");
		Assertions.assertEquals(false, result.get(4), "Failed the test case");
	}

}
