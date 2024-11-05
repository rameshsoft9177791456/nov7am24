package com.rameshsoft.java.automation.collframework;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapProg {
public static void main(String[] args) {
	
	//Map map = new IdentityHashMap();
	
	IdentityHashMap map = new IdentityHashMap();
	
	map.put("java", "practice");
	map.put(456, "job");
	map.put("java", "JAVA SELENIUM JOB");
	map.put(null, null);
	map.put(456.456, 456456);
	map.put('s', "kids");
	map.put("Bhavani", "Ayyappa");
	
	System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
