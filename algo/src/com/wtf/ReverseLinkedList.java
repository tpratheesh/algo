package com.wtf;

import com.wtf.datastructure.LinkedList;
import com.wtf.datastructure.obj.Node;

public class ReverseLinkedList {

	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		list.add(new Node("a"));
		list.add(new Node("b"));
		list.add(new Node("c"));
		list.add(new Node("d"));
		list.add(new Node("e"));
		list.add(new Node("f"));
		list.add(new Node("g"));
		list.add(new Node("h"));
		list.add(new Node("i"));
		System.out.print("Original List => ");
		list.printList();
		System.out.println("-----------------------");
		ReverseLinkedList r = new ReverseLinkedList();
		r.reverse(list);
		r.reverse2(list);
		r.reverseRecursive(list, list.getHeader());
		list.printList();
	}

	public void reverse(LinkedList list) {
		Node header = list.getHeader();
		Node tail = list.getHeader();
		Node node = header.getNext();
		while (tail.getNext() != null) {
			header = list.getHeader();
			Node nextNode = null;
			if (node != null) {
				nextNode = node.getNext();
			}
			tail.setNext(nextNode);

			Node temp1 = node;
			Node temp2 = header;

			node = node.getNext();

			temp1.setNext(temp2);
			list.setHeader(temp1);
			list.printList();
		}
	}

	public void reverse2(LinkedList list) {
		Node prev = null;
		Node curr = null;
		Node next = list.getHeader();

		while (next != null) {
			Node temp1 = next;
			Node temp2 = next.getNext();
			curr = temp1;
			next = temp2;
			curr.setNext(prev);
			prev = curr;
			list.printList();
		}
		list.setHeader(curr);
		list.printList();
	}

	public void reverseRecursive(LinkedList list, Node curr) {
		if (curr == null) {
			return;
		}
		if (curr.getNext() == null) {
			list.setHeader(curr);
			return;
		}
		System.out.println("Curr: " + curr.getValue() + ", Next: " + curr.getNext().getValue());
		reverseRecursive(list, curr.getNext());
		curr.getNext().setNext(curr);
		curr.setNext(null);
	}
}
