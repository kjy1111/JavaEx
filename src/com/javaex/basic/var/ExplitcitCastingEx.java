package com.javaex.basic.var;

public class ExplitcitCastingEx 
{
	public static void main(String[] args)
	{
		byte b = 0;
		int i = 2018;
		float f = 123.456F;
		
		b = (byte)i;
		
		System.out.println("int 2018 -> byte:" + b);
		
		i = (int)f;
		
		System.out.println("float" + f + "-> int:" + i);
	}

}
