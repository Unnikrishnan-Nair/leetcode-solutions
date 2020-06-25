package com.leetcode.sorting.problems;

public class BubbleSort {

	/**
	 * Time Complexity - O(n^2)
	 * 
	 * @param array
	 */
	public void performSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 
	 * @param array
	 */
	public void performSort1(int[] array) {
		boolean isSorted = true;
		int length = array.length - 1;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < length; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				return;
			}
			length--;
		}
	}

	/**
	 * 
	 * @param array
	 */
	public void performSort2(int[] array, int length) {
		if (length < 1) {
			return;
		}
		for (int j = 0; j < length; j++) {
			if (array[j] > array[j + 1]) {
				int temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
		}
		performSort2(array, length - 1);

	}

}
