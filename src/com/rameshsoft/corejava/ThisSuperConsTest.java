package com.rameshsoft.corejava;

class ThisSuperConsProg
{
	public ThisSuperConsProg()
	{
		super();
		System.out.println("PC: default constructor");
	}
}

public class ThisSuperConsTest extends ThisSuperConsProg{
	
	public ThisSuperConsTest()
	{
		this(9);
		System.out.println("CC: default constructor");
	}
	public ThisSuperConsTest(int i)
	{
		super();
		System.out.println("CC: 1 int constructor");
	}
	
public static void main(String[] args) {
	
	ThisSuperConsTest test = new ThisSuperConsTest();
	
	
}
}
