package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_334 {

    private LeetCodeProblem_334 instance;

    @BeforeAll
    public void init() {
        instance = new LeetCodeProblem_334();
    }

    @Test
    public void testReverseString_case1() {
        char[] inputArray = { 'h', 'e', 'l', 'l', 'o' };
        char[] solution = { 'o', 'l', 'l', 'e', 'h' };
        instance.reverseString(inputArray);
        Assertions.assertArrayEquals(solution, inputArray);
    }

    @Test
    public void testReverseString_case2() {
        char[] inputArray = { 'H', 'a', 'n', 'n', 'a', 'h' };
        char[] solution = { 'h', 'a', 'n', 'n', 'a', 'H' };
        instance.reverseString(inputArray);
        Assertions.assertArrayEquals(solution, inputArray);
    }

}
