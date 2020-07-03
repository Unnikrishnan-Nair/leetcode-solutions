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

}
