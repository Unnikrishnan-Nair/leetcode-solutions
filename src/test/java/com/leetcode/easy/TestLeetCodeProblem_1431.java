package com.leetcode.easy;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLeetCodeProblem_1431 {
	
	
	private static final Logger logger = LoggerFactory.getLogger(TestLeetCodeProblem_1119.class);

	@Test
	public void testKidsWithCandies() {

		LeetCodeProblem_1431 instance = new LeetCodeProblem_1431();

		List<Integer> intList = Arrays.asList(2,3,5,1,3);
		int[] candies = intList.stream().mapToInt(i->(int)i).toArray();
		int extraCandies = 3;

		List<Boolean> result = instance.kidsWithCandies(candies, extraCandies);

		Assertions.assertEquals(true, result.get(0), "Failed the test case");
		Assertions.assertEquals(true, result.get(1), "Failed the test case");
		Assertions.assertEquals(true, result.get(2), "Failed the test case");
		Assertions.assertEquals(false, result.get(3), "Failed the test case");
		Assertions.assertEquals(true, result.get(4), "Failed the test case");

		intList = Arrays.asList(4,2,1,1,2);
		candies = intList.stream().mapToInt(i->(int)i).toArray();
		extraCandies = 1;

		result = instance.kidsWithCandies(candies,extraCandies);
		
		Assertions.assertEquals(true, result.get(0), "Failed the test case");
		Assertions.assertEquals(false, result.get(1), "Failed the test case");
		Assertions.assertEquals(false, result.get(2), "Failed the test case");
		Assertions.assertEquals(false, result.get(3), "Failed the test case");
		Assertions.assertEquals(false, result.get(4), "Failed the test case");

	}

}
