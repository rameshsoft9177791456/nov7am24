package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsProg {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("java");
	
	for(String str : list)
	{
		System.out.println(str);
	}
	
	Set<Integer> set = new HashSet<Integer>();
	set.add(456);
	set.add(56);
	set.add(6);
	set.add(456);
	set.add(456456);
	
	Iterator<Integer> itr = set.iterator();
	
	while(itr.hasNext())
	{
		Integer i = itr.next();
		System.out.println(i);
	}
	
	
	Map<String, String> map = new HashMap<String, String>();
	map.put("hello", "practice");
	map.put("java", "selenium");
	map.put("job", "hardwork");
	map.put("subject", "java");
	System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
