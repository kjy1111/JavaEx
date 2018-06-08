package com.javaex.practice03.problem05;

public class StringUtil 
{
	public static String connectString(String[] s)
	{
		String r = "";
		
		for(int i = 0; i < s.length; i++)
		{
			r += s[i];
		}
		
		return r;
		
	}
}
