package com.wtf.datastructure;

import com.wtf.datastructure.obj.MapEntry;
import com.wtf.datastructure.obj.Node;

public class HashMap {

	private LinkedList[] arr = null;

	public HashMap() {
		arr = new LinkedList[100];
	}

	public void put(String key, Object value) {
		MapEntry entry = new MapEntry(key, value);
		int hash = entry.hashCode();
		System.out.println("put hash for " + key + ": " + hash);
		LinkedList list = (LinkedList) this.arr[hash];

		if (list != null && list.get(entry) != null) {
			MapEntry exists = (MapEntry) list.get(entry);
			exists.setValue(value);
		} else if (list != null) {
			list.add(new Node(entry));
		} else {
			list = new LinkedList();
			list.add(new Node(entry));
		}
		arr[hash] = list;
	}

	public Object get(String key) {
		int hash = getHashCode(key);
		System.out.println("get hash for " + key + ": " + hash);
		LinkedList list = (LinkedList) this.arr[hash];
		if (list == null) {
			return null;
		}
		Node header = list.getHeader();
		if (header != null) {
			MapEntry entry = (MapEntry) header.getValue();
			if (entry.getKey().equals(key)) {
				return entry.getValue();
			}
			Node next = header.getNext();
			while (next != null) {
				entry = (MapEntry) header.getValue();
				if (entry.getKey().equals(key)) {
					return entry.getValue();
				}
				next = next.getNext();
			}
		}
		return null;
	}

	private int getHashCode(String key) {
		int ascii = key.charAt(0);
		return ascii % 100;
	}
}
