package com.javaex.exception;

import java.io.IOException;

public class ThrowsExcept 
{
	public void executeException() throws IOException
	{
		System.out.println("강제 예외 발생");
		throw new IOException("강제 예외");		//컴파일러가 체크해 줘야하는
	}
	
	public void executeRuntimeException()
	{
		System.out.println("런타임 오류");
		throw new RuntimeException("RuntimeException Exception");
	}
	
	public double divide(int num1, int num2)
	{
		if(num2 == 0)
		{
			throw new ArithmeticException();
		}
		return num1 / num2;
	}

}
