package com.javaex.api.generic.ex02;

// Generic 이용

public class Box<T> 
{
	T content;
	
	public T getContent()
	{
		return content;
	}
	
	public void setContent(T content)
	{
		this.content = content;
	}
}
