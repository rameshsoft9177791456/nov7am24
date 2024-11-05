package com.rameshsoft.corejava;

class Encapsulation
{
	private int practHrs = 9;
	private String res = "JOB";
	
	public void hardwork() {
		System.out.println(practHrs+"  =  "+res);
	}
	
	public int getPractHrs() {
		return practHrs;
	}
	public String getRes() {
		return res;
	}
	
}
public class EncapsulationProg {
public static void main(String[] args) {
	Encapsulation encap = new Encapsulation();
	System.out.println(encap.getPractHrs());
	System.out.println(encap.getRes());
	encap.hardwork();
	
	
}
}
