package com.rameshsoft.corejava;


public class InSufficientFundsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InSufficientFundsException()
	{
		super();
	}
	
	public InSufficientFundsException(String exceptionMsg)
	{
		super(exceptionMsg);
	}
	
}
