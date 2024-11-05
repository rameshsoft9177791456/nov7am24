package com.rameshsoft.seleniumjava;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersProg {
	
	@Parameters({"practHrs","res"})
	@Test(invocationCount=5)
	public void hardwork(@Optional("6")String practHrs,@Optional("JOBSSSS")String res) {
		System.out.println("Practice = JOB: "+practHrs+" = "+res);
	}
	
}
