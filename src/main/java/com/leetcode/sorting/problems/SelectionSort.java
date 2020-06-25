package com.leetcode.sorting.problems;

/**
 * 
 * 
 *
 */
public class SelectionSort {
	
	/**
	 * Iterative Solution
	 * 
	 * @param array
	 */
	public void performSort(int[] array) {
		for(int i=0; i< array.length; i++) {
			int min_index = i;
			for(int j=i+1; j< array.length; j++) {
				if(array[j] < array[min_index]) {
					min_index = j;
				}
			}
			if(array[min_index] < array[i]) {
				int temp = array[min_index];
				array[min_index] = array[i];
				array[i] = temp;
			}
		}
	}
	
	
	public void performSort1(int[] array, int n) {
		
		if(n < 1) {
			return;
		}
		performSort1(array,n-1);
		int index = n-1;
		
		for(int j=n; j< array.length; j++) {
			if(array[j] < array[index]) {
				index = j;
			}
		}
		if(array[index] < array[n-1]) {
			int temp = array[index];
			array[index] = array[n-1];
			array[n-1] = temp;
		}
	}
	
	
}
