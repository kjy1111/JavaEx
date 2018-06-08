package com.javaex.practice04.problem03;

public class Sparrow extends Bird
{
	public void showName()
	{
		System.out.println("참새의 이름은 짹짹이 입니다.");
	}
	
	@Override
	public void fly()
	{
		System.out.printf("참새(%s)가 날지 않습니다.\n", super.getName());
	}
	
	@Override
	public void sing()
	{
		System.out.printf("참새(%s)가 소리내어 웁니다.\n", super.getName());
	}
}
