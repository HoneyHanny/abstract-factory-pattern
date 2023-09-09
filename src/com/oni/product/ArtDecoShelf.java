package com.oni.product;

public class ArtDecoShelf implements Shelf {
	@Override
	public void store() {
		System.out.println("Store art materials.");
	}

	@Override
	public String getFurniture() {
		return "Art Deco shelf";
	}

	@Override
	public void use() {
		store();
	}
}
