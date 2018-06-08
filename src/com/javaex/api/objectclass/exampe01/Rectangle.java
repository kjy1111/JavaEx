package com.javaex.api.objectclass.exampe01;

public class Rectangle 
{
	int width = 0;
	int height = 0;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	
	public int getArea()
	{
		return width * height;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Rectangle)
		{
			Rectangle other = (Rectangle)obj;
			return getArea() == other.width * other.height;
		}
		return super.equals(obj);
	}

}
