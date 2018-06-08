package com.javaex.practice04.problem03;

public abstract class Bird 
{
	protected String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract void showName();
	public abstract void sing();
	public abstract void fly();
}
