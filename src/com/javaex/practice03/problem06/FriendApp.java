package com.javaex.practice03.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) 
	{
		Friend[] info = new Friend[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 입력해 주세요.");
		
		for(int i = 0; i < info.length; i++)
		{
			info[i] = new Friend();
			info[i].name = sc.next();
			info[i].phon = sc.next();
			info[i].school = sc.next();
		}
		
		for(int i = 0; i < info.length; i++)
		{
			info[i].show();
		}
		
		sc.close();
			
	}

}
