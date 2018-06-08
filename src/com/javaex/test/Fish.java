package com.javaex.test;

public class Fish implements Walkable
{
	String name;
	
	public Fish(String a)
	{
		name = a;
	}
	
	@Override
	public void walk()
	{
		System.out.println("수영");
	}
	
}
