package com.christy.designpattern.Builder;

public class Computer {
	
	private String brand;
	private String os;
	private int ram;
	private int harddisk;
	private String processor;
	public Computer(String barnd, String os, int ram, int harddisk, String processor) {
		super();
		this.brand = barnd;
		this.os = os;
		this.ram = ram;
		this.harddisk = harddisk;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", ram=" + ram + ", harddisk=" + harddisk + ", processor="
				+ processor + "]";
	}
	
	

}
