package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_441 {
	
	
	private LeetCodeProblem_441 instance;

	@BeforeAll
	public void init() {
		instance = new LeetCodeProblem_441();
	}


	@Test
	public void testNumberOfJewelsInStones_case1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int result = instance.numJewelsInStones(jewels, stones);
		Assertions.assertEquals(3, result);
	}
	
	@Test
	public void testNumberOfJewelsInStones_case2() {
		String jewels = "z";
		String stones = "ZZ";
		int result = instance.numJewelsInStones(jewels, stones);
		Assertions.assertEquals(0, result);
	}

	@Test
	public void testNumberOfJewelsInStones1_case1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int result = instance.numJewelsInStones1(jewels, stones);
		Assertions.assertEquals(3, result);
	}

	@Test
	public void testNumberOfJewelsInStones1_case2() {
		String jewels = "z";
		String stones = "ZZ";
		int result = instance.numJewelsInStones1(jewels, stones);
		Assertions.assertEquals(0, result);
	}

	@Test
	public void testNumberOfJewelsInStones2_case1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int result = instance.numJewelsInStones2(jewels, stones);
		Assertions.assertEquals(3, result);
	}

	@Test
	public void testNumberOfJewelsInStones2_case2() {
		String jewels = "z";
		String stones = "ZZ";
		int result = instance.numJewelsInStones2(jewels, stones);
		Assertions.assertEquals(0, result);
	}
	
	@Test
	public void testNumberOfJewelsInStones3_case1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int result = instance.numJewelsInStones3(jewels, stones);
		Assertions.assertEquals(3, result);
	}

	@Test
	public void testNumberOfJewelsInStones3_case2() {
		String jewels = "z";
		String stones = "ZZ";
		int result = instance.numJewelsInStones3(jewels, stones);
		Assertions.assertEquals(0, result);
	}

	
	@Test
	public void testNumberOfJewelsInStones3() {
		
		LeetCodeProblem_441 instance = new LeetCodeProblem_441();
		
		String jewels = "aA";
		String stones = "aAAbbbb";
		int result = instance.numJewelsInStones2(jewels, stones);
		
		Assertions.assertEquals(3, result);
		
		jewels = "z";
		stones = "ZZ";
		result = instance.numJewelsInStones(jewels, stones);
		
		Assertions.assertEquals(0, result);
		
	}

}
