package com.leetcode.easy;

/**
 * 
 * Given a valid (IPv4) IP address, return a defanged version of that IP
 * address.
 * 
 * A defanged IP address replaces every period "." with "[.]".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1" Example 2:
 * 
 * Input: address = "255.100.50.0" Output: "255[.]100[.]50[.]0"
 * 
 * 
 * Constraints:
 * 
 * The given address is a valid IPv4 address.
 *
 */
public class LeetCodeProblem_1108 {

	public String defangIPaddr(String address) {
		String output = null;
		if (address != null) {
			output = address.replaceAll("\\.", "[.]");
		}
		return output;
	}

}
