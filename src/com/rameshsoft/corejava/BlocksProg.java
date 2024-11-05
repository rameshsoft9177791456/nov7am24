package com.rameshsoft.corejava;

class BlocksProg1
{
	static
	{
		System.out.println("PC: SB1");
	}
	static
	{
		System.out.println("PC: SB2");
	}
}

public class BlocksProg extends BlocksProg1{
	
	static
	{
		System.out.println("CC: SB1");
	}
	static
	{
		System.out.println("CC: SB2");
	}
	
public static void main(String[] args) {
	
	System.out.println("main() method");
	
	
	
}
}
