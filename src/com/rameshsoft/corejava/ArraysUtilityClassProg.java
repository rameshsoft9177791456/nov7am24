package com.rameshsoft.corejava;

import java.util.Arrays;
import java.util.List;

public class ArraysUtilityClassProg {
public static void main(String[] args) {
	
	String[] str = {"java","selenium","abc","hardwork","hike"};
	
	for(String str1 : str)
	{
		System.out.println(str1);
	}
	
	
	Arrays.sort(str);
	
	System.out.println("********************** after sorting **********************");
	
	for(String str1 : str)
	{
		System.out.println(str1);
	}
	
	
	int status = Arrays.binarySearch(str, "hardwork456");
	System.out.println(status);
	
	if (status>=0) {
		System.out.println("Yes key|value is available in that array");
	}
	else {
		System.out.println("Yes key|value is NOT available in that array");
	}
	
	List list = Arrays.asList(str);
	System.out.println(list);
	
	
	
	
	
	
}
}
