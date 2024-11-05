package com.rameshsoft.corejava;

interface One
{
	void hardwork();
	void job();
	
	interface Two
	{
		void practice();
		void job();
	}
}
class OneTwoImpl implements One,One.Two
{
	@Override
	public void hardwork() {
		System.out.println("hardwork");
	}
	@Override
	public void job() {
		System.out.println("job");
	}
	@Override
	public void practice() {
		System.out.println("practice");
	}
}
class OneImpl implements One
{
	@Override
	public void hardwork() {
		System.out.println("hardwork");
	}
	@Override
	public void job() {
		System.out.println("job");
	}
}
class TwoImpl implements One.Two{

	@Override
	public void practice() {
		System.out.println("practice");
	}
	@Override
	public void job() {
		System.out.println("job");
	}
}
public class InnerInterfaceProg {
public static void main(String[] args) {
	
	/*OneTwoImpl one = new OneTwoImpl();
	one.hardwork();
	one.job();
	one.practice();*/
	
	One one = new OneTwoImpl();
	one.hardwork();
	one.job();
	
	One.Two two = new OneTwoImpl();
	//two.hardwork();
	two.job();
	two.practice();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
