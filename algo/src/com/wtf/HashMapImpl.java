package com.wtf;

import com.wtf.datastructure.HashMap;

public class HashMapImpl {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "One");
		map.put("1", "One1");
		map.put("2", "Two");
		map.put("3", "Three");
		map.put("4", "Four");
		map.put("5", "Five");
		System.out.println((String) map.get("1"));
		System.out.println((String) map.get("2"));
		System.out.println((String) map.get("3"));
		System.out.println((String) map.get("4"));
		System.out.println((String) map.get("5"));
	}
}
