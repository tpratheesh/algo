package com.wtf;

import com.wtf.datastructure.Stack;

public class PrefixToInfixConversion {

	public static void main(String[] args) {
		String prefixExpression = "*-A/BC-/AKL";

		PrefixToInfixConversion convert = new PrefixToInfixConversion();

		Stack stack = new Stack();
		for (int i = prefixExpression.length() - 1; i >= 0; i--) {
			char c = prefixExpression.charAt(i);
			if (convert.isOperator(c)) {
				String c1 = (String) stack.pop();
				String c2 = (String) stack.pop();

				String output = "(" + c1 + Character.toString(c) + c2 + ")";
				stack.push(output);
			} else {
				stack.push(Character.toString(c));
			}
		}
		String pop = (String) stack.pop();
		System.out.println(pop);
	}

	public boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			return true;
		}
		return false;
	}
}