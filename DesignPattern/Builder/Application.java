package com.christy.designpattern.Builder;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c = new ComputerBuilder().setBrand("Lenovo").setHarddisk(1000).getComputer();
		
		System.out.println(c);

	}

}
