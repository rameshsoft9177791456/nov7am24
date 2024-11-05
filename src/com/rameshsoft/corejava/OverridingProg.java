package com.rameshsoft.corejava;

class Parent
{
	final int num1 = 456;
	
	public void study() {
		System.out.println("PC: study()");
	}
	public void play() {
		System.out.println("PC: play()");
	}
	public void job() {
		System.out.println("PC: job()");
	}
	public void marriage() {
		System.out.println("PC: marriage()");
	}
}
class Child extends Parent
{
	public void study() {
		System.out.println("CC: Idon't study()");
	}
	public void friends() {
		System.out.println("CC: friends()");
	}
	@Override
	public void marriage() {
		System.out.println("CC:I go for love marriage()");
	}
	;;;;;;;;;;;;;;;;;;;;;;;;;//500 methods
}
public class OverridingProg {
public static void main(String[] args) {
	
	/*Parent parent = new Parent();
	parent.job();
	parent.marriage();
	parent.play();
	parent.study();*/
	
	/*Child child = new Child();
	child.job();
	child.marriage();
	child.play();
	child.study();
	child.friends();*/
	
	Parent parent = new Child();
	parent.job();
	parent.marriage();
	parent.play();
	parent.study();
	
	
	
}
}
