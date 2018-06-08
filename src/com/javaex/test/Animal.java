package com.javaex.test;

public abstract class Animal 
{
	String name;
	
	public Animal(String a)
	{
		name = a;
	}
	
	public abstract void live();
}
