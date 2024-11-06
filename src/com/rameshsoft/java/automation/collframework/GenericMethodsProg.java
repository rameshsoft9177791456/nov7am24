package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericMethodsProg {
	
	public List hardwork() {
		List list = new ArrayList<>();
		for(int i=0; i<=5; i++)
		{
			list.add(i);
		}
		return list;
	}
	
	public Set<String> practice() {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("job");
		set.add("hardwork");
		set.add("subject");
		return set;
	}
	
	public void job(Map<String, Integer> map) {
		map.put("practice", 9);
		System.out.println(map);
	}
	
public static void main(String[] args) {
	GenericMethodsProg prog = new GenericMethodsProg();
	List list = prog.hardwork();
	System.out.println(list);
	
	Set<String> set = prog.practice();
	System.out.println(set);
	
	Map<String, Integer> map1 = new HashMap<String, Integer>();
	map1.put("java", 456);
	map1.put("selenium", 91456);
	map1.put("subject", 56);
	map1.put("job", 456456);
	
	prog.job(map1);
	
	
	
	
	
	
	
}
}

