package com.javaex.practice03.problem07;

import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Account ac = new Account("312-89562-123456");
		int money;
		
		System.out.printf("%s 계좌가 개설되었습니다.\n\n", ac.name);
		
		
		do
		{
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			int num;
						
			System.out.print("선택>");
			num = sc.nextInt();
			
			switch(num)
			{
			case 1:
				System.out.print("예금액>");
				money = sc.nextInt();
				ac.input(money);
				continue;
			case 2:
				System.out.print("출금액>");
				money = sc.nextInt();
				ac.output(money);
				continue;
			case 3:
				System.out.printf("잔고액>%d\n", ac.balance());
				continue;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}
			break;
		}while(true);
		
		sc.close();

	}

}
