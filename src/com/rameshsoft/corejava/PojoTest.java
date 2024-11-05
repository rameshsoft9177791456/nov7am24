package com.rameshsoft.corejava;

class PojoProg
{
	private int practHrs = 9;
	private String res = "JOB";
	private static double salary = 145000;
	
	public int getPractHrs()
	{
		return practHrs;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getRes()
	{
		return res;
	}
}

public class PojoTest {
public static void main(String[] args) {
	
	PojoProg pojo = new PojoProg();
	System.out.println(pojo.getPractHrs());
	System.out.println(pojo.getRes());
	System.out.println(pojo.getSalary());
	
}
}
