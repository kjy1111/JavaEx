package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) 
	{
		Queue<Integer> queue = new LinkedList<>();	// Queue가 인터페이스라서 객체 생성이 안되어 링크드리스트를 불러와 대신 사용
		
		// 데이터를 제공해 봅시다
		for(int i = 0; i < 10; i++)
		{
			queue.offer(i);
		}
		
		System.out.println(queue);
		
		System.out.println(queue.poll());	// 인출
		System.out.println(queue);
		System.out.println(queue.peek());	// 삭제는 안함
		System.out.println(queue);
		
		// poll을 할 때는 empty로 체크 해주세요
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}

	}

}
