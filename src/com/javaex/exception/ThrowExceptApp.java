package com.javaex.exception;

import java.io.IOException;

public class ThrowExceptApp {

	public static void main(String[] args) 
	{
		ThrowsExcept ex = new ThrowsExcept();
		try
		{
			ex.executeException();
			ex.executeRuntimeException();
		}
		catch(RuntimeException e)
		{
			System.out.println("Message:" + e.getMessage());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			System.out.println(ex.divide(100, 0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 못 나눈다고!!");
		}

	}

}
