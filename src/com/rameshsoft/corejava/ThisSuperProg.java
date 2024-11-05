package com.rameshsoft.corejava;

class ThisSuperProgram
{
	int practHrs = 15;
	String res = "JOBS";
	public void hardwork() {
		System.out.println(practHrs+"  =  "+res);
	}
}

public class ThisSuperProg extends ThisSuperProgram{
	int practHrs = 9;
	String res = "JOB";
	
	public void job() {
		System.out.println("JOB");
	}
	public void hardwork() {
		int practHrs = 5;
		String res = "Do hardwork";
		System.out.println(practHrs+"  =  "+res); //5 Do hardwork
		System.out.println(this.practHrs+"  =  "+this.res); // 9 JOB
		System.out.println(super.practHrs+"  =  "+super.res); // 15 JOBS
		super.hardwork();
		this.job();
	}
	
public static void main(String[] args) {
	
	ThisSuperProg prog = new ThisSuperProg();
	prog.hardwork();
	
	
}
}
