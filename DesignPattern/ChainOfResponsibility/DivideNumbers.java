package com.christy.designpattern.ChainOfResponsibility;

public class DivideNumbers implements Chain{
	
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getCalculationWanted() == "div") {
			System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1()/request.getNumber2()));
		}else {
			System.out.println("Only work for add, sub, mul and div");
		}
	}

}

