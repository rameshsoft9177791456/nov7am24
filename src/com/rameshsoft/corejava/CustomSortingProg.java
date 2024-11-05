package com.rameshsoft.corejava;

import java.util.Comparator;
import java.util.TreeSet;

class CustSort implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (int) o1;
		Integer i2 = (int) o2;
		//return i1.compareTo(i2); asc
		//return -i1.compareTo(i2); desc
		//return i2.compareTo(i1); desc
		return -i2.compareTo(i1); //asc
	}	
}
public class CustomSortingProg {
public static void main(String[] args) {
	CustSort custSort = new CustSort();
	
	TreeSet set = new TreeSet(custSort);
	set.add(456);
	set.add(56);
	set.add(456456);
	set.add(1);
	set.add(5);
	System.out.println(set);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
