package com.rameshsoft.seleniumadv;

import org.testng.annotations.Test;

public class Job2 {

	@Test(groups= {"reg","e2e","san"})
	public void practice1() {
		System.out.println("Job2: practice1");
	}
	
	@Test(groups= {"reg","e2e","san"})
	public void practice2() {
		System.out.println("Job2: practice2");
	}
}