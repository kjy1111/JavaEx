package com.javaex.collection.hash;

import java.util.HashSet;

class SimpleNum
{
	int num;
	
	public SimpleNum(int num)
	{
		this.num = num;
	}

	@Override
	public String toString() 
	{
		return String.valueOf(num);
	}

	// hashCode, equals를 오버라이드
	@Override
	public int hashCode() 
	{
//		return super.hashCode();
//		return num % 10;
		return num % 2;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof SimpleNum)
		{
			SimpleNum other = (SimpleNum)obj;
			return num == other.num;
		}
		return super.equals(obj);
	}
	
}

public class HashSetEx2 {

	public static void main(String[] args) 
	{
		HashSet<SimpleNum> hs = new HashSet<>();
		
		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);
		
		// 다른 객체라 판단(메모리 주소가 각각 다름)하여 중복 사용 허용
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		System.out.println(s2.equals(s3));

	}

}
