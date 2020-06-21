package com.leetcode.sorting.problems;

/**
 * 
 * 
 *
 */
public class SelectionSort {
	
	/**
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
	
}
