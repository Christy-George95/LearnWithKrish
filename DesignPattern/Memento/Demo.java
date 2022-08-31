package com.christy.designpattern.Memento;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.set("Article 1");
		originator.set("Article 2");
		caretaker.addMemento(originator.storeInMemento());
		
		originator.set("Article 3");
		caretaker.addMemento(originator.storeInMemento());
		
		originator.set("Article 4");
		System.out.println("Current State: "+originator.get());
		
		originator.restoreFromMemento(caretaker.getMemento(0));
		System.out.println("First saved Article: "+originator.get());
		
		originator.restoreFromMemento(caretaker.getMemento(1));
		System.out.println("Second saved Article: "+originator.get());

	}

}
