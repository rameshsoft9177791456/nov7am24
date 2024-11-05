package com.rameshsoft.corejava;

class ConstructorsProg3
{
	int practHrs;
	String res;
	
	public ConstructorsProg3(int practHrs,String res)
	{
		this.practHrs = practHrs;
		this.res = res;
	}
	public void hardwork() {
		System.out.println(practHrs+" = "+res);
	}
}
public class ConstructorsTest3 {
public static void main(String[] args) {
	
	ConstructorsProg3 prog = new ConstructorsProg3(9,"JOB");
	prog.hardwork();
	
	
	
}
}
