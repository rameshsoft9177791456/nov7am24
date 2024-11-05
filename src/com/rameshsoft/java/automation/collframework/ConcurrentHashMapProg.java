package com.rameshsoft.java.automation.collframework;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import lombok.val;

public class ConcurrentHashMapProg {
public static void main(String[] args) {
	
	//Map map = new ConcurrentHashMap();
	
	ConcurrentHashMap map = new ConcurrentHashMap();
	
	map.put("java", "practice");
	map.put(456, "job");
	map.put("java", "JAVA SELENIUM JOB");
	//map.put(null, null);
	//map.put(null, "jobs");
	//map.put("hello", null);
	map.put(456.456, 456456);
	map.put('s', "kids");
	map.put("Bhavani", "Ayyappa");
	
	System.out.println(map);
	
	Object obj1 = map.get("java");
	System.out.println(obj1);
	
	Object obj2 = map.getOrDefault("java4", "JOB");
	System.out.println(obj2);
	
	boolean status = map.containsKey("java");
	System.out.println(status);
	
	boolean status1 = map.containsValue("java");
	System.out.println(status1);
	
	Set setKeys = map.keySet();
	System.out.println(setKeys);
	
	for(Object obj : setKeys)
	{
		System.out.println(obj);
	}
	
	Set entries = map.entrySet();
	System.out.println(entries);
	
	Collection values = map.values();
	System.out.println(values);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
