package com.oni.product;

public class ModernShelf implements Shelf {
	@Override
	public void store() {
		System.out.println("Store PC parts.");
	}

	@Override
	public String getFurniture() {
		return "Modern shelf";
	}

	@Override
	public void use() {
		store();
	}
}
