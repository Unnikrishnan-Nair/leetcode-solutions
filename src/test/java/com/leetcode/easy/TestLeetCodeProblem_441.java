package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLeetCodeProblem_441 {
	
	
	private static final Logger logger = LoggerFactory.getLogger(TestLeetCodeProblem_1119.class);

	@Test
	public void testKidsWithCandies() {
		
		LeetCodeProblem_441 instance = new LeetCodeProblem_441();
		
		String jewels = "aA";
		String stones = "aAAbbbb";
		int result = instance.numJewelsInStones(jewels, stones);
		
		Assertions.assertEquals(3, result);
		
		jewels = "z";
		stones = "ZZ";
		result = instance.numJewelsInStones(jewels, stones);
		
		Assertions.assertEquals(0, result);
		
	}

}
