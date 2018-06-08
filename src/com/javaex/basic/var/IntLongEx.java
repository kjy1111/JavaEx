package com.javaex.basic.var;

public class IntLongEx 
{
	public static void main(String[] args)
	{
		// int 변수의 선언
		int intVar1 = 0;
		int intVar2 = 0;
		
		intVar1 = 2018;
//		intVar2 = 1234567890123;	// out of range
		
		System.out.println(intVar1);
		
		// long 변수의 선언
		long longVar1 = 0;
		long longVar2 = 0;
		
		longVar1 = 2018;
		longVar2 = 1234567890123L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		// 2진수, 8진수, 16진수
		int bin = 0;
		int oct = 0;
		int hex = 0;
		
		bin = 0b1100;	// 2진수 0b
		oct = 072;		// 8진수 0
		hex = 0xFF;		// 16진수 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}

}
