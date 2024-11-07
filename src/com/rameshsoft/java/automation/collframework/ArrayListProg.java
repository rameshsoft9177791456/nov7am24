package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListProg {
public static void main(String[] args) {
	
	//Collection collection = new Collection();
	//List list = new List();
	//Collection collection = new ArrayList();
	//List list = new ArrayList();
	ArrayList list = new ArrayList();
	
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
list.add("practice");
	list.add("hardwork");
	System.out.println(list);
	
	Object obj0 = list.get(0);
	System.out.println(obj0);
	
	
	Object obj4 = list.get(4);
	System.out.println(obj4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
