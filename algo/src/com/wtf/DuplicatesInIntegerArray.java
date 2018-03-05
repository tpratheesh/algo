package com.wtf;

import java.util.ArrayList;
import java.util.List;

//O(N)
//O(1)
public class DuplicatesInIntegerArray {

	/*
	 * Given an array of n elements which contains integers from 0 to n-1 only. The
	 * numbers can appear any number of times. Find the repeating numbers. Example:
	 * Array: {2, 4, 1, 2, 6, 1, 6, 3, 0} Output: [1, 2, 6]
	 */
	public static void main(String args[]) {
		int[] arr = new int[] { 2, 4, 1, 2, 6, 1, 6, 3, 0 };
		int length = arr.length;
		List<Integer> dupList = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			int value = Math.abs(arr[i]);
			if (arr[value] < 0) {
				dupList.add(Math.abs(value));
			} else {
				arr[value] = Math.negateExact(arr[value]);
			}
		}
		System.out.println("hllo");
		for (Integer integer : dupList) {
			System.out.print(integer);
			System.out.print(", ");
		}
	}
}
