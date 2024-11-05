package com.rameshsoft.corejava;

class PojoProg3
{
	private int practHrs;
	private String res;
	private static double salary;
	
	public void setPractHrs(int hrs)
	{
		this.practHrs = hrs;
	}
	public void setSalary(double sal)
	{
		this.salary = sal;
	}
	public void setRes(String result)
	{
		this.res = result;
	}
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

public class PojoTest3 {
public static void main(String[] args) {
	
	PojoProg3 pojo = new PojoProg3();
	pojo.setPractHrs(9);
	pojo.setSalary(145000);
	pojo.setRes("JOB");
	
	System.out.println(pojo.getPractHrs());
	System.out.println(pojo.getRes());
	System.out.println(pojo.getSalary());
	
}
}
