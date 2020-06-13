package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLeetCodeProblem_1108 {

	private static final Logger logger = LoggerFactory.getLogger(TestLeetCodeProblem_1108.class);

	@Test
	public void testRemoveVowels() {

		LeetCodeProblem_1108 instance = new LeetCodeProblem_1108();

		String ipAddress = "1.1.1.1";

		String result = instance.defangIPaddr(ipAddress);

		Assertions.assertEquals("1[.]1[.]1[.]1", result, "Failed the test case");
		
		ipAddress = "255.100.50.0";
		
		result = instance.defangIPaddr(ipAddress);
		
		Assertions.assertEquals("255[.]100[.]50[.]0", result, "Failed the test case");

	}
}
