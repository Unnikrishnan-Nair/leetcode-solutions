package com.leetcode.easy;

import com.leetcode.common.ListNode;

/**
 * 
 * 234. Palindrome Linked List
 * 
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Example 1:
 * 
 * Input: 1->2 Output: false
 * 
 * 
 * Example 2:
 * 
 * Input: 1->2->2->1 Output: true Follow up: Could you do it in O(n) time and
 * O(1) space?
 * 
 *
 */
public class LeetCodeProblem_234 {

    public boolean isPalindrome(ListNode head) {

        ListNode current = head;
        ListNode temp = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        while (prev != null && temp != null) {
            if (prev.val != temp.val) {
                return false;
            }
            prev = prev.next;
            temp = temp.next;
        }

        return true;
    }

}
