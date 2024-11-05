package com.rameshsoft.corejava;

@FunctionalInterface
interface JobHardwork
{
	void practice();
	public static void cashDeposit()
	{
		System.out.println("ISM: cashDeposit()");
	}
}
@FunctionalInterface
interface JobHardwork1 extends JobHardwork
{
	void practice();
	public static void cashDeposit()
	{
		System.out.println("ISM: cashDeposit()");
	}
}

interface BankAtm
{
	String bankName = "AXIS BANK"; //public static final
	void miniStmt(); //public abstract
	public abstract void balEnq();
	public double cashWithdraw(); //abstract
	void pinChange(); //public abstract
	public static void cashDeposit()
	{
		System.out.println("ISM: cashDeposit()");
	}
	private void hello1() {
		System.out.println("JOB1");
	}
	private static void hello2() {
		System.out.println("JOB2");
	}
	default void job()
	{
		hello1();
		hello2();
		System.out.println("IDM: Doing 4 hrs practice");
	}	
}
abstract class BankAtmImpl implements BankAtm
{
	@Override
	public void miniStmt() {
		System.out.println("Mini stmt");
	}
	@Override
	public void balEnq() {
		System.out.println("Bal enq");
	}
	@Override
	public double cashWithdraw() {
		System.out.println("Cashwithdraw");
		return 456456;
	}
	public String bankName() {
		System.out.println("Bank name is:  AXIS");
		return "AXIS";
	}
	public void loans() {
		System.out.println("Loans");
	}
	public void job()
	{
		System.out.println("Doing 9 hrs practice");
	}
}
class BankAtmImplOne extends BankAtmImpl
{
	@Override
	public void pinChange() {
		System.out.println("Pin change");
	}
	public void accountCreation() {
		System.out.println("Account creation");
	}
}
public class InterfaceProg {
public static void main(String[] args) {
	//BankAtm atm = new BankAtm();
	//BankAtmImpl atm = new BankAtmImpl();
	/*BankAtmImplOne atm = new BankAtmImplOne();
	atm.accountCreation();
	atm.balEnq();
	atm.bankName();
	atm.cashWithdraw();
	atm.loans();
	atm.miniStmt();
	atm.pinChange();*/
	
	/*BankAtmImpl atm = new BankAtmImplOne();
	//atm.accountCreation();
	atm.balEnq();
	atm.bankName();
	atm.cashWithdraw();
	atm.loans();
	atm.miniStmt();
	atm.pinChange();*/
	
	BankAtm atm = new BankAtmImplOne();
	atm.balEnq();
	atm.cashWithdraw();
	atm.miniStmt();
	atm.pinChange();
	atm.job();
	
	BankAtm.cashDeposit();
	
	
}
}
