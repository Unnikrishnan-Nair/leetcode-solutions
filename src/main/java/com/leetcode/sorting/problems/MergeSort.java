package com.leetcode.sorting.problems;

public class MergeSort {

    public int[] mergeSort(int[] array) {

        if (array.length < 2) {
            return array;
        }

        int middle = array.length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = null;

        if (array.length % 2 == 0) {
            rightArray = new int[middle];
        } else {
            rightArray = new int[middle + 1];
        }

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[middle + i];
        }

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        int[] result = mergeHalves(leftArray, rightArray);

        return result;

    }

    private int[] mergeHalves(int[] leftArray, int[] rightArray) {

        int leftPtr = 0;
        int rightPtr = 0;
        int resultPtr = 0;
        int[] resultArray = new int[leftArray.length + rightArray.length];

        while (leftPtr < leftArray.length || rightPtr < rightArray.length) {

            if (leftPtr < leftArray.length && rightPtr < rightArray.length) {
                if (leftArray[leftPtr] < rightArray[rightPtr]) {
                    resultArray[resultPtr++] = leftArray[leftPtr++];

                } else {
                    resultArray[resultPtr++] = rightArray[rightPtr++];
                }
            } else if (leftPtr < leftArray.length) {
                resultArray[resultPtr++] = leftArray[leftPtr++];
            } else {
                resultArray[resultPtr++] = rightArray[rightPtr++];
            }
        }
        return resultArray;
    }

}
