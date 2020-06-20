package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_1332 {
	
	private LeetCodeProblem_1332 instance;

	@BeforeAll
	public void init() {
		instance = new LeetCodeProblem_1332();
	}

	@Test
	public void testRemovePalindromeSub_case1() {
		String input = "ababa";
		int solution = 1;
		int result = instance.removePalindromeSub(input);
		Assertions.assertEquals(solution, result, "Failed the test case");
	}
	
	@Test
	public void testRemovePalindromeSub_case2() {
		String input = "abb";
		int solution = 2;
		int result = instance.removePalindromeSub(input);
		Assertions.assertEquals(solution, result, "Failed the test case");
	}
	
	@Test
	public void testRemovePalindromeSub_case3() {
		String input = "baabb";
		int solution = 2;
		int result = instance.removePalindromeSub(input);
		Assertions.assertEquals(solution, result, "Failed the test case");
	}
	
	@Test
	public void testRemovePalindromeSub_case4() {
		String input = "";
		int solution = 0;
		int result = instance.removePalindromeSub(input);
		Assertions.assertEquals(solution, result, "Failed the test case");
	}
	

}
