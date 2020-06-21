package com.leetcode.sorting.problems;

public class QuickSort {

	public void performSort(int[] array) {
		performSortRecursively(array, 0, array.length - 1);
	}

	public void performSortRecursively(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		performSortRecursively(array, left, index);
		performSortRecursively(array, index + 1, right);

	}

	public int partition(int[] array, int left, int right, int pivot) {
		while (left < right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left < right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}
		return left;
	}

}
