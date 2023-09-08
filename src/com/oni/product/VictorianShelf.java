package com.oni.product;

public class VictorianShelf implements Shelf {
	@Override
	public void store() {
		System.out.println("Store your grandparent's antiques.");
	}

	@Override
	public String getFurniture() {
		return "Victorian shelf";
	}

	@Override
	public void use() {
		store();
	}
}
