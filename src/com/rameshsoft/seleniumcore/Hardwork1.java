package com.rameshsoft.seleniumcore;

import org.testng.annotations.Test;

public class Hardwork1 {

	@Test(groups= {"reg"})
	public void job1() {
		System.out.println("Hardwork1: job1");
	}
	
	@Test(groups= {"e2e"})
	public void job2() {
		System.out.println("Hardwork1: job2");
	}
}