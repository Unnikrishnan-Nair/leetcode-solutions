package com.leetcode.easy;

import java.util.Stack;

import com.leetcode.common.ListNode;

/**
 * 
 * 206. Reverse Linked List
 * 
 * Reverse a singly linked list.
 * 
 * Example:
 * 
 * Input: 1->2->3->4->5->NULL Output: 5->4->3->2->1->NULL Follow up:
 * 
 * A linked list can be reversed either iteratively or recursively. Could you
 * implement both?
 * 
 *
 */

public class LeetCodeProblem_206 {

    /**
     * 
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }

    /**
     * 
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * 
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        ListNode temp = new ListNode(0);
        ListNode newLinkedList = temp;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        while (!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop());
            temp.next = node;
            temp = node;
        }
        return newLinkedList.next;
    }

}


