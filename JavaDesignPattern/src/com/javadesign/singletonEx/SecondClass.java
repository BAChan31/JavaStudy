package com.javadesign.singletonEx;

public class SecondClass {

	public SecondClass(){
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		
		System.out.println("SecondClass");
		System.out.println(singletonClass.geti());
	}
}
