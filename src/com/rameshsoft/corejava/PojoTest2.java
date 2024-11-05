package com.rameshsoft.corejava;

class PojoProg2
{
	private int practHrs;
	private String res;
	private static double salary;
	
	public void setPractHrs(int practHrs)
	{
		this.practHrs = practHrs;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void setRes(String res)
	{
		this.res = res;
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

public class PojoTest2 {
public static void main(String[] args) {
	
	PojoProg2 pojo = new PojoProg2();
	pojo.setPractHrs(9);
	pojo.setSalary(145000);
	pojo.setRes("JOB");
	
	System.out.println(pojo.getPractHrs());
	System.out.println(pojo.getRes());
	System.out.println(pojo.getSalary());
	
}
}
