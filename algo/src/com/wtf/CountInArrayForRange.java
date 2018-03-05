package com.wtf;

public class CountInArrayForRange {

	public static void main(String args[]) {

		int[] arr = { 1, 1, 1, 6, 6, 6, 1 };
		printArray(arr);
		count(arr);
	}

	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "->");
		}
		System.out.println();
	}

	public static void count(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int index = arr[i];
			if (index > n) {
				index = (index % n);
				if (index == 0) {
					index = n;
				}
			}
			int currVal = arr[index - 1];
			int newVal = currVal + n * index;
			arr[index - 1] = newVal;
			printArray(arr);
		}

		for (int i = 0; i < n; i++) {
			int index = arr[i];
			if (index > n) {
				int origVal = (index % n);
				if (origVal == 0) {
					origVal = n;
				}
				int count = (index - origVal) / (n * (i + 1));

				System.out.print("No:  : " + (i + 1));
				System.out.println(", Count : " + count);
				arr[i] = origVal;
			} else {
				System.out.print("No:  : " + (i + 1));
				System.out.println(", Count : " + 0);
			}
		}
		printArray(arr);
	}
}
