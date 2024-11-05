package com.rameshsoft.corejava;

public class BalWithDraw {

	public static void main(String[] args) throws InSufficientFundsException {
		
		double savingsAmount = 25000;
		
		int withDrawAmount = 50000;
		
		if (savingsAmount>withDrawAmount) {
			System.out.println("You can with draw the amount");
		}
		else {
			InSufficientFundsException exception = new InSufficientFundsException("You don't have sufficient amount: & your savings amount is: "+savingsAmount+" but u r withdrawing: "+withDrawAmount);
			throw exception;
		}
		
	}
	
}
