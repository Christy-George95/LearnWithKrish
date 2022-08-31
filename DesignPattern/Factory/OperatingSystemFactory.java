package com.christy.designpattern.Factory;

public class OperatingSystemFactory {
	
	public OS getInstance(String str) {
		if(str.equals("Open")) {
			return new Mac();
		}
		else if(str.equals("Clsoed")) {
			return new Linux();
		}
		else {
			return new Windows();
		}
	}

}
