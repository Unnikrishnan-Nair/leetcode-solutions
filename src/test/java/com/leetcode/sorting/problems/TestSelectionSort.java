package com.leetcode.sorting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestSelectionSort {
	
	private SelectionSort instance;

	@BeforeAll
	public void init() {
		instance = new SelectionSort();
	}

	@Test
	public void testPerformSort_case1() {
		int[] inputArray = { -4, -1, 10, -6, 0, 9 };
		int[] solution = { -6, -4, -1, 0, 9, 10 };
		instance.performSort(inputArray);
		Assertions.assertArrayEquals(solution, inputArray);
	}
	
	@Test
	public void testPerformSort_case2() {
		int[] inputArray = { 6, 7, 8, 9, 1, 2, 3, 4, 5 };
		int[] solution = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		instance.performSort(inputArray);
		Assertions.assertArrayEquals(solution, inputArray);
	}
	
	@Test
	public void testPerformSort_case3() {
		int[] inputArray = { 7, 1, 3, 8, 9 };
		int[] solution = { 1, 3, 7, 8, 9 };
		instance.performSort(inputArray);
		Assertions.assertArrayEquals(solution, inputArray);
	}
	
	@Test
	public void testPerformSort1_case1() {
		int[] inputArray = { -4, -1, 10, -6, 0, 9 };
		int[] solution = { -6, -4, -1, 0, 9, 10 };
		instance.performSort1(inputArray,inputArray.length-1);
		Assertions.assertArrayEquals(solution, inputArray);
	}
	
	@Test
	public void testPerformSort1_case2() {
		int[] inputArray = { 6, 7, 8, 9, 1, 2, 3, 4, 5 };
		int[] solution = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		instance.performSort1(inputArray,inputArray.length-1);
		Assertions.assertArrayEquals(solution, inputArray);
	}
	
	@Test
	public void testPerformSort1_case3() {
		int[] inputArray = { 7, 1, 3, 8, 9 };
		int[] solution = { 1, 3, 7, 8, 9 };
		instance.performSort1(inputArray,inputArray.length-1);
		Assertions.assertArrayEquals(solution, inputArray);
	}
	
	@Test
	public void testPerformSort1_case4() {
		int[] inputArray = { 6, 2, 7, 3, 9,1,4,8 };
		int[] solution = { 1,2,3,4,6,7,8,9 };
		instance.performSort1(inputArray,inputArray.length);
		Assertions.assertArrayEquals(solution, inputArray);
	}


}
