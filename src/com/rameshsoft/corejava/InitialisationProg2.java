package com.rameshsoft.corejava;

import java.util.Scanner;

public class InitialisationProg2 {
	
	int practHrs;
	String res;
	
	public void hardwork() {
		System.out.println(practHrs+"  =  "+res);
	}
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your practice hours");
	int hrs = scanner.nextInt();
	
	System.out.println("Your result is");
	String result = scanner.next();
	System.out.println(hrs+"  =  "+result);
	scanner.close();
	InitialisationProg2 prog = new InitialisationProg2();
	
	prog.practHrs = hrs;
	prog.res = result;
	
	prog.hardwork();
	
	
	
	
}
}
