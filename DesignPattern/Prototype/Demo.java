package com.christy.designpattern.Prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		BookShop bs = new BookShop();
		bs.setShopName("Durga");
		bs.loadData();
		System.out.println(bs);
		
		BookShop bs1 = (BookShop)bs.clone();
		bs1.setShopName("Karan");
		System.out.println(bs1);

	}

}
