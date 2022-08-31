package com.christy.designpattern.ChainOfResponsibility;

public interface Chain {
	public void setNextChain(Chain nextChain);
	
	public void calculate(Numbers request);
 
}
