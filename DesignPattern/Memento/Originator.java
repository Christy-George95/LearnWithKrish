package com.christy.designpattern.Memento;

public class Originator {
	private String article;
	
	public void set(String newArticle) {
		System.out.println("From originator: Current Version of Article\n"+ newArticle + "]n");
		article = newArticle;
	}
	
	public String get() {
		return article;
	}
	
	public Memento storeInMemento() {
		System.out.println("From Originator: Saving to Memento");
		return new Memento(article);
	}
	
	public String restoreFromMemento(Memento memento) {
		article = memento.getSavedArticle();
		System.out.println("From Originator: Previous Article Saved in Memento\n"+ article+"\n");
		return article;
	}

}
