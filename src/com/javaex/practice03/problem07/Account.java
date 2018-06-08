package com.javaex.practice03.problem07;

public class Account 
{
	String name;
	int input;
	int output;
	int balance;
	
	public Account(String n)
	{
		this.name = n;
	}
	
	public void input(int i)
	{
		this.input += i;
	}
	
	public void output(int o)
	{
		this.output += o;
	}
	
	public int balance()
	{
		balance = input - output;
		return balance;
	}
}
