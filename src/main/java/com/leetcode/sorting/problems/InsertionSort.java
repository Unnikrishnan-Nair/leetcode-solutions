package com.leetcode.sorting.problems;

public class InsertionSort {
	
	public void performSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			int key = array[i];
			int j=i-1;
			while(j >= 0 && array[j] > key) {
				array[j+1] = array[j];
				j=j-1;
			}
			array[j + 1] = key; 
		}
	}

}
