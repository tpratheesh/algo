package com.wtf.datastructure;

import com.wtf.datastructure.obj.Node;

public class LinkedList {
	private Node[] list = new Node[10];
	private Node header = null;
	private int size = 0;

	public void add(Node node) {
		this.list[this.size] = node;
		this.size++;
		if (this.size > 1) {
			Node prevNode = list[this.size - 2];
			prevNode.setNext(node);
		} else if (this.size == 1) {
			header = this.list[this.size - 1];
		}
	}

	public Node getHeader() {
		return header;
	}

	public void setHeader(Node header) {
		this.header = header;
	}

	public void printList() {
		Node header = getHeader();
		while (header != null) {
			System.out.print(header.getValue() + "-->");
			header = header.getNext();
		}
		System.out.println("");
	}

	public Object get(Object val) {
		Node header = getHeader();
		if (header != null) {
			if (header.getValue().equals(val)) {
				return header.getValue();
			}
			Node next = header.getNext();
			while (next != null) {
				if (next.getValue().equals(val)) {
					return next.getValue();
				}
				next = next.getNext();
			}
		}
		return null;
	}
}