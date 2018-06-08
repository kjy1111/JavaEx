package com.javaex.api.arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) 
	{
		int[] scores = {23, 12, 54, 67, 99, 50, 1};
		System.out.println(Arrays.toString(scores));
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
	}

}
