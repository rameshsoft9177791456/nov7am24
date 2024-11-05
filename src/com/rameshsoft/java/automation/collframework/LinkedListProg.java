package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProg {
public static void main(String[] args) {
	
	//Collection collection = new Collection();
	//List list = new List();
	//Collection collection = new LinkedList();
	//List list = new LinkedList();
	LinkedList list = new LinkedList();
	
	list.add(456);
	list.add("job");
	list.add(456);
	list.add("job");
	list.add(456.456);
	list.add(null);
	list.add('g');
	list.add("practice");
	list.add("hardwork");
	list.add(0, "JOB");
	list.addFirst(456456456);
	list.addLast("JOBS");
	System.out.println(list);
	
	Object obj0 = list.get(0);
	System.out.println(obj0);
	
	
	Object obj4 = list.get(4);
	System.out.println(obj4);
	
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	
	
	System.out.println(list.removeFirst());
	
	System.out.println(list);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
