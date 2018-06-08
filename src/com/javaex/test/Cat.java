package com.javaex.test;

public class Cat extends Animal implements Walkable
{
	public Cat(String a)
	{
		super(a);
	}
	
	@Override
	public void live()
	{
		System.out.println("땅");
	}
	
	@Override
	public void walk()
	{
		System.out.println("걷다");
	}
}
