package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_1119 {

	private LeetCodeProblem_1119 instance;

	@BeforeAll
	public void init() {
		instance = new LeetCodeProblem_1119();
	}

	@Test
	public void testRemoveVowels_case1() {
		String input1 = "leetcodeisacommunityforcoders";
		String result = instance.removeVowels(input1);
		Assertions.assertEquals("ltcdscmmntyfrcdrs", result, "Failed the test case");
	}

	@Test
	public void testRemoveVowels_case2() {
		String input1 = "aeiou";
		String result = instance.removeVowels(input1);
		Assertions.assertEquals("", result, "Failed the test case");
	}

	@Test
	public void testRemoveVowels1_case1() {
		String input1 = "leetcodeisacommunityforcoders";
		String result = instance.removeVowels1(input1);
		Assertions.assertEquals("ltcdscmmntyfrcdrs", result, "Failed the test case");
	}

	@Test
	public void testRemoveVowels1_case2() {
		String input1 = "aeiou";
		String result = instance.removeVowels1(input1);
		Assertions.assertEquals("", result, "Failed the test case");
	}

}
