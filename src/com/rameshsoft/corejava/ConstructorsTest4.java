package com.rameshsoft.corejava;

class ConstructorsProg4
{
	int practHrs;
	String res;
	
	public ConstructorsProg4(int practHrs,String res)
	{
		this.practHrs = practHrs;
		this.res = res;
		System.out.println("parameterised constructor");
	}
	public ConstructorsProg4()
	{
		System.out.println("default constructor");
	}
	public ConstructorsProg4(int id)
	{
		System.out.println("int constructor");
	}
	public void hardwork() {
		System.out.println(practHrs+" = "+res);
	}
}
public class ConstructorsTest4 {
public static void main(String[] args) {
	
	ConstructorsProg4 prog = new ConstructorsProg4('a',"JOB");
	prog.hardwork();
	
	
	
}
}
