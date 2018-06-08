package com.javaex.practice04.problem01;

public class Depart extends Employee
{
	String department;
	
	public Depart(String n, int m, String d)
	{
		super(n, m);
		this.department = d;
	}
	
	@Override
	public void getInfomation()
	{
		System.out.printf("이름:%s 연봉:%d 부서:%s", getName(), getSalary(), department);
	}
}
