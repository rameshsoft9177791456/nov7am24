package com.rameshsoft.corejava;

public class ImmutableMutableProg {
public static void main(String[] args) {
	
	
	
	StringBuilder sb1 = new StringBuilder("java");
	
	StringBuilder sb2 = sb1.append("job");
	
	System.out.println(sb1.hashCode());
	System.out.println(sb2.hashCode());
	
	System.out.println(sb1.toString());
	System.out.println(sb2.toString());
	
	
	
	
	
	
	
	
	
	
	
	
	/*String s1 = new String("java");
	
	String s2 = s1.concat("job");
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	if (s1.hashCode() == s2.hashCode()) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	}
	
	System.out.println(s1.toString());
	System.out.println(s1);
	
	System.out.println(s2.toString());
	System.out.println(s2);*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
