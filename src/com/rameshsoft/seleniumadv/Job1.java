package com.rameshsoft.seleniumadv;

import org.testng.annotations.Test;

public class Job1 {

	@Test(groups= {"reg","e2e"})
	public void practice1() {
		System.out.println("Job1: practice1");
	}
	
	@Test(groups= {"e2e"})
	public void practice2() {
		System.out.println("Job1: practice2");
	}
}