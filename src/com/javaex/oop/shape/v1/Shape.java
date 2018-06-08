package com.javaex.oop.shape.v1;

public abstract class Shape 
{
	// 필드
	protected int x = 0;
	protected int y = 0;
	
	// 생성자
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	// 추상 메서드 선언
	public abstract void draw();
	public abstract double area();

}
