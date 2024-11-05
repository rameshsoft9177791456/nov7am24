package com.rameshsoft.java.automation.collframework;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class VectorProg {
public static void main(String[] args) {
	
	//Collection collection = new Vector();
	//List list = new Vector();
	Vector vector = new Vector();
	
	vector.add("java");
	vector.add("abc");
	vector.add("java");
	vector.add(null);
	vector.add("job");
	vector.add("java");
	vector.add(0, "JOBS");
	vector.addElement("practice");
	
	System.out.println(vector);
	
	
	
	
	
	
	
	
	
}
}
