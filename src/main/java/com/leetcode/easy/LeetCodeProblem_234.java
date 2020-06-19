package com.leetcode.easy;

import java.util.Stack;

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
		ListNode endOfFirstHalf = getEndOfFirstHalf(head);
		ListNode startOfSecondHalf = reverseLinkedList(endOfFirstHalf.next); 
		
		ListNode p1 = head;
		ListNode p2 = startOfSecondHalf;
		boolean result = true;
		
		while(result && p2 != null) {
			if(p1.val != p2.val) {
				result = false;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		endOfFirstHalf.next = reverseLinkedList(startOfSecondHalf);
		return result;
	}
	
	/**
	 * Using Stack
	 * 
	 * @param head
	 * @return
	 */
	public boolean isPalindrome1(ListNode head) {
		Stack<Integer> stack = new Stack<>();
		ListNode current = head;
		ListNode temp = head;
		while(current != null) {
			stack.push(current.val);
			current = current.next;
		}
		
		while(!stack.isEmpty() && temp!= null) {
			if(stack.pop() != temp.val) {
				return false;
			}
			temp = temp.next;
		}
		return stack.isEmpty();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	/************** Private Methods *****************/
	
	private ListNode getEndOfFirstHalf(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public ListNode reverseLinkedList(ListNode head) {
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

}
