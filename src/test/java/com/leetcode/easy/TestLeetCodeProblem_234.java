package com.leetcode.easy;

import static com.leetcode.common.TestUtils.getInputLinkedList;
import static com.leetcode.common.TestUtils.getPalindromeLinkedList;
import static com.leetcode.common.TestUtils.getInCorrectPalindromeLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.leetcode.common.ListNode;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_234 {

    private LeetCodeProblem_234 instance;

    @BeforeAll
    public void init() {
        instance = new LeetCodeProblem_234();
    }

    @Test
    public void testIsPalindrome_case1() {
        ListNode palindromeLinkedList = getPalindromeLinkedList();
        boolean result = instance.isPalindrome(palindromeLinkedList);
        Assertions.assertEquals(true, result);
    }
    
    @Test
    public void testIsPalindrome_case2() {
        ListNode palindromeLinkedList = getInputLinkedList();
        boolean result = instance.isPalindrome(palindromeLinkedList);
        Assertions.assertEquals(false, result);
    }
    
    @Test
    public void testIsPalindrome_case3() {
        ListNode palindromeLinkedList = getInCorrectPalindromeLinkedList();
        boolean result = instance.isPalindrome(palindromeLinkedList);
        Assertions.assertEquals(false, result);
    }
    
    @Test
    public void testIsPalindrome1_case1() {
        ListNode palindromeLinkedList = getPalindromeLinkedList();
        boolean result = instance.isPalindrome1(palindromeLinkedList);
        Assertions.assertEquals(true, result);
    }
    
    @Test
    public void testIsPalindrome1_case2() {
        ListNode palindromeLinkedList = getInputLinkedList();
        boolean result = instance.isPalindrome1(palindromeLinkedList);
        Assertions.assertEquals(false, result);
    }
    
    @Test
    public void testIsPalindrome1_case3() {
        ListNode palindromeLinkedList = getInCorrectPalindromeLinkedList();
        boolean result = instance.isPalindrome1(palindromeLinkedList);
        Assertions.assertEquals(false, result);
    }

}
