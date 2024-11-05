package com.rameshsoft.corejava;

class OuterOne
{
	int id = 456;
	static String name = "Practice";
	
	public void hardwork() {
		System.out.println("OC: Hardwork");
	}
	public static void job() {
		System.out.println("OC: Job");
	}
	class InnerOne
	{
		public void hardwork() {
			System.out.println("NSIC: Hardwork");
		}
	}
	static class InnerTwo
	{
		public void hardwork() {
			System.out.println("SIC: : Hardwork");
		}
		public static void job() {
			System.out.println("SIC: : Job");
		}
	}
}
public class InnerClassesProg {
public static void main(String[] args) {

	/*OuterOne one = new OuterOne();
	System.out.println(one.id);
	System.out.println(one.name);
	System.out.println(OuterOne.name);
	one.hardwork();
	one.job();
	OuterOne.job();*/
	
	/*OuterOne.InnerTwo.job();
	OuterOne.InnerTwo innerTwo = new OuterOne.InnerTwo();
	innerTwo.hardwork();
	*/
	
	OuterOne one = new OuterOne();
	OuterOne.InnerOne inn = one. new InnerOne();
	inn.hardwork();
	
	
	
	
	
}
}
