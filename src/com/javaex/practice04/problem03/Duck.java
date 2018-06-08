package com.javaex.practice04.problem03;

public class Duck extends Bird
{
	public void showName()
	{
		System.out.println("오리의 이름은 꽥꽥이 입니다.");
	}
		
	@Override
	public void fly()
	{
		System.out.printf("오리(%s)가 날지 않습니다.\n", super.getName());
	}
	
	@Override
	public void sing()
	{
		System.out.printf("오리(%s)가 소리내어 웁니다.\n", super.getName());
	}
}
