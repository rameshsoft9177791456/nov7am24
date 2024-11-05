package com.rameshsoft.corejava;

abstract class AbstractProg
{
	public void practice() {
		System.out.println("Practice is mandatory");
	}
	public void subject() {
		System.out.println("Subject first job next");
	}
	abstract public void job();
	public abstract void salary();
}
abstract class AbstractProgOne extends AbstractProg
{
	@Override
	public void job() {
		System.out.println("JOB");
	}
	public void hike() {
		System.out.println("HIKE");
	}
}
public class AbstractTest extends AbstractProgOne{
	@Override
	public void salary() {
		System.out.println("SALARY");
	}
	
	public void subjectFirstJobNext() {
		System.out.println("Subject first job next");
	}
	
public static void main(String[] args) {
	//AbstractProg prog = new AbstractProg();
	//AbstractProgOne one = new AbstractProgOne();
	AbstractTest test = new AbstractTest();
	test.hike();
	test.job();
	test.practice();
	test.salary();
	test.subject();
	test.subjectFirstJobNext();
	
	
}
}



