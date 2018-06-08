package com.javaex.Practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		float average = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		sc.close();
		average = sum / 5;
		
		System.out.printf("평균은 %.1f 입니다.\n", average);

	}

}
