package com.wtf;

public class BinarySearchShiftedSortedArray {

	// O(logN)
	// O(1)
	public static void main(String args[]) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int value = 9;

		int changeIndex = findChangeIndex(arr);
		System.out.println("Change Index : " + changeIndex);

		Integer searchIndex = null;
		if (changeIndex > 0 && value >= arr[changeIndex - 1]) {
			searchIndex = binarySearch(arr, 0, changeIndex - 1, value);
		} else {
			searchIndex = binarySearch(arr, changeIndex, arr.length - 1, value);
		}

		if (searchIndex == null) {
			System.out.println("Cannot find " + value + " in empty array");
		} else {
			System.out.println("Element " + value + " found at index : " + searchIndex);
		}
	}

	private static int findChangeIndex(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			System.out.println("find change Index");
			int mid = (start + end) / 2;

			if (mid < (arr.length - 1) && arr[mid] > arr[mid + 1]) {
				return mid + 1;
			}

			if (arr[start] > arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return 0;
	}

	public static Integer binarySearch(int[] arr, int start, int end, int value) {
		if (arr == null || arr.length == 0) {
			return null;
		}

		while (start <= end) {
			System.out.println("binary search");
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
