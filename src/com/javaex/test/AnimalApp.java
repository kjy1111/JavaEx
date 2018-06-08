package com.javaex.test;

import com.javaex.oop.shape.v2.Drawable;

public class AnimalApp {

	public static void main(String[] args) 
	{
		Dog d = new Dog("진돗개");
		d.walk();
		
		Cat c = new Cat("샴");
		c.walk();
		
		Fish f = new Fish("니모");
		f.walk();
		
		Walkable obj = d;
		
		if(obj instanceof Walkable)
		{
			obj.walk();
		}
		
		obj = c;
		
		if(obj instanceof Walkable)
		{
			obj.walk();
		}
		
		printObject(obj);

	}

	private static void printObject(Walkable obj) 
	{
		obj.walk();
		
	}

}
