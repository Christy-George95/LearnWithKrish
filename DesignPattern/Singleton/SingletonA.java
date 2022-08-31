package com.christy.designpattern.Singleton;

public class SingletonA {
	private static volatile SingletonA singletonA;
	
	private SingletonA() {
		if(singletonA != null) {
			throw new RuntimeException("Please use getSingletonA method");
		}
	}

	public static SingletonA getSingletonA() {
		if(singletonA == null) {
			synchronized (SingletonA.class) {
				if(singletonA == null) {
					singletonA = new SingletonA();
				}
			}
		}
		return singletonA;
	}

	
	

}
