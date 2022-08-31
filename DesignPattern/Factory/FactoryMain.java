package com.christy.designpattern.Factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Open");
		obj.spec();

	}

}
