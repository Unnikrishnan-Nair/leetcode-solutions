package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.leetcode.easy.LeetCodeProblem_1119;


public class TestLeetCodeProblem_1119 {
	
	
	@Test
	public void testRemoveVowels() {
		
		LeetCodeProblem_1119 instance = new LeetCodeProblem_1119();
		
		String input1 = "leetcodeisacommunityforcoders";
		
		String result = instance.removeVowels(input1);
		Assertions.assertEquals("ltcdscmmntyfrcdrs", result, "Failed the test case");
		
		input1 = "aeiou";
		result = instance.removeVowels(input1);
		Assertions.assertEquals("", result, "Failed the test case");

	}
	
	
	
	

}
