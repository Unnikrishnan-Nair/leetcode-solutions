package com.leetcode.easy;

import static com.leetcode.common.TestUtils.getInputLinkedList;
import static com.leetcode.common.TestUtils.getOutputLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.leetcode.common.ListNode;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_206 {

    private LeetCodeProblem_206 instance;

    @BeforeAll
    public void init() {
        instance = new LeetCodeProblem_206();
    }

    @Test
    public void testKidsWithCandies_case1() {
        ListNode inputListNode = getInputLinkedList();
        ListNode outputListNode = getOutputLinkedList();
        ListNode result = instance.reverseList(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");
    }

    @Test
    public void testKidsWithCandies_case2() {
        ListNode inputListNode = null;
        ListNode outputListNode = null;
        ListNode result = instance.reverseList(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");
    }

    @Test
    public void testKidsWithCandies_case3() {
        ListNode inputListNode = new ListNode(1);
        ListNode outputListNode = new ListNode(1);
        ListNode result = instance.reverseList(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");
    }

    @Test
    public void testKidsWithCandies1_case1() {
        ListNode inputListNode = getInputLinkedList();
        ListNode outputListNode = getOutputLinkedList();
        ListNode result = instance.reverseList1(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");

    }

    @Test
    public void testKidsWithCandies1_case2() {
        ListNode inputListNode = null;
        ListNode outputListNode = null;
        ListNode result = instance.reverseList1(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");
    }

    @Test
    public void testKidsWithCandies1_case3() {
        ListNode inputListNode = new ListNode(1);
        ListNode outputListNode = new ListNode(1);
        ListNode result = instance.reverseList1(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");
    }

    @Test
    public void testKidsWithCandies2_case1() {
        ListNode inputListNode = getInputLinkedList();
        ListNode outputListNode = getOutputLinkedList();
        ListNode result = instance.reverseList2(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");
    }

    @Test
    public void testKidsWithCandies2_case2() {
        ListNode inputListNode = null;
        ListNode outputListNode = null;
        ListNode result = instance.reverseList2(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");
    }

    @Test
    public void testKidsWithCandies2_case3() {
        ListNode inputListNode = new ListNode(1);
        ListNode outputListNode = new ListNode(1);
        ListNode result = instance.reverseList2(inputListNode);
        Assertions.assertEquals(outputListNode, result, "Failed the test case");
    }

}
