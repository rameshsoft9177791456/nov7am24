package com.rameshsoft.java.automation.collframework;

import java.util.Stack;
import java.util.Vector;

public class StackProg {

	public static void main(String[] args) {
		
		//Collection collection = new Stack();
		//List list = new Stack();
		Stack stack = new Stack();
		
		stack.add("java");
		stack.add("abc");
		stack.add("java");
		stack.add(null);
		stack.add("job");
		stack.add("java");
		stack.add(0, "JOBS");
		stack.addElement("practice");
		stack.push("hello do practice");
		stack.push(456456);
		
		System.out.println(stack);
		
		
	}
	
}
