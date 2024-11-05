package com.rameshsoft.corejava;

public class OverloadingProg {
	
	public int addition(int num1,int num2) {
		int res = num1 + num2;
		System.out.println("int int Result is: "+res);
		return res;
	}
	
	public long addition(long num1,long num2) {
		long res = num1 + num2;
		System.out.println("long long Result is: "+res);
		return res;
	}
	
public static void main(String[] args) {
	
	OverloadingProg prog = new OverloadingProg();
	
	prog.addition(250,65);
	//prog.addition(900.50, 2000.50);
	//prog.addition(250.50f, 450.50f);
	prog.addition(900l, 5000l);
	prog.addition('a', 'b');
	//prog.addition(250.50f, 450.50f);
	
	
	
	
	
	
	
}
}

