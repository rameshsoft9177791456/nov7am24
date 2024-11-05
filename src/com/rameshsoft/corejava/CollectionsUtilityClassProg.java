package com.rameshsoft.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityClassProg {
public static void main(String[] args) {
	
	List list = new ArrayList();
	
	list.add("java");
	list.add("abc");
	list.add("selenium");
	list.add("hardwork");
	
	System.out.println(list);
	
	
	Collections.sort(list);
	
	System.out.println(list);
	
	
	int status = Collections.binarySearch(list, "java456");
	
	System.out.println(status);
	
	if (status>=0) {
		System.out.println("Key|value is available in that List");
	}
	else {
		System.out.println("Key|value is NOT available in that List");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
