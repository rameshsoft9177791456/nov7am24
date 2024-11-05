package com.rameshsoft.corejava;

public class InitialisationProg1 {
	
	int practHrs;
	String res;
	
	public void hardwork() {
		System.out.println(practHrs+"  =  "+res);
	}
	
public static void main(String[] args) {
	
	InitialisationProg1 prog = new InitialisationProg1();
	prog.practHrs = 9;
	prog.res = "JOB";
	prog.hardwork();
	
	InitialisationProg1 prog1 = new InitialisationProg1();
	prog1.practHrs = 12;
	prog1.res = "JOBS";
	prog1.hardwork();
	
	
}
}
