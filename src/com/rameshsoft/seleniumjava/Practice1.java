package com.rameshsoft.seleniumjava;

import org.testng.annotations.Test;

public class Practice1 {

	@Test(groups= {"e2e"})
	public void practice1() {
		System.out.println("Practice1: practice1");
	}
	
	@Test(groups= {"reg","e2e","san"})
	public void practice2() {
		System.out.println("Practice1: practice2");
	}
}