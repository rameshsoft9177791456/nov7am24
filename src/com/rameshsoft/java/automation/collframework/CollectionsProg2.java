package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CollectionsProg2 {
public static void main(String[] args) {
	
	int[] in = {456,56,4,5,1,456456456,91456,456456,95};
	
	
	TreeSet set = new TreeSet();
	
	for(int i=0; i<in.length; i++)
	{
		set.add(in[i]);
	}
	System.out.println(set);
	
	List list = new ArrayList<>(set);
	
	Object minVal = list.get(0);
	System.out.println("Min value is: "+minVal);
	
	Object maxVal = list.get(list.size()-1);
	System.out.println("Max value is: "+maxVal);
	
	//Find the sum of int array
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
