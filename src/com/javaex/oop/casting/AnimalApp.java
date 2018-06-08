package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) 
	{
		Animal dog1 = new Dog("Snoopy");	// Upcasting
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();	// 못해요
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// 다운캐스팅: 명시적으로 타입을 지정
		((Dog)dog1).bark();
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
//		pet.bark();
		
		if(pet instanceof Dog)
		{
			((Dog)pet).bark();
		}
		else if(pet instanceof Cat)
		{
			((Cat)pet).meow();
		}
		
	}

}
