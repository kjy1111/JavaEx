package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(true)
		{
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			int num = 0;
									
			System.out.print("선택>");
			num = sc.nextInt();		
			
			switch(num)
			{
			case 1:
				System.out.print("예금액>");
				a = sc.nextInt();
				continue;
			case 2:
				System.out.print("출금액>");
				b = sc.nextInt();
				continue;
			case 3:
				System.out.print("잔고액>");
				if(a >= b)
				{
					c = a - b;
				}
				else
				{
					c = b - a;
				}
				System.out.println(c);
				continue;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}
			break;

		}
		sc.close();	

	}

}
