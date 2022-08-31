package com.christy.designpattern.Singleton;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonA singletonA = SingletonA.getSingletonA();
		System.out.println(singletonA);
		
		SingletonA singletonA1 = SingletonA.getSingletonA();
		System.out.println(singletonA);

	}

}
