package com.javaex.practice03.problem05;

public class StringUtilApp {

	public static void main(String[] args) 
	{
		String[] s = {"SuperMan", "BatMan", "SpiderMan"};
		String  result = StringUtil.connectString(s);
		
		System.out.println("결과 문자열:" + result);
		
	}

}
