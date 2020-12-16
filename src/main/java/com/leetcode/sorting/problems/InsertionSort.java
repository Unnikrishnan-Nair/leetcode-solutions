package com.leetcode.sorting.problems;

public class InsertionSort {

    /**
     * 
     * @param array
     */
    public void performSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
    
    public void performSort1(int[] array, int n) {
    	if(n <= 1) {
    		return;
    	}
    	performSort1(array, n-1);
    	int key = array[n-1];
    	int j = n-2;
    	while(j >=0 && array[j] > key) {
    		int temp = array[j];
    		array[j] = array[j+1];
    		array[j+1] = temp;
    		j--;
    	}
    }

}
