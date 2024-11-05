package com.rameshsoft.corejava;

public class ArraysProg {
public static void main(String[] args) {
	
	int a[] = new int[9];
	
	a[0] = 456;
	a[1] = 91456;
	a[2] = 56;
	a[3] = 6;
	a[4] = 91456;
	a[8] = 456;
	
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	
	String[] str = {"java","selenium","job","hardwork"};
	System.out.println("String[] length is: "+str.length);
	
	for(int i=0; i<str.length; i++)
	{
		System.out.println(str[i]);
	}
	
	
	
	
	
	
	
}
}
