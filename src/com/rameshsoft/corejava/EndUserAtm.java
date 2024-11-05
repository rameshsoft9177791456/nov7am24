package com.rameshsoft.corejava;

public class EndUserAtm {
public static void main(String[] args) throws BankAtmException {
	int savingsAmount = 10000;
	int withdrawAmount = 20000;
	
	if (savingsAmount<withdrawAmount) {
		BankAtmException exception = new BankAtmException("Insuffient balance: you savings balance is: "+savingsAmount+" but u r ithdrawing: "+withdrawAmount);
		throw exception;
	}
	else {
		System.out.println("amount is withdrawn");
	}
}
}