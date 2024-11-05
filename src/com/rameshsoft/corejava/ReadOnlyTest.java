package com.rameshsoft.corejava;

abstract class ReadOnlyProg
{
	static int practHrs = 9;
	static String res = "JOB";
	
	static public void hardwork() {
		System.out.println(practHrs+"  =  "+res);
	}
}
public class ReadOnlyTest{
	
public static void main(String[] args) {
	System.out.println(ReadOnlyProg.practHrs);
	System.out.println(ReadOnlyProg.res);
	ReadOnlyProg.hardwork();
}
}
