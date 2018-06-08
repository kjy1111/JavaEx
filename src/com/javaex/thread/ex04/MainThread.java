package com.javaex.thread.ex04;

public class MainThread {

	public static void main(String[] args) 
	{
		// 쓰레드를 불러와 실행
//		Thread thread = new DigitThread();
		Thread thread = new Thread(new DigitThread());
		Thread thread2 = new Thread(new AlphabetThread());
		
		thread.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		// 쓰레드의 시작
		thread.start();
		thread2.start();
				
		// thread와 thread2를 메인 쓰레드의 흐름에 합류
		try 
		{
			thread.join();
			thread2.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드의 종료");
	}	

}
