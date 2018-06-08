package com.javaex.practice03.problem08;

public class Book 
{
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	public Book(int bookNo, String title, String author)
	{
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	
	public void rent()
	{
		if(stateCode == 1)
		{
			System.out.printf("%s이(가) 대여 되었습니다.\n", title);
			stateCode = 0;			
		}
		else if(stateCode == 0)
		{
			System.out.println("이미 대여중인 책입니다.");
		}
		
	}
	
	public void print()
	{
		if(stateCode == 1)
		{
			String state1 = "재고있음";
			System.out.printf("%d. 책 제목: %s, 작가: %s, 대여 유무: %s \n", bookNo, title, author, state1);
		}
		else if(stateCode == 0)
		{
			String state2 = "대여중";
			System.out.printf("%d. 책 제목: %s, 작가: %s, 대여 유무: %s \n", bookNo, title, author, state2);
			
		}
		
	}
}
