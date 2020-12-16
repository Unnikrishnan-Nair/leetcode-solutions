package com.leetcode.medium;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.leetcode.common.ListNode;


@TestInstance(Lifecycle.PER_CLASS)
public class TestLeetCodeProblem_2 {

    private LeetCodeProblem_2 instance;


    @BeforeAll
    public void init() {
        instance = new LeetCodeProblem_2();
    }


    @Test
    public void addTwoNumbers1_case1() {
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        node11.next = node12;
        node12.next = node13;

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node21.next = node22;
        node22.next = node23;

        ListNode node31 = new ListNode(7);
        ListNode node32 = new ListNode(0);
        ListNode node33 = new ListNode(8);
        node31.next = node32;
        node32.next = node33;

        ListNode output = instance.addTwoNumbers1(node11, node21);

        Assertions.assertEquals(node31, output);

    }


    @Test
    public void addTwoNumbers1_case2() {
        ListNode node11 = new ListNode(0);
        ListNode node21 = new ListNode(0);
        ListNode node31 = new ListNode(0);

        ListNode output = instance.addTwoNumbers1(node11, node21);
        Assertions.assertEquals(node31, output);

    }


    @Test
    public void addTwoNumbers1_case3() {
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);
        ListNode node14 = new ListNode(9);
        ListNode node15 = new ListNode(9);
        ListNode node16 = new ListNode(9);
        ListNode node17 = new ListNode(9);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;

        ListNode node21 = new ListNode(9);
        ListNode node22 = new ListNode(9);
        ListNode node23 = new ListNode(9);
        ListNode node24 = new ListNode(9);
        node21.next = node22;
        node22.next = node23;
        node23.next = node24;

        ListNode node31 = new ListNode(8);
        ListNode node32 = new ListNode(9);
        ListNode node33 = new ListNode(9);
        ListNode node34 = new ListNode(9);
        ListNode node35 = new ListNode(0);
        ListNode node36 = new ListNode(0);
        ListNode node37 = new ListNode(0);
        ListNode node38 = new ListNode(1);

        node31.next = node32;
        node32.next = node33;
        node33.next = node34;
        node34.next = node35;
        node35.next = node36;
        node36.next = node37;
        node37.next = node38;

        ListNode output = instance.addTwoNumbers1(node11, node21);

        Assertions.assertEquals(node31, output);

    }


    @Test
    public void addTwoNumbers2_case1() {
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        node11.next = node12;
        node12.next = node13;

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node21.next = node22;
        node22.next = node23;

        ListNode node31 = new ListNode(7);
        ListNode node32 = new ListNode(0);
        ListNode node33 = new ListNode(8);
        node31.next = node32;
        node32.next = node33;

        ListNode output = instance.addTwoNumbers2(node11, node21);

        Assertions.assertEquals(node31, output);

    }


    @Test
    public void addTwoNumbers2_case2() {
        ListNode node11 = new ListNode(0);
        ListNode node21 = new ListNode(0);
        ListNode node31 = new ListNode(0);

        ListNode output = instance.addTwoNumbers2(node11, node21);
        Assertions.assertEquals(node31, output);

    }


    @Test
    public void addTwoNumbers2_case3() {
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);
        ListNode node14 = new ListNode(9);
        ListNode node15 = new ListNode(9);
        ListNode node16 = new ListNode(9);
        ListNode node17 = new ListNode(9);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;

        ListNode node21 = new ListNode(9);
        ListNode node22 = new ListNode(9);
        ListNode node23 = new ListNode(9);
        ListNode node24 = new ListNode(9);
        node21.next = node22;
        node22.next = node23;
        node23.next = node24;

        ListNode node31 = new ListNode(8);
        ListNode node32 = new ListNode(9);
        ListNode node33 = new ListNode(9);
        ListNode node34 = new ListNode(9);
        ListNode node35 = new ListNode(0);
        ListNode node36 = new ListNode(0);
        ListNode node37 = new ListNode(0);
        ListNode node38 = new ListNode(1);

        node31.next = node32;
        node32.next = node33;
        node33.next = node34;
        node34.next = node35;
        node35.next = node36;
        node36.next = node37;
        node37.next = node38;

        ListNode output = instance.addTwoNumbers2(node11, node21);

        Assertions.assertEquals(node31, output);

    }

}
