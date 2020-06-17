package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 1122. Relative Sort Array
 * 
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all
 * elements in arr2 are also in arr1.
 * 
 * Sort the elements of arr1 such that the relative ordering of items in arr1
 * are the same as in arr2. Elements that don't appear in arr2 should be placed
 * at the end of arr1 in ascending order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6] Output:
 * [2,2,2,1,4,3,3,9,6,7,19]
 * 
 * 
 * Constraints:
 * 
 * arr1.length, arr2.length <= 1000 0 <= arr1[i], arr2[i] <= 1000 Each arr2[i]
 * is distinct. Each arr2[i] is in arr1.
 *
 * 
 */
public class LeetCodeProblem_1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        final Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> remainingIntegers = new ArrayList<>();
        final List<Integer> output = new ArrayList<>();
        for (int val : arr2) {
            map.put(val, 0);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
            } else {
                remainingIntegers.add(arr1[i]);
            }
        }
        map.keySet().forEach(val -> {
            int count = map.get(val);
            for (int i = 0; i < count; i++) {
                output.add(val);
            }
        });
        Collections.sort(remainingIntegers);
        output.addAll(remainingIntegers);
        return output.stream().mapToInt(val -> val).toArray();
    }

}
