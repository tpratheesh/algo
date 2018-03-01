package com.wtf.datastructure;

public class Stack {
	Object[] arr = new Object[100];
	private int size;

	public void push(Object obj) {
		this.arr[size] = obj;
		this.size++;
	}

	public Object pop() {
		if (this.isEmpty()) {
			return null;
		}
		this.size--;
		return this.arr[size];
	}

	public Object peek() {
		if (this.isEmpty()) {
			return null;
		}
		return arr[this.size - 1];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void ptintStack() {
		for (int i = this.size - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			System.out.print("-->");
		}
	}
}
