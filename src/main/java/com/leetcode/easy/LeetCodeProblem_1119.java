package com.leetcode.easy;

import java.util.Arrays;
import java.util.List;

/**
 * Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and
 * return the new string.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: "leetcodeisacommunityforcoders" Output: "ltcdscmmntyfrcdrs" Example 2:
 * 
 * Input: "aeiou" Output: ""
 * 
 * 
 * Note:
 * 
 * S consists of lowercase English letters only. 1 <= S.length <= 1000
 * 
 */
public class LeetCodeProblem_1119 {
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String removeVowels(String input) {
		List<Character> vowels = Arrays.asList('a','e','i','o','u');
		StringBuffer outputBuffer = new StringBuffer();
		char[] charArray = input.toCharArray(); 
		for(int i=0; i < charArray.length; i++) {
			if(!vowels.contains(charArray[i])) {
				outputBuffer.append(charArray[i]);
			}
		}
		return outputBuffer.toString();     
	}
	
	public String removeVowels1(String input) {
		return input.replaceAll("[aeiou]", "");
	}
	
}
