package com.wtf;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfString {

	// O(NlogN)
	// O(1)
	public static void main(String[] args) {
		String input = "abcd";

		Set<String> permutations = getAllPermutations(input);
		System.out.println("Permutations : " + permutations.toString());
		System.out.println("No of Permutations for input String \"" + input + "\" : " + permutations.size());

	}

	private static Set<String> getAllPermutations(String str) {
		Set<String> p = new HashSet<>();

		if (str == null || str.length() == 0) {
			return p;
		}

		if (str.length() == 1) {
			p.add(str);
			return p;
		}

		String current = String.valueOf(str.charAt(0));
		String rem = str.substring(1);
		Set<String> combs = getAllPermutations(rem);
		for (String c : combs) {
			for (int i = 0; i <= c.length(); i++) {
				p.add(c.substring(0, i) + current + c.substring(i));
			}
		}
		return p;
	}
}
