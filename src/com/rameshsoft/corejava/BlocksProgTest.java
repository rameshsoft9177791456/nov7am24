package com.rameshsoft.corejava;

class BlocksProgTest1
{
	{
		System.out.println("PC: IB");
	}
	static
	{
		System.out.println("PC: SB");
	}
	public BlocksProgTest1()
	{
		System.out.println("PC: DC");
	}
}

public class BlocksProgTest extends BlocksProgTest1{
	
	public BlocksProgTest()
	{
		System.out.println("PC: DC");
	}
	{
		System.out.println("CC: IB");
	}
	static
	{
		System.out.println("CC: SB");
	}
public static void main(String[] args) {
	
	System.out.println("main() method");
	BlocksProgTest test = new BlocksProgTest();
	
	
	
	
	
	
	
	
	
	
	
}
}