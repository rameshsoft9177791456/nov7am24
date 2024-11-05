package com.rameshsoft.java.automation.collframework;

import java.util.HashSet;
import java.util.Set;

public class ForEachCollProg {
public static void main(String[] args) {
	
	Set set = new HashSet<>();
	set.add("java");
	set.add("job");
	set.add("java");
	set.add("hardwork");
	set.add("hardwork");
	set.add("java");
	
	for(Object obj : set)
	{
		String str = (String) obj;
		if (str.contains("ja")) {
			System.out.println("   Do practice");
		}
		System.out.println(str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
