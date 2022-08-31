package com.christy.designpattern.Builder;

public class ComputerBuilder {
	private String brand;
	private String os;
	private int ram;
	private int harddisk;
	private String processor;
	
	public ComputerBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public ComputerBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setHarddisk(int harddisk) {
		this.harddisk = harddisk;
		return this;
	}
	public ComputerBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Computer getComputer() {
		return new Computer(brand, os, ram, harddisk, processor);
	}

}
