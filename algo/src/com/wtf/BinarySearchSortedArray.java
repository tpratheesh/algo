package com.wtf;

public class BinarySearchSortedArray {

	// O(logN)
	// O(1)
	public static void main(String args[]) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int value = 7;
		Integer searchIndex = binarySearch(arr, value);
		if (searchIndex == null) {
			System.out.println("Cannot find " + value + " in empty array");
		} else {
			System.out.println("Element " + value + " found at index : " + searchIndex);
		}
	}

	public static Integer binarySearch(int[] arr, int value) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == value) {
				return mid;
			}

			if (arr[mid] > value) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return null;

	}
}
