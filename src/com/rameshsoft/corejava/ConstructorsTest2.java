package com.rameshsoft.corejava;

class ConstructorsProg2
{
	int practHrs;
	String res;
	
	public ConstructorsProg2(int hrs,String result)
	{
		practHrs = hrs;
		res = result;
	}
	public void hardwork() {
		System.out.println(practHrs+" = "+res);
	}
}
public class ConstructorsTest2 {
public static void main(String[] args) {
	
	ConstructorsProg2 prog = new ConstructorsProg2(9,"JOB");
	prog.hardwork();
	
	
	
	
	
	
	
	
	
	
	
}
}






