package com.rameshsoft.corejava;

public class BankAtmException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankAtmException()
	{
		super();
	}
	
	public BankAtmException(String msg)
	{
		super(msg);
	}
	
}