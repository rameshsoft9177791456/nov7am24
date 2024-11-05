package com.rameshsoft.corejava;

class ExamProg
{
	public void job() {
		System.out.println("PC: JOB");
	}
	static public void hardwork() {
		System.out.println("PC: HARDWORK");
	}
}
public class ExamTest extends ExamProg{
	@Override
	public void job() {
		System.out.println("CC: JOB");
	}
	
	static public void hardwork() {
		System.out.println("CC: HARDWORK");
	}
	
public static void main(String[] args) {
	
	//ExamProg prog = new ExamProg();
	
	ExamProg prog = new ExamTest();
	prog.job(); //Overriding method
	prog.hardwork(); //method hiding
	
	
	
	
	
}
}
