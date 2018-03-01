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
		list.reverse();
	}
}
