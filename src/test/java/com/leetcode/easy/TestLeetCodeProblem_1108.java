package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_1108 {

	private LeetCodeProblem_1108 instance;

	@BeforeAll
	public void init() {
		instance = new LeetCodeProblem_1108();
	}

	@Test
	public void testRemoveVowels_Case1() {
		String ipAddress = "";
		String result = instance.defangIPaddr(ipAddress);
		Assertions.assertEquals("", result, "Failed the test case");
	}

	@Test
	public void testRemoveVowels_Case2() {
		String ipAddress = null;
		String result = instance.defangIPaddr(ipAddress);
		Assertions.assertEquals(null, result, "Failed the test case");
	}

	@Test
	public void testRemoveVowels_Case3() {
		String ipAddress = "1.1.1.1";
		String result = instance.defangIPaddr(ipAddress);
		Assertions.assertEquals("1[.]1[.]1[.]1", result, "Failed the test case");

	}

	@Test
	public void testRemoveVowels_Case4() {
		String ipAddress = "255.100.50.0";
		String result = instance.defangIPaddr(ipAddress);
		Assertions.assertEquals("255[.]100[.]50[.]0", result, "Failed the test case");
	}

}
