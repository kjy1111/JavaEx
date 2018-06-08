package com.javaex.practice01;

public class Problem04 {

	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			for(int j = i; j <= 9 + i; j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
