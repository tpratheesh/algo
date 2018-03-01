package com.wtf.datastructure.obj;

public class Node {
	private Object value;
	private Node next;

	public Node(Object value) {
		this.value = value;
		this.next = null;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
