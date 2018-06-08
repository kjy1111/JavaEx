package com.javaex.api.arrays;

import java.util.Arrays;

public class SerchEx {

	public static void main(String[] args) 
	{
		// 기본형 검색
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int index = Arrays.binarySearch(num, 7);
		System.out.println("6의 인덱스:" + index);
				
		// String 검색
		// 확인 필요
		String[] str = {"Java", "C", "C++", "Python", "Linux"};
		
		Arrays.sort(str); // binarySearch는 소트를 먼저 해야 한다.
		System.out.println(Arrays.toString(str));
		
		int index2 = Arrays.binarySearch(str, "Linux");
		System.out.println("인덱스: " + index2);

	}

}
